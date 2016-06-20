package com.heaven.spring.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

/**
 * Created by whd@zizizizizi.com on 2016/6/17.
 */
@Component
public class MyMessageServiceImpl implements MyMessageService{
    @Autowired
    private JmsOperations jmsOperations;
    public void sendMessage(final String message) {
        jmsOperations.convertAndSend(message);
    }
}
