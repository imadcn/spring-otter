package com.imadcn.framework.otter.core;

import java.util.Date;
import java.util.List;

public class Header {

	private int version; // 协议的版本号 default=1
	private String logfileName; // binlog/redolog 文件名
	private long logfileOffset; // binlog/redolog 文件的偏移位置
	private long serverId; // 服务端serverId
	private String serverenCode; // 变更数据的编码
	private Date executeTime; // 变更数据的执行时间 源数据为long，系统会将其转换为java.util.Date
	private Type sourceType; // 变更数据的来源,default = MYSQL
	private String schemaName; // database name
	private String tableName; // table name
	private long eventLength;
	private EventType eventType; // 数据变更类型, default = UPDATE
	private List<Pair> props; // 预留扩展
	
	public Header(int version, String logfileName, long logfileOffset, long serverId, String serverenCode, 
			Date executeTime, Type sourceType, String schemaName, String tableName, long eventLength,
			EventType eventType, List<Pair> props) {
		this.version = version;
		this.logfileName = logfileName;
		this.logfileOffset = logfileOffset;
		this.serverId = serverId;
		this.serverenCode = serverenCode;
		this.executeTime = executeTime;
		this.sourceType = sourceType;
		this.schemaName = schemaName;
		this.tableName = tableName;
		this.eventLength = eventLength;
		this.eventType = eventType;
		this.props = props;
	}

	public int getVersion() {
		return version;
	}

	public String getLogfileName() {
		return logfileName;
	}

	public long getLogfileOffset() {
		return logfileOffset;
	}

	public long getServerId() {
		return serverId;
	}

	public String getServerenCode() {
		return serverenCode;
	}

	public Date getExecuteTime() {
		return executeTime;
	}

	public Type getSourceType() {
		return sourceType;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public String getTableName() {
		return tableName;
	}

	public long getEventLength() {
		return eventLength;
	}

	public EventType getEventType() {
		return eventType;
	}

	public List<Pair> getProps() {
		return props;
	}

	@Override
	public String toString() {
		return "Header [version=" + version + ", logfileName=" + logfileName + ", logfileOffset=" + logfileOffset
				+ ", serverId=" + serverId + ", serverenCode=" + serverenCode + ", executeTime=" + executeTime
				+ ", sourceType=" + sourceType + ", schemaName=" + schemaName + ", tableName=" + tableName
				+ ", eventLength=" + eventLength + ", eventType=" + eventType + ", props=" + props + "]";
	}
}
