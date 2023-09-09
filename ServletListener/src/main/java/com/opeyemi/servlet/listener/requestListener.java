package com.opeyemi.servlet.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class requestListener implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("Request Created");
	}

	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("Request Destroyed");
	}

}
