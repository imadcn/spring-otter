package com.imadcn.framework.otter.core;

import java.util.List;

/**
 * 行数据
 * 
 * @author imadcn
 */
public class RowData {

	private List<Column> beforeColumns; // 字段信息，增量数据(修改前,删除前)
	private List<Column> afterColumns; // 字段信息，增量数据(修改后,新增后)
	private List<Pair> props; // 预留扩展

	public RowData(List<Column> beforeColumns, List<Column> afterColumns, List<Pair> props) {
		this.beforeColumns = beforeColumns;
		this.afterColumns = afterColumns;
		this.props = props;
	}

	public List<Column> getBeforeColumns() {
		return beforeColumns;
	}

	public List<Column> getAfterColumns() {
		return afterColumns;
	}

	public List<Pair> getProps() {
		return props;
	}

	@Override
	public String toString() {
		return "RowData [beforeColumns=" + beforeColumns + ", afterColumns=" + afterColumns + ", props=" + props + "]";
	}
}
