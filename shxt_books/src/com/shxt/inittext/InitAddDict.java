package com.shxt.inittext;

import java.util.Set;

import org.junit.Test;

import com.shxt.bo.Dict;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;

public class InitAddDict {
    
	@Test
	public  void addDict() {

		IBaseDao ibd = new BaseDaoImpl();
		Dict booktype = new Dict("图书类别");
		Dict pubtype=new Dict("出版社");
		Dict sdept=new Dict("系别");
		
		Dict t1 = new Dict("IT计算机");
		Dict t2 = new Dict("农林学科");
		Dict t3 = new Dict("医药生物");
		Dict t4 = new Dict("法律文学");
		Dict t5 = new Dict("历史地理");
		Dict t6 = new Dict("经济教育");
		Dict t7 = new Dict("天文星空");
		t1.setDict(booktype);
		t2.setDict(booktype);
		t3.setDict(booktype);
		t4.setDict(booktype);
		t5.setDict(booktype);
		t6.setDict(booktype);
		t7.setDict(booktype);
		
		
		
		Dict t8 = new Dict("人民教育出版社");
		Dict t9 = new Dict("清华大学出版社");
		Dict t10 = new Dict("电子工业出版社");
		Dict t11 = new Dict("高等教育出版社");
		Dict t12 = new Dict("机械工业出版社");
		Dict t13 = new Dict("科学出版社");
		Dict t14 = new Dict("人民邮电出版社");
		Dict t15 = new Dict("北师大出版社");
		Dict t16 = new Dict("中国农业出版社");
		Dict t17 = new Dict("地质出版社");
		
		t8.setDict(pubtype);
		t9.setDict(pubtype);
		t10.setDict(pubtype);
		t11.setDict(pubtype);
		t12.setDict(pubtype);
		t13.setDict(pubtype);
		t14.setDict(pubtype);
		t15.setDict(pubtype);
		t16.setDict(pubtype);
		t17.setDict(pubtype);
		
		
		Dict t18 = new Dict("计算机学院");
		Dict t19 = new Dict("软件学院");
		Dict t20 = new Dict("电子信息工程学院");
		Dict t21 = new Dict("美术学院");
		Dict t22 = new Dict("管理学院");
		Dict t23 = new Dict("音乐学院");
		
		t18.setDict(sdept);
		t19.setDict(sdept);
		t20.setDict(sdept);
		t21.setDict(sdept);
		t22.setDict(sdept);
		t23.setDict(sdept);
		
		
		Set<Dict> set1=booktype.getDicSet();
		Set<Dict> set2=pubtype.getDicSet();
		Set<Dict> set3=sdept.getDicSet();
		set1.add(t1);
		set1.add(t2);
		set1.add(t3);
		set1.add(t4);
		set1.add(t5);
		set1.add(t6);
		set1.add(t7);
		
		
		set2.add(t8);
		set2.add(t9);
		set2.add(t10);
		set2.add(t11);
		set2.add(t12);
		set2.add(t13);
		set2.add(t14);
		set2.add(t15);
		set2.add(t16);
		set2.add(t17);
		
		set3.add(t18);
		set3.add(t19);
		set3.add(t20);
		set3.add(t21);
		set3.add(t22);
		
		try {
			ibd.save(booktype);
			ibd.save(pubtype);
			ibd.save(sdept);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
