package org.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class TestController {

	@Autowired
	private SendService sendService;
	
	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public String send() {
		//利用這裡的MessageBuilder發送消息
		Message msg = MessageBuilder.withPayload("Hello World 2 ".getBytes()).build();
		sendService.sendOrder().send(msg);
		return "success";
	}
}
