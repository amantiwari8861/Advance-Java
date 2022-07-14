package sys.dao;

import java.util.List;

import sys.entity.Subject;

public interface SubjectDAO {

	int save(Subject e);
	int update(Subject e);
	Subject getSubjectById(int id);
	List<Subject> getAllSubjects();
	int delete(int id);
	

}
