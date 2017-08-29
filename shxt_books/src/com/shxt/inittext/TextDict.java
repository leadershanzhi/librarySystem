package com.shxt.inittext;

import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;


public class TextDict {
    IBaseDao ibd=new BaseDaoImpl();
	public static void main(String[] args) {
		new InitAddDict().addDict();
		new InitAddReader().addReader();
	}
}
