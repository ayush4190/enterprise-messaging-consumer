package com.sap.enterprisemessagingconsumer.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.messaging.TopicMessageEventContext;

@Component
public class ConsumerHandler implements EventHandler{
	

	private static final Logger logger = LoggerFactory.getLogger(ConsumerHandler.class);

	@On(service = "messaging", event = "com/eventmesh/blog/StudentEnrolled")
	public void listen(TopicMessageEventContext context) {
		
		logger.info("---------------------------Reading Payload Emitted by the Event in another CAP based Microservice----------------------------------------------------");
		
        logger.info("checking if the message if read from SAP Event Mesh {}",context.getIsInbound().toString());
		logger.info("reading event id{}",context.getMessageId());
		logger.info("reading event data{}", context.getData());
	}

}
