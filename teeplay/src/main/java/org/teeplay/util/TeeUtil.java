package org.teeplay.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;

public class TeeUtil {

	private static Logger logger = Logger.getLogger(TeeUtil.class);

	public static final String SESSION_USER = "teeplay_session_user";

	public static final String COOKIE_USERNAME = "teeplay_cookie_username";

	public static final String COOKIE_PASSWORD = "teeplay_cookie_password";

	public static final String COOKIE_EMAIL = "teeplay_cookie_email";

	public static final String APPLICATION_PROPERTIES = "/env.properties";

	public static String HTML_TITLE;
	public static String COOKIE_DOMAIN;

	public static boolean isNotNullObject(Object o) {
		if (o == null)
			return false;
		return true;
	}

	public static boolean isNullEmpty(Object o) {
		if (o instanceof String) {
			String os = (String) o;
			if (os == null || os.trim().equals("")) {
				return true;
			}
		} else {
			if (o == null) {
				return true;
			}
		}
		return false;
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

	public static void writeToJson(Object obj, HttpServletResponse rep) {
		try {
			String json = JSON.toJSONStringWithDateFormat(obj,
					"yyyy-MM-dd HH:mm:ss");
			// logger.info("[BaseServlet][writeToJson : " + json+"]");
			rep.setContentType("text/html;charset=utf-8");
			rep.getWriter().write(json);
			rep.getWriter().flush();
			rep.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static {
		try {
			InputStream in = TeeUtil.class.getResourceAsStream(APPLICATION_PROPERTIES);
			Properties p = new Properties();
			p.load(in);
			for (Object s : p.keySet()) {
				String key = s.toString();
				if (key != null && key.equals("html.title")) {
					HTML_TITLE = String.valueOf(p.get(key));
				}
				if (key != null && key.equals("cookie.domain")) {
					COOKIE_DOMAIN = String.valueOf(p.get(key));
				}
			}
		} catch (IOException e) {
			logger.debug("加载文件错误 ：application.properties", e);
			e.printStackTrace();
		}
	}
}
