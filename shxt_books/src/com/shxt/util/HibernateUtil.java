package com.shxt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	/**
	 * @param args
	 */
	private static Configuration cfg=null;
	private static SessionFactory sf=null;
	
	static {
		
		cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}


    public static Session getSession(){
    	return sf.openSession();
    }
	public void executeUpdate(String hql, String[] parameters) {
		// TODO Auto-generated method stub
		
	}
}
