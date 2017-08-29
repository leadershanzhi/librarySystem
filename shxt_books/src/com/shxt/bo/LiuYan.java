package com.shxt.bo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class LiuYan implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lyid;
    private String content;
	private String lytime;
	private Readers re;
	private Set<HuiFu> hfSet = new HashSet<HuiFu>();
	
	
	public int getLyid() {
		return lyid;
	}
	public void setLyid(int lyid) {
		this.lyid = lyid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLytime() {
		return lytime;
	}
	public void setLytime(String lytime) {
		this.lytime = lytime;
	}
	public Readers getRe() {
		return re;
	}
	public void setRe(Readers re) {
		this.re = re;
	}
	public Set<HuiFu> getHfSet() {
		return hfSet;
	}
	public void setHfSet(Set<HuiFu> hfSet) {
		this.hfSet = hfSet;
	}
	
}
