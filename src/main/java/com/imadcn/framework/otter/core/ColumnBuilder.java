package com.imadcn.framework.otter.core;

import java.util.ArrayList;
import java.util.List;

public class ColumnBuilder {
	
	public static Column build(com.alibaba.otter.canal.protocol.CanalEntry.Column column) {
		int index = column.getIndex();
		int sqlType = column.getSqlType();
		String name = column.getName();
		boolean primaryKey = column.getIsKey();
		boolean updated = column.getUpdated();
		boolean isNull = column.getIsNull();
		List<Pair> props = PairBuilder.build(column.getPropsList());
		String value = column.getValue();
		int length = column.getLength();
		String mysqlType = column.getMysqlType();
		return new Column(index, sqlType, name, primaryKey, updated, isNull, props, value, length, mysqlType);
	}
	
	public static List<Column> build(List<com.alibaba.otter.canal.protocol.CanalEntry.Column> columns) {
		List<Column> list = new ArrayList<>();
		if (columns != null && !columns.isEmpty()) {
			for (com.alibaba.otter.canal.protocol.CanalEntry.Column c : columns) {
				list.add(build(c));
			}
		}
		return list;
	}

}
