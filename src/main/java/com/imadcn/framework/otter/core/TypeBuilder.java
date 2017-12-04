package com.imadcn.framework.otter.core;

public class TypeBuilder {
	
	public static Type build(com.alibaba.otter.canal.protocol.CanalEntry.Type type) {
		return Type.valueOf(type.getNumber());
	}
}
