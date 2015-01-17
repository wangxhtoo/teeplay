package org.teeplay.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class TeeUtil {
	
	public static final String SESSION_USER = "teeplay_session_user";
	
	public static final String COOKIE_USERNAME = "teeplay_cookie_username";
	
	public static final String COOKIE_PASSWORD = "teeplay_cookie_password";
	
	public static final String COOKIE_EMAIL = "teeplay_cookie_email";
	
	public static boolean isNotNullObject(Object o){
		if(o == null)
			return false;
		return true;
	}
	
	public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
	
	public static void writeToJson(Object obj,HttpServletResponse rep){
		try {
			String json = JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss");
//			logger.info("[BaseServlet][writeToJson : " + json+"]");
			rep.setContentType("text/html;charset=utf-8");
			rep.getWriter().write(json);
			rep.getWriter().flush();
			rep.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
