package standalone;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.Message;
import org.springframework.integration.core.PollableChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-httpgateway.xml")
public class TestHttpOutboundGateway {
	
	@Autowired @Qualifier("test.channel") PollableChannel testChannel;

	@Test
	public void testHttpOutbound() {
		Message<?> message = testChannel.receive();
		assertThat(message.getPayload(), is(notNullValue()));
	}
	

}
