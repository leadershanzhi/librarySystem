package com.shxt.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.shxt.bo.Books;
import com.shxt.bo.Dict;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.model.Bar;
import com.shxt.model.QueryBook;
import com.shxt.service.IBookService;
import com.shxt.util.PageBean;

public class BookServiceImpl implements IBookService {
    IBaseDao ibd=new BaseDaoImpl();
    
    public List<Bar> getBar() {
    	Long a=ibd.getOneResultCount("select count(*) from Books");
		List<Bar> result=new LinkedList<Bar>();
		List<Object> list;
		String type="";
		int ratio;
		try {
			list = ibd.list("select type,count(*) from Books  group by type");
			for(int i=0;i<list.size();i++){
	    		Object[] obj=(Object[]) list.get(i);
	    		type=obj[0].toString();
	    		float percent=Float.parseFloat((obj[1].toString()));
	    		ratio=(int)(percent/a*100);
	    		result.add(new Bar(type,ratio));
	    	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public void AddBook(Books b) {
		try {
			ibd.save(b);
		} catch (Exception e) {
			System.out.println("保存图书时出错！");
			e.printStackTrace();
		}
	}
	public List<Object> getRankBook() {
		String hql="from Books order by lcount desc";
		List<Object> rank=null;
		try {
			rank=ibd.list(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rank;
	}
	public void AlterBook(Books b) {
		try {
			ibd.update(b);
		} catch (Exception e) {
			System.out.println("修改图书出错");
		}
	}
    
	public Books getBook(int x) {
		Books b=(Books) ibd.get1(new Books(), x);
		return b;
	}
	public void DeleteBook(int i) {
		Books b=(Books) ibd.get1(new Books(), i);
        try {
			ibd.delete(b);
		} catch (Exception e) {
			System.out.println("删除图书出错！");
			e.printStackTrace();
		}
	}

	public void SearchBook() {
		// TODO Auto-generated method stub

	}

	public PageBean query(PageBean pageBean, QueryBook query) throws Exception {
		StringBuilder pageHql = new StringBuilder("from Books where 1=1 ");
		
		if(query!=null){
			if(query.getBname()!=null&&!"".equals(query.getBname())){
				pageHql.append(" and name like '%"+query.getBname()+"%' ");
			}
			
			if(query.getAuthor()!=null&&!"".equals(query.getAuthor())){
				pageHql.append(" and author like '%"+query.getAuthor()+"%' ");
			}
			if(!"0".equals(query.getPub()) && !"".equals(query.getPub())){
				pageHql.append(" and pub='"+query.getPub()+"'");
			}
			if(!"0".equals(query.getBtype())&& !"".equals(query.getBtype())){
				pageHql.append(" and type='"+query.getBtype()+"'");
			}
			
		}
		String str=pageHql.toString();
		//总记录数
		int totalCount = ibd.getTotalCount(pageHql.toString());
		pageBean.setTotalCount(totalCount);
		//每页显示的条数
		int pageSize = pageBean.getPageSize()==0?10:pageBean.getPageSize();
		pageBean.setPageSize(pageSize);
		//设置当前页
		pageBean.setPageNow(pageBean.getPageNow()==0?1:pageBean.getPageNow());
		// 设置总页数
		int x=ibd.getCountPage(str, pageBean.getPageSize()); 	
		pageBean.setTotalPages(x);  
		// 计算分页其实位置
		int firstResult = (pageBean.getPageNow()-1)*pageBean.getPageSize();
		List  pageList = ibd.cutPage(str, firstResult, pageBean.getPageSize());
		pageBean.setList(pageList);
		return pageBean;
	}

	
	
	public Set<Dict> getAllPub() {
		Dict booktype= (Dict)ibd.get1(new Dict(), 9);
		Set<Dict> set=booktype.getDicSet();
		return set;
	}

	public Set<Dict> getAllType() {
		Dict booktype= (Dict)ibd.get1(new Dict(), 1);
		Set<Dict> set=booktype.getDicSet();
		return set;
	}
}
