import com.heaven.spring.jms.JmsMessageConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;

/**
 * Created by whd@zizizizizi.com on 2016/6/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class JmsMessageConsumerTest {
    @Autowired
    JmsMessageConsumer jmsMessageConsumer;
    @Test
    public void testSend(){
        try {
            jmsMessageConsumer.receiveMessages();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
