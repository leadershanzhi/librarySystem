package com.shxt.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration cfg=new Configuration().configure();
	    SchemaExport se=new SchemaExport(cfg);
	    
	    try {
	    	se.create(true,true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
