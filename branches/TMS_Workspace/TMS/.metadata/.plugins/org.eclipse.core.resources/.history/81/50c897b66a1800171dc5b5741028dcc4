package com.tutorials4u.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts2.ServletActionContext;
 
import com.opensymphony.xwork2.ActionSupport;
 
public class AjaxAction extends ActionSupport {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name = null;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String loadData() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter out = response.getWriter();
        out.println("Hello " + getName());
        out.flush();
        // return null;
 
        return SUCCESS;
 
    }
 
}