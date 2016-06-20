package com.heaven.spring.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

/**
 * Created by whd@zizizizizi.com on 2016/6/20.
 */
@Component
public class JmsMessageConsumer {
    private static final Logger logger = LoggerFactory.getLogger(JmsMessageProducer.class);
    @Autowired
    private JmsTemplate template;
    public void receiveMessages() throws JMSException {
        Message message =template.receive();
        TextMessage textMessage =(TextMessage)template.receive();
        System.out.println(textMessage.getText());
    }
}
