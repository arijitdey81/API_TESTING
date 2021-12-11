package com.pojoUtility;

import org.codehaus.jackson.annotate.JsonValue;

public class PojoClass {
	
	String createBy;
	String projectName;
	String status;
	int teamSize;
	public PojoClass(String createBy, String projectName, String status, int teamSize) {
		
		this.createBy = createBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	

}
