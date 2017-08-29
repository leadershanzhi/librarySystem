package com.shxt.bo;

import java.io.Serializable;

public class HuiFu implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hfid;
	private String content;
	private String hftime;
	private LiuYan ly;
	public int getHfid() {
		return hfid;
	}
	public void setHfid(int hfid) {
		this.hfid = hfid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHftime() {
		return hftime;
	}
	public void setHftime(String hftime) {
		this.hftime = hftime;
	}
	public LiuYan getLy() {
		return ly;
	}
	public void setLy(LiuYan ly) {
		this.ly = ly;
	}	
}
