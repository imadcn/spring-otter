package com.imadcn.framework.otter.core;

public class EventTypeBuilder {

	public static EventType build(com.alibaba.otter.canal.protocol.CanalEntry.EventType eventType) {
		return EventType.valueOf(eventType.getNumber());
	}
}
