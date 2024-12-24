package com.ems.model;

public class Department {
	private int dno;
	private String dname;
	
	//Empty constructor
	public Department() {
		super();
	}

	//Parametarized constructor
	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}
	
	//Getter, setter methods
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}
}
