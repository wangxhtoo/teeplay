package org.teeplay.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.teeplay.model.account.User;
import org.teeplay.util.HttpUtils;
import org.teeplay.util.TeeUtil;

public class TeeplayGlobalInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		if (null == modelAndView) {
			return;
		}
		User tUser = (User) request.getSession().getAttribute(TeeUtil.SESSION_USER);
		if (tUser == null) {
			modelAndView.addObject("isAdmin", false);
		} else {
			modelAndView.addObject("isAdmin", true);
		}
		// 系统配置参数
		String basePath = HttpUtils.getBasePath(request);
		String contextPath = HttpUtils.getContextPath(request);
		modelAndView.addObject("basePath", basePath);
		modelAndView.addObject("contextPath", contextPath);
		MDC.put("ip", HttpUtils.getIp(request));
	
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
