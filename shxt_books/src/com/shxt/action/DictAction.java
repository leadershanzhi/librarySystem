package com.shxt.action;

import com.shxt.service.IDictService;
import com.shxt.service.impl.DictServiceImpl;
import com.shxt.util.BaseAction;

public class DictAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ss;
	IDictService ids=new DictServiceImpl();
	
	
	public String deltype(){
		ids.delType(ss);
		this.toJsp="handledict";
		return "deltype";
	}
	public String delpub(){
		ids.delPub(ss);
		this.toJsp="handledict";
		return "delpub";
	}
	public String addtype(){
		ids.addType(ss);
		this.toJsp="handledict";
		return "addtype";
	}
	public String addpub(){
		ids.addPub(ss);
		this.toJsp="handledict";
		return "addpub";
	}
	public String getSs() {
		return ss;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}
}
