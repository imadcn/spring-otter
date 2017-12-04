package com.imadcn.framework.otter.core;

/**
 * 数据库类型
 * @author imadcn
 */
public enum Type {
	/**
	 * <code>ORACLE = 1;</code>
	 */
	ORACLE(0, 1),
	/**
	 * <code>MYSQL = 2;</code>
	 */
	MYSQL(1, 2),
	/**
	 * <code>PGSQL = 3;</code>
	 */
	PGSQL(2, 3),
	;
	
	private final int index;
	private final int value;
	
	private Type(int index, int value) {
		this.index = index;
		this.value = value;
	}
	
	public static Type valueOf(int value) {
		switch (value) {
		case 1: return ORACLE;
		case 2: return MYSQL;
		case 3: return PGSQL;
		default: return null;
		}
	}

	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}
}
