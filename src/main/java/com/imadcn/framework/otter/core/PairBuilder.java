package com.imadcn.framework.otter.core;

import java.util.ArrayList;
import java.util.List;

public class PairBuilder {

	public static Pair build(com.alibaba.otter.canal.protocol.CanalEntry.Pair pair) {
		return new Pair(pair.getKey(), pair.getValue());
	}
	
	public static List<Pair> build(List<com.alibaba.otter.canal.protocol.CanalEntry.Pair> pairs) {
		List<Pair> list = new ArrayList<>();
		if (pairs != null && !pairs.isEmpty()) {
			for (com.alibaba.otter.canal.protocol.CanalEntry.Pair p : pairs) {
				list.add(build(p));
			}
		}
		return list;
	}
}
