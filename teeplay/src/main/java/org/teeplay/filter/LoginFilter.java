package org.teeplay.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.teeplay.model.account.TableUser;
import org.teeplay.util.TeeUtil;

public class LoginFilter implements Filter {
	
	protected final Logger logger = LoggerFactory.getLogger(LoginFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse rep = (HttpServletResponse) response;
		
//		TeeUser tu = (TeeUser) req.getSession().getAttribute(TeeUtil.SESSION_USER);
//		
//		String uri = req.getRequestURI();
//		if(tu == null && !uri.equals("/")){
//			String path = req.getContextPath();
//			String basePath = request.getScheme() + "://"
//					+ request.getServerName() + ":" + request.getServerPort()
//					+ path;
//			rep.sendRedirect(basePath);
//		}else{
			chain.doFilter(req, rep);
//		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
