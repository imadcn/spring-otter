package com.imadcn.framework.otter.core;

import java.util.Date;

public abstract class AbstractBuilder {
	
	public static Date buildDate(long time) {
		if (time >= 0) {
			return new Date(time);
		}
		return null;
	}
	
	public static String build(String value) {
		return value != null ? value : "";
	}

}
