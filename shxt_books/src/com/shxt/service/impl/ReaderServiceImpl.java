package com.shxt.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.shxt.bo.Dict;
import com.shxt.bo.Lends;
import com.shxt.bo.Readers;
import com.shxt.dao.IBaseDao;
import com.shxt.dao.impl.BaseDaoImpl;
import com.shxt.model.Bar;
import com.shxt.model.Role;
import com.shxt.service.IReaderService;
import com.shxt.util.TimeHelper;

public class ReaderServiceImpl implements IReaderService {

	IBaseDao ibd=new BaseDaoImpl();
	
	public String judegePw(String s1, String s2) {
		String s="select rpw from Readers where lname='"+s1+"'";
		String pw=ibd.getOneResultString(s);
		if(s2.equals(pw)){
			return "1";
		}else{
			return "0";
		}
	}
	public List<Bar> getPie() {
		Long a=ibd.getOneResultCount("select count(*) from Readers");
		List<Bar> result=new LinkedList<Bar>();
		List<Object> list;
		String type="";
		int ratio;
		try {
			list = ibd.list("select identity,count(*) from Readers  group by identity");
			for(int i=0;i<list.size();i++){
	    		Object[] obj=(Object[]) list.get(i);
	    		type=obj[0].toString();
	    		float percent=Float.parseFloat((obj[1].toString()));
	    		ratio=(int)(percent/a*100);
	    		result.add(new Bar(type,ratio));
	    	}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public String judgeExist(String s) {
		String hql="from Readers where lname='"+s+"'";
		try {
			List list=ibd.list(hql);
			if(list.size()==0){
				return "0";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "1";
	}
	public int handleOweMoney(String s) {
		int a=ibd.getOneResult("select rid from Readers where lname='"+s+"'");
		String hql="from Lends where RID='"+a+"' and tag ='超期'";
		List revert=null;
		int sumowe=0;
		try {
			revert=ibd.list(hql);
			for(int i=0;i<revert.size();i++){
				Lends l=(Lends) revert.get(i);
				int x=TimeHelper.getSubtraction(l.getTime1(), TimeHelper.getLTime());
				sumowe+=x/5;
				l.setOwemoney(x/5+"");
				ibd.update(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sumowe;
	}
	public void handleOwe(String s) {
		int a=ibd.getOneResult("select rid from Readers where lname='"+s+"'");
		String hql="from Lends where RID='"+a+"' and tag ='超期'";
		List revert=null;
		try {
			revert=ibd.list(hql);
			for(int i=0;i<revert.size();i++){
				Lends l=(Lends) revert.get(i);
				l.setOwemoney("");
				l.setTag("");
				l.setTime2(TimeHelper.getLTime());
				ibd.update(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Object> getOweBooks(String s) {
		int a=ibd.getOneResult("select rid from Readers where lname='"+s+"'");
		String hql="from Lends where RID='"+a+"' and tag ='超期'";
		List revert=null;
		try {
			revert=ibd.list(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return revert;
	}
    public String judgeSame(String s) {
    	String hql="from Readers where lname='"+s+"'";
		try {
			List list=ibd.list(hql);
			if(list.size()==0){
				return "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "0";
	}
	

	public Readers checkReader(Role role) {
		String hql = "from Readers where lname=? and rpw=?";
		Object obj[] = new Object[] { role.getUsername(), role.getPassword() };
		Readers r= null;
		try {
			List list = ibd.list(hql, obj);
			if (list.size() != 0) {
				r = (Readers) list.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	public Set<Dict> getAllSdept() {
		Dict booktype= (Dict)ibd.get1(new Dict(), 20);
		Set<Dict> set=booktype.getDicSet();
		return set;
	}
	

	public void AddReader(Readers r) {
        try {
			ibd.save(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
}

public void AlterReader(Readers re) {
	try {
		ibd.update(re);
	} catch (Exception e) {
		System.out.println("修改读者出错");
	}
}

public void DeleteReader() {
	// TODO Auto-generated method stub

}

public Readers SearchReader(String s) {
	String hql = "from Readers where lname='"+s+"'";
	Readers r= null;
	try {
		List list = ibd.list(hql);
		if (list.size() != 0) {
			r = (Readers) list.get(0);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return r;
}


	
	
	

}
