package com.ems.util;

import java.util.HashMap;
//creating a list object returning
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.ems.model.Employee;

public class DBUtil {
	private static List<Employee> list = new LinkedList<>();
	private static Map<Integer, Employee> map = new HashMap<>();

	public static List<Employee> getListDBInstance() {
		return list;
	}

	public static Map<Integer, Employee> getMapDBInstance() {
		return map;
	}
}
