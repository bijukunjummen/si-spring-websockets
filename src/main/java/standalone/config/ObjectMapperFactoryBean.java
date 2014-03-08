package standalone.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.integration.support.json.Jackson2JsonObjectMapper;

public class ObjectMapperFactoryBean implements FactoryBean<Jackson2JsonObjectMapper> {
	@Override
	public Jackson2JsonObjectMapper getObject() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return new Jackson2JsonObjectMapper(objectMapper);
	}

	@Override
	public Class<?> getObjectType() {
		return Jackson2JsonObjectMapper.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
