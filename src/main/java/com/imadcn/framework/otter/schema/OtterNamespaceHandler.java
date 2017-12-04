package com.imadcn.framework.otter.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.imadcn.framework.otter.connection.SimpleConnectionFactory;
import com.imadcn.framework.otter.connection.SocketClusterConnectionFactory;
import com.imadcn.framework.otter.connection.ZkClusterConnetionFactory;

public class OtterNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("simple-connection", new ConnectionFactoryBeanDefinitionParser(SimpleConnectionFactory.class));
		registerBeanDefinitionParser("zk-connection", new ConnectionFactoryBeanDefinitionParser(ZkClusterConnetionFactory.class));
		registerBeanDefinitionParser("socket-connection", new ConnectionFactoryBeanDefinitionParser(SocketClusterConnectionFactory.class));
		registerBeanDefinitionParser("message-container", new MessageContainerBeanDefinitionParser());
	}
}
