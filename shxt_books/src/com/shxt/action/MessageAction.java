package com.shxt.action;

import java.util.List;

import com.shxt.bo.Messages;
import com.shxt.service.IMessageService;
import com.shxt.service.impl.MessageServiceImpl;
import com.shxt.util.BaseAction;
import com.shxt.util.TimeHelper;

public class MessageAction extends BaseAction {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	IMessageService ims=new MessageServiceImpl();
	private Messages m;
	private String content1;
	private List<Object> mlist;
	private String mid;
	
	
	
	public String add(){
		m.setTime(TimeHelper.getSTime());
		m.setContent(content1);
		ims.addMessage(m);
		this.toJsp="successmess";
		return "add";
	}
	public String list(){
		
		mlist=ims.listMessage();
		this.toJsp="messagelist";
		return "list";
	}
	public String show(){
		ims.changePoint(mid);
		m=ims.showMessage(mid);
		this.toJsp="messageshow";
		return "show";
	}
	public Messages getM() {
		return m;
	}

	public void setM(Messages m) {
		this.m = m;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public List<Object> getMlist() {
		return mlist;
	}
	public void setMlist(List<Object> mlist) {
		this.mlist = mlist;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
}
