package com.shxt.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.shxt.bo.Books;
import com.shxt.model.QueryBook;
import com.shxt.service.IBookService;
import com.shxt.service.impl.BookServiceImpl;
import com.shxt.util.BaseAction;
import com.shxt.util.PageBean;

public class BookAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private QueryBook query;
	private PageBean pageBean;
	private String id;
	private IBookService ibs=new BookServiceImpl();
	private Books book;
	private File file;//获取文件内容 对应文件域中的name名字
	private String fileFileName;//例如ww7.gif
	private String fileContentType;//例如imagine/gif
	private String imagePath;
    private List<Object> rankbook;
	private Books alterbook;
    private Books lendbook;

	
	public String ranklend(){
		rankbook=ibs.getRankBook();
		this.toJsp="ranklend";
		return "ranklend";
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
	             book.setBpic("upload/"+saveFileName);      
	          } catch (IOException e) {   	  
	            e.printStackTrace();  
	          } 
		}
		this.toJsp="success";
		ibs.AddBook(book);
		return "add";
	}
    
    
    public String search(){
		
		if (pageBean == null) {
			pageBean = new PageBean();
			pageBean.setPageNow(1);
		}
		
		try {
			pageBean = ibs.query(pageBean, query);
			this.toJsp="pagebook";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "search";
	}
	
	public String del(){	
		ibs.DeleteBook(Integer.parseInt(id));
		this.toJsp="pagebook";
		return "del";
	}
	
	public String alter(){
		alterbook=ibs.getBook(Integer.parseInt(id));
		this.toJsp="alterbook";
		return "alter";
	}
	
	public String alterr(){
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
	             book.setBpic("upload/"+saveFileName);      
	          } catch (IOException e) {   	  
	            e.printStackTrace();  
	          } 
		}
		ibs.AlterBook(book);
		this.toJsp="rightsearch";
		return "alterr";
	}
	
	public String lend(){
		lendbook=ibs.getBook(Integer.parseInt(id));
		this.toJsp="lendbook";
		return "lend";
	}
	
	
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
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
	
	
	public QueryBook getQuery() {
		return query;
	}
	public void setQuery(QueryBook query) {
		this.query = query;
	}
	public PageBean getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Books getAlterbook() {
		return alterbook;
	}


	public void setAlterbook(Books alterbook) {
		this.alterbook = alterbook;
	}
	
	public Books getLendbook() {
		return lendbook;
	}


	public void setLendbook(Books lendbook) {
		this.lendbook = lendbook;
	}
	
	public List<Object> getRankbook() {
		return rankbook;
	}
	public void setRankbook(List<Object> rankbook) {
		this.rankbook = rankbook;
	}
}
