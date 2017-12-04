package com.imadcn.framework.otter.schema;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.imadcn.framework.otter.listener.SimpleMessageListenerContainer;

public class MessageContainerBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return SimpleMessageListenerContainer.class;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String connectionFactory = element.getAttribute("connection-factory");
		String messageListener = element.getAttribute("message-listener");
		
		Assert.state(StringUtils.hasText(connectionFactory), "Illegal property name returned from 'connection-factory(String)': cannot be null or empty.");
		Assert.state(StringUtils.hasText(messageListener), "Illegal property name returned from 'message-listener(String)': cannot be null or empty.");
		
		builder.addPropertyReference("connectionFactory", connectionFactory);
		builder.addPropertyReference("messageListener", messageListener);
	}
}
