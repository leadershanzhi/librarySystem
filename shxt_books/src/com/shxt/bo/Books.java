package com.shxt.bo;

public class Books {
	private int bid;
	private String isbn;
	private String name;
	private int ncount;
	private int lcount;
	private String type;
	private String pub;
	private String author;
	private String btime;
	private String bpic;
	
	

	public Books(){
		
	}
	
	public Books(String isbn, String name, int ncount, int lcount, String type,
			String pub, String author, String btime) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.ncount = ncount;
		this.lcount = lcount;
		this.type = type;
		this.pub = pub;
		this.author = author;
		this.btime = btime;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNcount() {
		return ncount;
	}

	public void setNcount(int ncount) {
		this.ncount = ncount;
	}

	public int getLcount() {
		return lcount;
	}

	public void setLcount(int lcount) {
		this.lcount = lcount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBtime() {
		return btime;
	}

	public void setBtime(String btime) {
		this.btime = btime;
	}

	public String getBpic() {
		return bpic;
	}

	public void setBpic(String bpic) {
		this.bpic = bpic;
	}
	
}
