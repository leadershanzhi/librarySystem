package com.shxt.inittext;

import com.shxt.bo.Readers;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;

public class InitAddReader {

	/**
	 * @param args
	 */
	static IBaseDao ibd=new BaseDaoImpl();
	public void addReader() {
		Readers r1=new Readers("1","1","单智");
		try {
			ibd.save(r1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
