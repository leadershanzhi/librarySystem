package com.shxt.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.shxt.bo.HuiFu;
import com.shxt.bo.LiuYan;
import com.shxt.bo.Readers;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.service.ILiuHuiService;

public class LiuHuiServiceImpl implements ILiuHuiService {
    static IBaseDao ibd=new BaseDaoImpl();
	public void addHuiFu(HuiFu hf,String id) {
		try {
			LiuYan ly=(LiuYan)ibd.get1(new LiuYan(), Integer.parseInt(id));
			hf.setLy(ly);
			ibd.save(hf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addLiuYan(LiuYan ly) {
		Map<String, Object> session = ActionContext.getContext().getSession();
		Readers re=(Readers) session.get("user_session");
		ly.setRe(re);
		
         try {
			ibd.save(ly);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Object> getAllLiuYan() {
		String hql="from LiuYan order by lytime desc";
		List list=null;
		try {
			list=ibd.list(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Object> getSelfLiuYan() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		Readers re=(Readers) session.get("user_session");
		String hql="from LiuYan where LY_RE='"+re.getRid()+"'";
		List list=null;
		try {
			list=ibd.list(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void delLiuYan(String s) {
		LiuYan ly=(LiuYan) ibd.get1(new LiuYan(), Integer.parseInt(s));
		Set<HuiFu> set=ly.getHfSet();
		for(HuiFu hf:set){
			try {
				ibd.delete(hf);
			} catch (Exception e) {
				System.out.println("删除回复出错");
				e.printStackTrace();
			}
		}
		try {
			ibd.delete(ly);
		} catch (Exception e) {
			System.out.println("删除留言出错");
			e.printStackTrace();
		}
	}

}
