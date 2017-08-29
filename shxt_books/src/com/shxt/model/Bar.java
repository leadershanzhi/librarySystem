package com.shxt.model;

public class Bar {
	private String name;
	private int ratio;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}

	public Bar(String name, int ratio) {
		super();
		this.name = name;
		this.ratio = ratio;
	}

}
