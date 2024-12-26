package com.sem.repo;

import java.util.List;

import com.sem.model.Mark;

public interface MarkInterface {
	public boolean doInsertStudent(Mark mark);

	public boolean doDeleteMark(int id);

	public boolean doUpdateMark(Mark mark);

	public Mark doFindMark(int id);

	public List<Mark> doFindAllMark();
}
