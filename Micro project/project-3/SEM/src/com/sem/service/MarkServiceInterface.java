package com.sem.service;

import com.sem.model.Mark;

public interface MarkServiceInterface {
	public String insertMarkValidation(Mark mark);

	public String deleteMarkValidation(int id);

	public String updateMarkValidation(Mark mark);

	public String findMarkValidation(int id);

	public String findAllMarkValidation();

}
