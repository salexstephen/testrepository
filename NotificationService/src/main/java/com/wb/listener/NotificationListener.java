package com.wb.listener;

import org.springframework.beans.factory.annotation.Autowired;

import com.wb.service.NotificationService;

public class NotificationListener {

	@Autowired
	private NotificationService notificationService;
	
	public void processMessage(String msg){
		notificationService.sendNotification(msg);
	}

}
