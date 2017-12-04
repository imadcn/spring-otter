package com.imadcn.framework.otter.core;

/**
 * 预留扩展
 * 
 * @author imadcn
 */
public class Pair {
	private String key;
	private String value;

	public Pair(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
}
