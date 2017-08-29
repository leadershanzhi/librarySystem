package com.shxt.service.impl;

import java.util.List;

import com.shxt.bo.Books;
import com.shxt.bo.Lends;
import com.shxt.bo.Readers;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.model.QueryLend;
import com.shxt.service.ILendService;
import com.shxt.util.PageBean;
import com.shxt.util.TimeHelper;

public class LendServiceImpl implements ILendService {
	IBaseDao ibd = new BaseDaoImpl();

	public List<Object> getListre(String cz) {
		int a = ibd.getOneResult("select rid from Readers where lname='" + cz+ "'");
		String hql="from Lends where RID='"+a+"'";
		List<Object> lend=null;
		try {
			lend=ibd.list(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lend;
	}

	public void AddLend(String id) {
		Lends l = (Lends) ibd.get1(new Lends(), Integer.parseInt(id));
		l.setTime1(TimeHelper.getLTime());
		try {
			ibd.update(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void backLend(String id) {
		Lends l = (Lends) ibd.get1(new Lends(), Integer.parseInt(id));
		l.setTime2(TimeHelper.getLTime());
		Books b = l.getBooks();
		int now = b.getNcount() + 1;
		b.setNcount(now);
		try {
			ibd.update(b);
			ibd.update(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertLend(String s1, String s2) {
		int a = ibd.getOneResult("select rid from Readers where lname='" + s2
				+ "'");
		String hql = "from Lends where RID='" + a + "' and time2 is  null";
		String hql1 = "from Lends where RID='" + a + "' and tag ='超期'";
		try {
			List list1 = ibd.list(hql1);
			if (list1.size() == 0) {
				List list = ibd.list(hql);
				if (list.size() < 5) {
					Books b = (Books) ibd.get1(new Books(), Integer
							.parseInt(s1));
					Readers r = (Readers) ibd.get1(new Readers(), a);
					b.setNcount(b.getNcount() - 1);
					b.setLcount(b.getLcount() + 1);
					ibd.update(b);
					Lends l = new Lends();
					l.setBooks(b);
					l.setReaders(r);
					l.setTime1(TimeHelper.getLTime());
					ibd.save(l);
				} else {
					return 0;
				}
			} else {
				return 2;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}

	public void AlterLend() {
		// TODO Auto-generated method stub

	}

	public void DeleteLend() {
		// TODO Auto-generated method stub

	}

	public PageBean query(PageBean pageBean, QueryLend query) throws Exception {
		this.judgeOver();
		StringBuilder pageHql = new StringBuilder("from Lends where 1=1 ");
		if (query != null) {
			if (!"0".equals(query.getBid()) && !"".equals(query.getBid())) {
				pageHql.append(" and BID='" + query.getBid() + "'");
			}
			if (!"0".equals(query.getRid()) && !"".equals(query.getRid())) {
				int a = ibd
						.getOneResult("select rid from Readers where lname='"
								+ query.getRid() + "'");
				pageHql.append(" and RID='" + a + "'");
			}

		}
		pageHql.append(" order by time2 desc,tag asc");
		String str = pageHql.toString();
		// 总记录数
		int totalCount = ibd.getTotalCount(pageHql.toString());
		pageBean.setTotalCount(totalCount);
		// 每页显示的条数
		int pageSize = pageBean.getPageSize() == 0 ? 10 : pageBean
				.getPageSize();
		pageBean.setPageSize(pageSize);
		// 设置当前页
		pageBean.setPageNow(pageBean.getPageNow() == 0 ? 1 : pageBean
				.getPageNow());
		// 设置总页数
		int x = ibd.getCountPage(str, pageBean.getPageSize());
		pageBean.setTotalPages(x);
		// 计算分页其实位置
		int firstResult = (pageBean.getPageNow() - 1) * pageBean.getPageSize();
		List pageList = ibd.cutPage(str, firstResult, pageBean.getPageSize());
		pageBean.setList(pageList);
		return pageBean;
	}

	public void judgeOver() {
		String time2 = TimeHelper.getLTime();
		String hql = "from Lends";
		List list = null;
		try {
			list = ibd.list(hql);
			for (int i = 0; i < list.size(); i++) {
				Lends l = (Lends) list.get(i);
				if (l.getTime2() == null) {
					int t = TimeHelper.getSubtraction(l.getTime1(), time2);
					if (t > 20) {
						l.setTag("超期");
					} else {
						l.setTag("未超");
					}
				} else {
					l.setTag("");
				}
				ibd.update(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
