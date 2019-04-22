package com.zy.aop;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zy.entity.Tree;
import com.zy.entity.Userinfo;

@Component
@Aspect
public class CheckPowerAop{
	//@Around("* execution(com.zy.controller.*(..))")
	@Around("execution(* com.zy.controller.*.*.*(..))")
	public Object check(ProceedingJoinPoint point) throws Throwable {
		// 用户请求的地址	对到目录上
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes)requestAttributes).getResponse();
		
		String requestPath = request.getServletPath();
//		System.out.println(requestPath);
		requestPath = requestPath.substring(0,requestPath.lastIndexOf("/"));
		// 该用户目前所具有的权限地址	对到目录上
		Userinfo info = (Userinfo) request.getSession().getAttribute("userinfo");
		if (info!=null&&info.getTrees()!=null) {
			List<Tree> trees = info.getTrees();
			for (Tree tree : trees) {
				if (tree.getFile()!=null&&tree.getFile().indexOf("/")!=-1) {
					String targetPath = tree.getFile().substring(0, tree.getFile().lastIndexOf("/"));
					if (requestPath.equals(targetPath)) {
						Object proceed = point.proceed();
						return proceed;
					}
				}
			}
		}
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//		System.out.println(basePath+"admin/error.jsp");
//		response.sendRedirect(basePath+"admin/error.jsp");
		return "redirect:../error.jsp";
	}
}
