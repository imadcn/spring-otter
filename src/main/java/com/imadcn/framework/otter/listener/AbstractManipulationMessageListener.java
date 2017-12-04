package com.imadcn.framework.otter.listener;

import com.imadcn.framework.otter.core.EventType;
import com.imadcn.framework.otter.core.Header;
import com.imadcn.framework.otter.core.Message;

public abstract class AbstractManipulationMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		Header header = message.getHeader();
		if (header.getEventType() == EventType.INSERT) {
			onInsert(message);
		} else if (header.getEventType() == EventType.UPDATE) {
			onUpdate(message);
		} else if (header.getEventType() == EventType.DELETE) {
			onDelete(message);
		}
	}
	
	/**
	 * <b>INSERT</b> 操作事件处理
	 * @param message
	 */
	protected abstract void onInsert(Message message);
	
	/**
	 * <b>DELETE</b> 操作事件处理
	 * @param message
	 */
	protected abstract void onUpdate(Message message);
	
	/**
	 * <b>UPDATE</b> 操作事件处理
	 * @param message
	 */
	protected abstract void onDelete(Message message);

}
 