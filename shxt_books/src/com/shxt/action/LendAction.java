package com.shxt.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.shxt.bo.Lends;
import com.shxt.model.InsertLend;
import com.shxt.model.QueryLend;
import com.shxt.service.ILendService;
import com.shxt.service.IReaderService;
import com.shxt.service.impl.LendServiceImpl;
import com.shxt.service.impl.ReaderServiceImpl;
import com.shxt.util.BaseAction;
import com.shxt.util.PageBean;

public class LendAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private QueryLend query;
	private PageBean pageBean;
	private String lendid;
	private InsertLend il;
	private String cz;
    private List<Object> listre;
	private String chuanzhi;
	IReaderService irs = new ReaderServiceImpl();
	ILendService ils = new LendServiceImpl();

	public String search() {
		if (pageBean == null) {
			pageBean = new PageBean();
			pageBean.setPageNow(1);
		}
		if(cz==null){
			try {
				pageBean = ils.query(pageBean, query);
				this.toJsp = "pagelend";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			listre=ils.getListre(cz);
		    this.toJsp = "pagelendre";
			
		}
		

		return "search";
	}

	public String cont() {
		ils.AddLend(lendid);
		this.toJsp = "rightsearchlend";
		return "cont";
	}

	public String back() {
		ils.backLend(lendid);
		this.toJsp = "rightsearchlend";
		return "back";
	}

	public String checkrid() {
		chuanzhi = irs.judgeExist(lendid);
		try {
			PrintWriter out = ServletActionContext.getResponse().getWriter();
			if ("1".equals(chuanzhi)) {
				out.print(true);
			} else {
				out.print(false);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String lend() {
		int x = ils.insertLend(il.getBid(), il.getRid());
		if (x == 1) {
			this.toJsp = "rightsearchlend";
		} else if (x == 2) {
			this.toJsp = "own";
		} else {
			this.toJsp = "fail";
		}
		return "lend";
	}

	public QueryLend getQuery() {
		return query;
	}

	public void setQuery(QueryLend query) {
		this.query = query;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public String getLendid() {
		return lendid;
	}

	public void setLendid(String lendid) {
		this.lendid = lendid;
	}

	public InsertLend getIl() {
		return il;
	}

	public void setIl(InsertLend il) {
		this.il = il;
	}

	public String getChuanzhi() {
		return chuanzhi;
	}

	public void setChuanzhi(String chuanzhi) {
		this.chuanzhi = chuanzhi;
	}

	public String getCz() {
		return cz;
	}

	public void setCz(String cz) {
		this.cz = cz;
	}
	
	public List<Object> getListre() {
		return listre;
	}

	public void setListre(List<Object> listre) {
		this.listre = listre;
	}
}
