package com.shxt.inittext;

import com.shxt.bo.Books;
import com.shxt.bo.Lends;
import com.shxt.bo.Readers;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.util.TimeHelper;

public class InitAddLend {
	static IBaseDao ibd=new BaseDaoImpl();
	public static void main(String[] args) {
		Books b=(Books) ibd.get1(new Books(), 103);
		Readers r=(Readers)ibd.get1(new Readers(), 1);
		Lends l=new Lends();
		l.setBooks(b);
		l.setReaders(r);
	    l.setTime1(TimeHelper.getLTime());
	    l.setTime2(TimeHelper.getLTime());
		try {
			ibd.save(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
