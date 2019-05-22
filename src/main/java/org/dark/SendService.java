package org.dark;

import org.springframework.messaging.SubscribableChannel;
import org.springframework.cloud.stream.annotation.Output;

public interface SendService {

	//最終消息中間件會向這個myInput通道發送消息。
	@Output("myInput")
	SubscribableChannel sendOrder();
}
