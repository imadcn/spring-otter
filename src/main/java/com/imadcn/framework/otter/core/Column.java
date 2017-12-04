package com.imadcn.framework.otter.core;

import java.util.List;

/**
 * 每个字段的数据结构
 * 
 * @author imadcn
 */
public class Column {

	private int index; // 字段下标
	private int sqlType; // 字段java中类型
	private String name; // 字段名称(忽略大小写)，在mysql中是没有的
	private boolean primaryKey; // 是否是主键
	private boolean updated; // 如果EventType=UPDATE,用于标识这个字段值是否有修改
	private boolean isNull; // 标识是否为空
	private List<Pair> props; // 预留扩展
	private String value; // 字段值,timestamp,Datetime是一个时间格式的文本
	private int length; // 对应数据对象原始长度
	private String mysqlType; // 字段mysql类型
	
	public Column(int index, int sqlType, String name, boolean primaryKey, boolean updated, 
			boolean isNull, List<Pair> props, String value, int length, String mysqlType) {
		this.index = index;
		this.sqlType = sqlType;
		this.name = name;
		this.primaryKey = primaryKey;
		this.updated = updated;
		this.isNull = isNull;
		this.props = props;
		this.value = value;
		this.length = length;
		this.mysqlType = mysqlType;
	}

	public int getIndex() {
		return index;
	}

	public int getSqlType() {
		return sqlType;
	}

	public String getName() {
		return name;
	}

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public boolean isUpdated() {
		return updated;
	}

	public boolean isNull() {
		return isNull;
	}

	public List<Pair> getProps() {
		return props;
	}

	public String getValue() {
		return value;
	}

	public int getLength() {
		return length;
	}

	public String getMysqlType() {
		return mysqlType;
	}

	@Override
	public String toString() {
		return "Column [index=" + index + ", sqlType=" + sqlType + ", name=" + name + ", primaryKey=" + primaryKey
				+ ", updated=" + updated + ", isNull=" + isNull + ", props=" + props + ", value=" + value + ", length="
				+ length + ", mysqlType=" + mysqlType + "]";
	}
}
