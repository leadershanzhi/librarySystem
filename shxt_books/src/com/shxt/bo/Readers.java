package com.shxt.bo;

public class Readers {
	private int rid;
	private String lname;
	private String rpw;
	private String name;
	private String sex;
	private String birth;
	private String img;
	private String sdept;
    private String mail;
    private String phone;
    private String identity;
    
    

	public Readers(){
    	
    }
    
    





	public Readers(String lname, String rpw, String name) {
		super();
		this.lname = lname;
		this.rpw = rpw;
		this.name = name;
	}



	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRpw() {
		return rpw;
	}

	public void setRpw(String rpw) {
		this.rpw = rpw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
    
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
