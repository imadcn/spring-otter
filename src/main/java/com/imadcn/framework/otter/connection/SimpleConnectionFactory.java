package com.imadcn.framework.otter.connection;

import java.net.InetSocketAddress;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;

public class SimpleConnectionFactory extends AbstractConnectionFactory {
	
	private String host;
	private int port;

	@Override
	public CanalConnector createCanalConnector() {
		CanalConnector connector = CanalConnectors.newSingleConnector(new InetSocketAddress(host, port), getDestination(), getUsername(), getPassword());
		return connector;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
