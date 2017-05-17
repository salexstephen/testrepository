package com.wb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wb.notification.EmailNotification;

@Service
public class NotificationService {

	@Autowired
	private EmailNotification emailNotification;

	public String getHealthStatus() {
		return "";
	}

	public String sendNotification(String content) {
		return emailNotification.sendEmail();
	}
}
