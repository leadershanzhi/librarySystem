package com.shxt.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.shxt.action.LoginAction;





public class SessionCheckInterceptor implements Interceptor {
    
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String sessionAttribute;
	private String reloginResult;
	
	public String getSessionAttribute() {
		return sessionAttribute;
	}

	public void setSessionAttribute(String sessionAttribute) {
		this.sessionAttribute = sessionAttribute;
	}

	public String getReloginResult() {
		return reloginResult;
	}

	public void setReloginResult(String reloginResult) {
		this.reloginResult = reloginResult;
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		if(LoginAction.class==invocation.getAction().getClass()){
			return invocation.invoke();
		}
		Map<String,Object> session=invocation.getInvocationContext().getSession();
		
		
		if(session.containsKey(sessionAttribute)){
			String resultCode=invocation.invoke();
			return resultCode;
		}else{
			return reloginResult;
		}
	}

}
