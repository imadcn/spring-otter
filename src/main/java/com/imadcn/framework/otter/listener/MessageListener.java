package com.imadcn.framework.otter.listener;

import com.imadcn.framework.otter.core.Message;

/**
 * 消息监听器
 * @author imadcn
 */
public interface MessageListener {

	/**
	 * 收到Canal消息处理
	 * @param message
	 */
	void onMessage(Message message);
	
}
