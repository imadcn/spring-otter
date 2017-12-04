package com.imadcn.framework.otter.core;

import java.util.Date;
import java.util.List;

public class HeaderBuilder {

	public static Header build(com.alibaba.otter.canal.protocol.CanalEntry.Header header) {
		int version = header.getVersion();
		String logfileName = header.getLogfileName();
		long logfileOffset = header.getLogfileOffset();
		long serverId = header.getServerId();
		String serverenCode = header.getServerenCode();
		Date executeTime = new Date(header.getExecuteTime());
		Type sourceType = TypeBuilder.build(header.getSourceType());
		String schemaName = header.getSchemaName();
		String tableName = header.getTableName();
		long eventLength = header.getEventLength();
		EventType eventType = EventTypeBuilder.build(header.getEventType());
		List<Pair> props = PairBuilder.build(header.getPropsList());
		return new Header(version, logfileName, logfileOffset, serverId, serverenCode, executeTime, sourceType, schemaName, tableName, eventLength, eventType, props);
	}
}
