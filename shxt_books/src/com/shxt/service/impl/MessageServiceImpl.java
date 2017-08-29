package com.shxt.service.impl;

import java.util.List;

import com.shxt.bo.Messages;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.service.IMessageService;

public class MessageServiceImpl implements IMessageService {
	IBaseDao ibd=new BaseDaoImpl();
	public void changePoint(String mid) {
		Messages m=(Messages) ibd.get1(new Messages(), Integer.parseInt(mid));
		try {
			m.setPoint(m.getPoint()+1);
			ibd.update(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void addMessage(Messages m) {
		try {
			ibd.save(m);
		} catch (Exception e) {
			System.out.println("保存图书时出错！");
			e.printStackTrace();
		}
	}
	public List<Object> listMessage() {
		String hql = "from Messages order by time desc";
		List<Object> list=null;
		try {
		    list = ibd.list(hql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public Messages showMessage(String mid) {
		String hql = "from Messages where mid='"+mid+"'";
		Messages m= null;
		try {
			List list = ibd.list(hql);
			if (list.size() != 0) {
				m = (Messages) list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}
	
	

}
