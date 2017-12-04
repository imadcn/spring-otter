package com.imadcn.framework.otter.core;

import java.util.ArrayList;
import java.util.List;

public class RowDataBuilder {
	
	public static RowData build(com.alibaba.otter.canal.protocol.CanalEntry.RowData rowData) {
		List<Column> beforeColumns = ColumnBuilder.build(rowData.getBeforeColumnsList());
		List<Column> afterColumns = ColumnBuilder.build(rowData.getAfterColumnsList());
		List<Pair> props = PairBuilder.build(rowData.getPropsList());
		return new RowData(beforeColumns, afterColumns, props);
	}
	
	public static List<RowData> build(List<com.alibaba.otter.canal.protocol.CanalEntry.RowData> rowDatas) {
		List<RowData> list = new ArrayList<>();
		if (rowDatas != null && !rowDatas.isEmpty()) {
			for (com.alibaba.otter.canal.protocol.CanalEntry.RowData r : rowDatas) {
				list.add(build(r));
			}
		}
		return list;
	}

}
