package com.heaven.spring.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.util.Date;

/**
 * Created by whd@zizizizizi.com on 2016/6/20.
 */
@Component
public class JmsMessageProducer {
    private static final Logger logger = LoggerFactory.getLogger(JmsMessageProducer.class);
    @Autowired
    protected JmsTemplate jmsTemplate;
    protected int numberOfMessages = 10;

    public void sendMessages() throws JMSException {
        StringBuilder payload = null;
        for (int i = 0; i < numberOfMessages; ++i) {
            payload = new StringBuilder();
            payload.append("Message [").append(i).append("] sent at: ").append(new Date());
            jmsTemplate.convertAndSend(payload.toString());
            System.out.println("Sending message number [" + i + "]");
        }
    }
}
