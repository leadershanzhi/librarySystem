package com.shxt.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.shxt.bo.Readers;
import com.shxt.model.Role;
import com.shxt.service.IReaderService;
import com.shxt.service.impl.ReaderServiceImpl;
import com.shxt.util.BaseAction;

public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Role role;
	private String id;
	private String roletype;
	
	

	public String execute(){
		IReaderService irs=new ReaderServiceImpl();
		Readers r=null;
		if("管 理 员".equals(roletype)){
			if("admin".equals(role.getUsername())&& "admin".equals(role.getPassword())){
				r=new Readers();
				r.setLname("admin");
				r.setIdentity("admin");
				r.setName("管理员");
				Map<String ,Object> session=ActionContext.getContext().getSession();
				session.put("role", "admin");
			}
		}else{
			r=irs.checkReader(role);
		}
		
		
		if(r!=null){
			Map<String ,Object> session=ActionContext.getContext().getSession();
	    	session.put("user_session", r);
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String sel(){
		return "sel";
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoletype() {
		return roletype;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
