package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class GeoTaggingBO {
	
	private String areaCode;
	private String sqlSer;
	private String dbList;
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getSqlSer() {
		return sqlSer;
	}
	public void setSqlSer(String sqlSer) {
		this.sqlSer = sqlSer;
	}
	public String getDbList() {
		return dbList;
	}
	public void setDbList(String dbList) {
		this.dbList = dbList;
	}

	
}
