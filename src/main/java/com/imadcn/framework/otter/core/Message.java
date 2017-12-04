package com.imadcn.framework.otter.core;

/**
 * Canal消息数据
 * @author imadcn
 */
public class Message {
	
	private Header header;
	private RowChange rowChange;
	
	public Message(Header header, RowChange rowChange) {
		this.header = header;
		this.rowChange = rowChange;
	}

	public Header getHeader() {
		return header;
	}

	public RowChange getRowChange() {
		return rowChange;
	}

	@Override
	public String toString() {
		return "Message [header=" + header + ", rowChange=" + rowChange + "]";
	}
}
