/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package org.teeplay.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class HttpUtils {
	
	public static int COOKIE_TIME = 3600 * 24 * 365 * 2;
	/**
	 * 得到请求的IP地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getIp(HttpServletRequest request) {
		String ip = request.getHeader("X-Real-IP");
		if (TeeUtil.isBlank(ip)) {
			ip = request.getHeader("Host");
		}
		if (TeeUtil.isBlank(ip)) {
			ip = request.getHeader("X-Forwarded-For");
		}
		if (TeeUtil.isBlank(ip)) {
			ip = "0.0.0.0";
		}
		return ip;
	}

	/**
	 * 得到请求的根目录
	 * 
	 * @param request
	 * @return
	 */
	public static String getBasePath(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + path;
		return basePath;
	}

	/**
	 * 得到结构目录
	 * 
	 * @param request
	 * @return
	 */
	public static String getContextPath(HttpServletRequest request) {
		String path = request.getContextPath();
		return path;
	}
	
	/**
	 * 处理返回信息
	 * @param resp
	 * @param o
	 */
	public static void renderJson(HttpServletResponse resp,Object o){
		PrintWriter pw = null;
		try {
			pw = resp.getWriter();
			String json = JSON.toJSONString(o);
			pw.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
				pw.flush();
			}
		}
		
	}
}
