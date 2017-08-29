/**
 * 
 */
package com.shxt.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;



public class BaseAction extends ActionSupport implements SessionAware, ServletRequestAware,
		ServletResponseAware, ServletContextAware {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Map<String, Object> session;
	
	protected HttpServletRequest request;
	
	protected HttpServletResponse response;
	
	protected ServletContext servletContext;
	
	/**设置跳转JSP的转向标*/
	protected String toJsp;

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
		
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	
	
	public String getToJsp() {
		return toJsp;
	}
	public void setToJsp(String toJsp) {
		this.toJsp = toJsp;
	}
	/**
	 * 
	 * @param fileName
	 * @return String
	 */
	protected String generateFileName(String fileName) {    
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");    
        String formatDate = format.format(new Date());    
            
        int random = new Random().nextInt(10000);    
            
        int position = fileName.lastIndexOf(".");    
        String extension = fileName.substring(position);    
            
        return formatDate + random + extension;    
    }   
	
	public String FormetFileSize(long fileS) {//转换文件大小
	       DecimalFormat df = new DecimalFormat("#.00");
	       String fileSizeString = "";
	       if (fileS < 1024) {
	           fileSizeString = df.format((double) fileS) + "B";
	       } else if (fileS < 1048576) {
	           fileSizeString = df.format((double) fileS / 1024) + "KB";
	       } else if (fileS < 1073741824) {
	           fileSizeString = df.format((double) fileS / 1048576) + "MB";
	       } else {
	           fileSizeString = df.format((double) fileS / 1073741824) +"GB";
	       }
	       return fileSizeString;
	    }


}
