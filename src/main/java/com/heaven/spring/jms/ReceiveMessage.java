package com.heaven.spring.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;

/**
 * Created by whd@zizizizizi.com on 2016/6/17.
 */
public class ReceiveMessage {
    @Autowired
    private JmsOperations jmsOperations;
    public String receive() {
        return (String)jmsOperations.receiveAndConvert();
    }
}
