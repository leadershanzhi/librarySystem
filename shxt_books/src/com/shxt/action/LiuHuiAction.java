package com.shxt.action;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.shxt.bo.HuiFu;
import com.shxt.bo.LiuYan;
import com.shxt.bo.Readers;
import com.shxt.service.ILiuHuiService;
import com.shxt.service.impl.LiuHuiServiceImpl;
import com.shxt.util.BaseAction;
import com.shxt.util.TimeHelper;

public class LiuHuiAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ILiuHuiService ilh=new LiuHuiServiceImpl();
	private List<Object> listall;
	private LiuYan ly;
	private String content;
	private String lyid;
	private HuiFu hf;
	
	
    public String del(){
    	ilh.delLiuYan(lyid);
    	this.toJsp="successliuhui";
    	return "del";
    }
    public String dell(){
    	ilh.delLiuYan(lyid);
    	this.toJsp="successliuhui1";
    	return "dell";
    }
	public String addly(){
		ly.setLytime(TimeHelper.getLTime());
	    ilh.addLiuYan(ly);
		this.toJsp="successliuhui1";
		return "addly";
	}
	public String addhf(){
		hf.setHftime(TimeHelper.getLTime());
		ilh.addHuiFu(hf,lyid);
		this.toJsp="successliuhui";
		return "addhf";
	}
	public String searchall(){
		listall=ilh.getAllLiuYan();
		this.toJsp="liuhui";
		return "searchall";
	}
	
	public String searchself(){
		listall=ilh.getSelfLiuYan();
		this.toJsp="liuhui";
		return "searchself";
	}
	
	public List<Object> getListall() {
		return listall;
	}
	public void setListall(List<Object> listall) {
		this.listall = listall;
	}
	public LiuYan getLy() {
		return ly;
	}
	public void setLy(LiuYan ly) {
		this.ly = ly;
	}
	public HuiFu getHf() {
		return hf;
	}
	public void setHf(HuiFu hf) {
		this.hf = hf;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLyid() {
		return lyid;
	}
	public void setLyid(String lyid) {
		this.lyid = lyid;
	}
}
