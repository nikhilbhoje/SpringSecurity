package com.main.model;

public class Students {
	
	private int studId;
	private String studName;
	private int studMarks;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}
	public Students(int studId, String studName, int studMarks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMarks = studMarks;
	}
	public Students() {
		
	}
	@Override
	public String toString() {
		return "Students [studId=" + studId + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}
	
	
	

}
