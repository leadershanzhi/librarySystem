package com.shxt.action;



import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.shxt.bo.Readers;
import com.shxt.service.IReaderService;
import com.shxt.service.impl.ReaderServiceImpl;
import com.shxt.util.BaseAction;

public class ReaderAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Readers re;
	IReaderService irs=new ReaderServiceImpl();
	
	private File file;//获取文件内容 对应文件域中的name名字
	private String fileFileName;//例如ww7.gif
	private String fileContentType;//例如imagine/gif
	private String imagePath;
	private String chuanzhi;
	private static String lname;
	private List<Object> revertlist;
	private String sumowe;
	private String lnamee;
	private Readers r;
    private String oldpw;
	private String alterrid;
	private String pwnew;
	
	
	
	public String exist(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("role");
		this.toJsp="index";
		return "exist";
	}
	public String search(){
		r=irs.SearchReader(lname);
		this.toJsp="alterreader";
		return "search";
	}
	public String alter(){
		if(file==null){
			System.out.println("开始为空");
		}else{
			String path = this.servletContext.getRealPath("/upload");
			File file1 = new File(path);
			if (!file1.exists() && !file1.isDirectory()) {
				System.out.println("upload文件夹不存在");
				file1.mkdir();
			}
	         try {  
	        	 String saveFileName = generateFileName(fileFileName);
	             FileUtils.copyFile(file,new File(file1,saveFileName)); 
	             re.setImg("upload/"+saveFileName);      
	          } catch (IOException e) {   	  
	            e.printStackTrace();  
	          } 
		}
		if(!"".equals(pwnew) && ! "".equals(oldpw)){
			re.setRpw(pwnew);
		}
		irs.AlterReader(re);
		this.toJsp="alterreader";
		return "alter";
	}
	public String add(){
		if(file==null){
			System.out.println("开始为空");
		}else{
			String path = this.servletContext.getRealPath("/upload");
			File file1 = new File(path);
			if (!file1.exists() && !file1.isDirectory()) {
				System.out.println("upload文件夹不存在");
				file1.mkdir();
			}
	         try {  
	        	 String saveFileName = generateFileName(fileFileName);
	             FileUtils.copyFile(file,new File(file1,saveFileName)); 
	             re.setImg("upload/"+saveFileName);      
	          } catch (IOException e) {   	  
	            e.printStackTrace();  
	          } 
		}
		this.toJsp="success";
		irs.AddReader(re);
		return "add";
	}
	public String checklname(){
		
		chuanzhi=irs.judgeSame(lname);
		try {
			PrintWriter out = ServletActionContext.getResponse().getWriter();
			if("1".equals(chuanzhi)){
				out.print(true);
			}else{
				out.print(false);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
    public String checklnamee(){
		
		chuanzhi=irs.judgeSame(lname);
		try {
			PrintWriter out = ServletActionContext.getResponse().getWriter();
			if("1".equals(chuanzhi)){
				out.print(false);
			}else{
				out.print(true);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
    public String checkpw(){
    	chuanzhi=irs.judegePw(lname, oldpw);
		try {
			PrintWriter out = ServletActionContext.getResponse().getWriter();
			if("1".equals(chuanzhi)){
				out.print(true);
			}else{
				out.print(false);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String revertmoney(){
		int sum=irs.handleOweMoney(lname);
		lnamee=lname;
		sumowe=(float)sum/10+"";
		revertlist=irs.getOweBooks(lname);
		this.toJsp="revertmoney";
		return "revertmoney";
	}
	
	public String handleowe(){
		irs.handleOwe(lname);
		this.toJsp="success";
		return "handleowe";
	}
	public Readers getRe() {
		return re;
	}
	public void setRe(Readers re) {
		this.re = re;
	}
	public IReaderService getIrs() {
		return irs;
	}
	public void setIrs(IReaderService irs) {
		this.irs = irs;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
    
	public String getChuanzhi() {
		return chuanzhi;
	}
	public void setChuanzhi(String chuanzhi) {
		this.chuanzhi = chuanzhi;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Object> getRevertlist() {
		return revertlist;
	}
	public void setRevertlist(List<Object> revertlist) {
		this.revertlist = revertlist;
	}
	public String getSumowe() {
		return sumowe;
	}
	public void setSumowe(String sumowe) {
		this.sumowe = sumowe;
	}
	public String getLnamee() {
		return lnamee;
	}
	public void setLnamee(String lnamee) {
		this.lnamee = lnamee;
	}

	public Readers getR() {
		return r;
	}
	public void setR(Readers r) {
		this.r = r;
	}
	public String getOldpw() {
		return oldpw;
	}
	public void setOldpw(String oldpw) {
		this.oldpw = oldpw;
	}
	public String getAlterrid() {
		return alterrid;
	}
	public void setAlterrid(String alterrid) {
		this.alterrid = alterrid;
	}
	public String getPwnew() {
		return pwnew;
	}
	public void setPwnew(String pwnew) {
		this.pwnew = pwnew;
	}
}
