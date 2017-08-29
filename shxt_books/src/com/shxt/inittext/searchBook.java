package com.shxt.inittext;

import java.util.Set;

import com.shxt.bo.Dict;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;

public class searchBook {

	/**
	 * @param args
	 */
	static IBaseDao ibd=new BaseDaoImpl();
	public static void main(String[] args) {
		Dict booktype= (Dict)ibd.get1(new Dict(), 1);
		Set<Dict> set=booktype.getDicSet();
		for(Dict d:set){
			System.out.println(d.getDicname());
		}
	}

}
