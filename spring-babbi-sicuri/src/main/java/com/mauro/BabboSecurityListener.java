package com.mauro;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;

public class BabboSecurityListener implements ApplicationListener<AbstractAuthenticationFailureEvent> {

	@Override
	public void onApplicationEvent(AbstractAuthenticationFailureEvent event) {
		System.out.println(event.getException().getMessage());
		
	}

}
