package ua.lviv.lgs.shared;

import java.util.List;

import ua.lviv.lgs.domain.Student;

public interface AbstractCrud<T> {

	Student addStudent(Student student);
	
	Student removeStudent (int id);
	
	Student update(Student student);
	
	Student readStudent (int id);
	
	List<Student> readAll();

	

}