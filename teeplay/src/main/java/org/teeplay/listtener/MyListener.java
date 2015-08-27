package org.teeplay.listtener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener implements ServletContextListener {
	
	private static Logger logger = LoggerFactory.getLogger(MyListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		logger.info("[MyListener]=======contextInitialized========");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		logger.info("[MyListener]=======contextDestroyed========");
	}

}
