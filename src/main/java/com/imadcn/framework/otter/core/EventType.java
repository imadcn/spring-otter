package com.imadcn.framework.otter.core;

/**
 * 事件类型
 * @author imadcn
 */
public enum EventType {
	/**
	 * <code>INSERT = 1;</code>
	 */
	INSERT(0, 1),
	/**
	 * <code>UPDATE = 2;</code>
	 */
	UPDATE(1, 2),
	/**
	 * <code>DELETE = 3;</code>
	 */
	DELETE(2, 3),
	/**
	 * <code>CREATE = 4;</code>
	 */
	CREATE(3, 4),
	/**
	 * <code>ALTER = 5;</code>
	 */
	ALTER(4, 5),
	/**
	 * <code>ERASE = 6;</code>
	 */
	ERASE(5, 6),
	/**
	 * <code>QUERY = 7;</code>
	 */
	QUERY(6, 7),
	/**
	 * <code>TRUNCATE = 8;</code>
	 */
	TRUNCATE(7, 8),
	/**
	 * <code>RENAME = 9;</code>
	 */
	RENAME(8, 9),
	/**
	 * <code>CINDEX = 10;</code>
	 *
	 * <pre>
	 **CREATE INDEX*
	 * </pre>
	 */
	CINDEX(9, 10),
	/**
	 * <code>DINDEX = 11;</code>
	 */
	DINDEX(10, 11),
	;
	
	private final int index;
	private final int value;
	
	private EventType(int index, int value) {
		this.index = index;
		this.value = value;
	}
	
	public static EventType valueOf(int value) {
		switch (value) {
		case 1: return INSERT;
		case 2: return UPDATE;
		case 3: return DELETE;
		case 4: return CREATE;
		case 5: return ALTER;
		case 6: return ERASE;
		case 7: return QUERY;
		case 8: return TRUNCATE;
		case 9: return RENAME;
		case 10: return CINDEX;
		case 11: return DINDEX;
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
