package com.shxt.inittext;

import java.util.List;
import java.util.Set;

import com.shxt.bo.HuiFu;
import com.shxt.bo.LiuYan;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;

public class Text {
	static IBaseDao ibd = new BaseDaoImpl();
	
	public static void main(String[] args) throws Exception {
		LiuYan ly=(LiuYan) ibd.get1(new LiuYan(), 42);
		Set<HuiFu> set=ly.getHfSet();
		for(HuiFu hf:set){
			ibd.delete(hf);
		}
		ibd.delete(ly);
	}
	
	
	
	
	
	
	
	
	
	/*LiuYan ly=new LiuYan();
	ly.setContent("good");
	HuiFu hf=new HuiFu();
	hf.setContent("yeah");
	hf.setLy(ly);
	try {
		ibd.save(hf);
		ibd.save(ly);
	} catch (Exception e) {
		e.printStackTrace();
	}*/
}
