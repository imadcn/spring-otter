package com.imadcn.framework.otter.schema;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.imadcn.framework.otter.connection.SimpleConnectionFactory;
import com.imadcn.framework.otter.connection.SocketClusterConnectionFactory;
import com.imadcn.framework.otter.connection.ZkClusterConnetionFactory;

public class ConnectionFactoryBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	
	private Class<?> beanClass; // 需要创建的classType
	
	public ConnectionFactoryBeanDefinitionParser(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return this.beanClass;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String destination = element.getAttribute("destination");
		String username = element.getAttribute("username");
		String password = element.getAttribute("password");
		Assert.state(StringUtils.hasText(destination), "Illegal property name returned from 'destination(String)': cannot be null or empty.");
		builder.addPropertyValue("destination", destination);
		builder.addPropertyValue("username", StringUtils.hasText(username) ? username : "");
		builder.addPropertyValue("password", StringUtils.hasText(password) ? password : "");
		if (beanClass.equals(SimpleConnectionFactory.class)) { // simple connection
			String host = element.getAttribute("host");
			String port = element.getAttribute("port");
			
			Assert.state(StringUtils.hasText(host), "Illegal property name returned from 'host(String)': cannot be null or empty.");
			Assert.state(StringUtils.hasText(port), "Illegal property name returned from 'host(Integer)': cannot be null or empty.");
			
			builder.addPropertyValue("host", host);
			builder.addPropertyValue("port", port);
		} else if (beanClass.equals(ZkClusterConnetionFactory.class)) { // zk connection
			String zkServers = element.getAttribute("zk-servers");
			Assert.state(StringUtils.hasText(zkServers), "Illegal property name returned from 'zk-servers(String)': cannot be null or empty.");
			
			builder.addPropertyValue("zkServers", zkServers);
		} else if (beanClass.equals(SocketClusterConnectionFactory.class)) { // socket connection
			String socketServers = element.getAttribute("socket-servers");
			Assert.state(StringUtils.hasText(socketServers), "Illegal property name returned from 'socket-servers(String)': cannot be null or empty.");
			
			builder.addPropertyValue("socketServers", socketServers);
		}
	}
	
	@Override
	protected String resolveId(Element element, AbstractBeanDefinition definition, ParserContext parserContext) throws BeanDefinitionStoreException {
		String id = element.getAttribute(ID_ATTRIBUTE);
		if (!StringUtils.hasText(id)) {
			id = parserContext.getReaderContext().generateBeanName(definition);
		}
		return id;
/*		if (shouldGenerateId()) {
			return parserContext.getReaderContext().generateBeanName(definition);
		} else {
			if (!StringUtils.hasText(id) && shouldGenerateIdAsFallback()) {
				id = parserContext.getReaderContext().generateBeanName(definition);
			}
			return id;
		}*/
	}

	/**
	 * parse other element
	 * @param element
	 * @param parserContext
	 * @param builder
	 */
	protected void doParsePersonalized(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
	}
}
