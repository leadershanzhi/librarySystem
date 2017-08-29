package com.shxt.bo;

public class Lends {
	private int lid;
	
	private String time1;
	private String time2;
	private String tag;
	private Books books;
	private Readers readers;
	private String owemoney;
	
	

	public Lends(){
		
	}
	
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public Readers getReaders() {
		return readers;
	}
	public void setReaders(Readers readers) {
		this.readers = readers;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getTime2() {
		return time2;
	}
	public void setTime2(String time2) {
		this.time2 = time2;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getOwemoney() {
		return owemoney;
	}

	public void setOwemoney(String owemoney) {
		this.owemoney = owemoney;
	}
}
