package com.wb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wb.service.NotificationService;

@RestController
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping("/health")
	public String getHealthStatus() {
		//notificationService.getHealthStatus();
		return "health done";
	}

}
