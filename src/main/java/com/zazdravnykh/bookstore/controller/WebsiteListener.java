package com.zazdravnykh.bookstore.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.zazdravnykh.bookstore.factory.HibernateUtil;

public class WebsiteListener implements ServletContextListener {

	public WebsiteListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		HibernateUtil.shutdown();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		HibernateUtil.openEntityManager();
	}

}
