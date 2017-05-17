package com.wb.notification;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification {
	
	public String sendEmail(){
		return "mail";
	}
}
