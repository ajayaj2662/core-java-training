package com.sem.service;

import com.sem.model.Mark;
import com.sem.repo.MarkInterface;
import com.sem.repo.MarkRepo;


public class MarkService implements MarkServiceInterface{
	MarkInterface markRepo = new MarkRepo();
	
	public String insertMarkValidation(Mark mark) {
		String result;
		if (mark == null) {
			result = "Mark Object is Null";
		} else if (mark.getStudent_Id() == 0 || mark.getStudent_Subject() == null || mark.getStudent_Marks() == 0) 
		{
			result = "Invalid Mark Data";
		} else {
			boolean flag = markRepo.doInsertStudent(mark);

			if (flag) {
				result = "Mark Object Saved";
			} else {
				result = "Mark Object Not Saved";
			}
		}
		return result;
	}
	
	public String deleteMarkValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = markRepo.doDeleteMark(id);
			if (flag) {
				result = "Mark Object Deleted Successfully";
			} else {
				result = "Mark Object Not Found";
			}
		}
		return result;
	}
	
	public String updateMarkValidation(Mark mark) {
		String result;
		if (mark == null) { // validation of employee object
			result = "Mark Object is Null";
		} else if (mark.getStudent_Id() == 0 || mark.getStudent_Subject() == null || mark.getStudent_Marks() ==0) {
			result = "Mark Student Data";
		} else {
			boolean flag = markRepo.doUpdateMark(mark);
			if (flag) {
				result = "Mark Object Updated";
			} else {
				result = "Mark Object Not Found";
			}
		}
		return result;
	}
	public String findMarkValidation(int id) {
		Mark mark = null;
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			 mark = markRepo.doFindMark(id);
			if (mark != null) {
				result = mark.toString(); // later will modify
			} else {
				result = "Student Object Not Found";
			}
		}
		return result;
	}
	
	public String findAllMarkValidation()
	{
		return markRepo.doFindAllMark().toString();
	}
}
