package com.imadcn.framework.otter.core;

import java.util.List;

public class RowChangeBuilder {
	
	public static RowChange build(com.alibaba.otter.canal.protocol.CanalEntry.RowChange rowChange) {
		long tableId = rowChange.getTableId();
		EventType eventType = EventTypeBuilder.build(rowChange.getEventType());
		boolean ddl = rowChange.getIsDdl();
		String sql = rowChange.getSql();
		List<RowData> rowDatas = RowDataBuilder.build(rowChange.getRowDatasList());
		List<Pair> props = PairBuilder.build(rowChange.getPropsList());
		String ddlSchemalName = rowChange.getDdlSchemaName();
		return new RowChange(tableId, eventType, ddl, sql, rowDatas, props, ddlSchemalName);
	}

}
