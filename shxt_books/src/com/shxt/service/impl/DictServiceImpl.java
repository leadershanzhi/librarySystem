package com.shxt.service.impl;

import com.shxt.bo.Dict;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.service.IDictService;

public class DictServiceImpl implements IDictService {
    IBaseDao ibd=new BaseDaoImpl();
	public void addPub(String d) {
		try {
			Dict l=new Dict(d);
			Dict dd=(Dict) ibd.get1(new Dict(), 9);
			l.setDict(dd);
			ibd.save(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addType(String s) {
		try {
			Dict l=new Dict(s);
			Dict d=(Dict) ibd.get1(new Dict(), 1);
			l.setDict(d);
			ibd.save(l);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void delPub(String s) {
		try {
			String hql="select dicid from Dict where dicname='"+s+"'";
			int b=ibd.getOneResult(hql);
			Dict d=(Dict) ibd.get1(new Dict(),b);
			d.setDict(null);
			ibd.delete(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delType(String s) {	
		try {
			String hql="select dicid from Dict where dicname='"+s+"'";
			int b=ibd.getOneResult(hql);
			Dict d=(Dict) ibd.get1(new Dict(),b);
			d.setDict(null);
			ibd.delete(d);
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}

}
