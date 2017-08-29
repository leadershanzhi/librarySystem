package com.shxt.bo;

import java.util.HashSet;
import java.util.Set;

public class Dict {
	private int dicid;
	private String dicname;
	private Dict dict;
	private Set<Dict> dicSet = new HashSet<Dict>();
    
    public Dict(){
    	
    }
	public Dict(String dicname) {
		super();
		this.dicname = dicname;
	}

	public int getDicid() {
		return dicid;
	}

	public void setDicid(int dicid) {
		this.dicid = dicid;
	}

	public String getDicname() {
		return dicname;
	}

	public void setDicname(String dicname) {
		this.dicname = dicname;
	}

	public Dict getDict() {
		return dict;
	}

	public void setDict(Dict dict) {
		this.dict = dict;
	}

	public Set<Dict> getDicSet() {
		return dicSet;
	}

	public void setDicSet(Set<Dict> dicSet) {
		this.dicSet = dicSet;
	}
}
