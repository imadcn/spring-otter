package com.imadcn.framework.otter.core;

import java.util.List;

/**
 * message row 每行变更数据的数据结构
 * 
 * @author imadcn
 */
public class RowChange {

	private long tableId; // tableId,由数据库产生
	private EventType eventType; // 数据变更类型
	private boolean ddl; // 标识是否是ddl语句
	private String sql; // ddl/query的sql语句
	private List<RowData> rowDatas; // 数据库变更(一次可能存在多行)
	private List<Pair> props; // 预留扩展
	private String ddlSchemalName; // ddl/query的schemaName，会存在跨库ddl，需要保留执行ddl的当前schemaName
	
	public RowChange(long tableId, EventType eventType, boolean ddl, String sql, List<RowData> rowDatas,
			List<Pair> props, String ddlSchemalName) {
		this.tableId = tableId;
		this.eventType = eventType;
		this.ddl = ddl;
		this.sql = sql;
		this.rowDatas = rowDatas;
		this.props = props;
		this.ddlSchemalName = ddlSchemalName;
	}

	public long getTableId() {
		return tableId;
	}

	public EventType getEventType() {
		return eventType;
	}

	public boolean isDdl() {
		return ddl;
	}

	public String getSql() {
		return sql;
	}

	public List<RowData> getRowDatas() {
		return rowDatas;
	}

	public List<Pair> getProps() {
		return props;
	}

	public String getDdlSchemalName() {
		return ddlSchemalName;
	}

	@Override
	public String toString() {
		return "RowChange [tableId=" + tableId + ", eventType=" + eventType + ", ddl=" + ddl + ", sql=" + sql
				+ ", rowDatas=" + rowDatas + ", props=" + props + ", ddlSchemalName=" + ddlSchemalName + "]";
	}
}
