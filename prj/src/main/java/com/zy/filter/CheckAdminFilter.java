package com.zy.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.util.JavaScriptUtils;

import com.zy.entity.Userinfo;

@WebFilter(urlPatterns="/admin/*",filterName="checkAdminFilter")
public class CheckAdminFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//判断当前用户是否登录
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		
		String path = servletRequest.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		
		Userinfo info = (Userinfo) servletRequest.getSession().getAttribute("userinfo");
		if(info==null) {
			//servletResponse.sendRedirect(basePath+"index.jsp");
			PrintWriter out = response.getWriter();
			out.print("<script language=\"JavaScript\">");
			out.print("parent.window.location=\""+basePath+"index.jsp\";");
			out.print("</script>");
			
		}else {
			chain.doFilter(request, response);
		}
		System.out.println("in filter");
	}

}
