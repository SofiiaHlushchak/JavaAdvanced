package ua.lviv.lgs.dao.impl;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.domain.Student;

public class StudentDaoImpl implements StudentDao{

	private List<Student> listStudents = new ArrayList<>();
	
	@Override
	public Student addStudent(Student student) {
		listStudents.add(student);
		return student;
		
	}

	@Override
	public Student removeStudent(int id) {
		listStudents.remove(id);
		return listStudents.get(id);
		
	}

	@Override
	public Student update(Student student) {
		listStudents.remove(student.getId());
		listStudents.add(student);
		return student;
		
	}

	@Override
	public Student readStudent(int id) {
		return listStudents.get(id);
	}

	@Override
	public List<Student> readAll() {
		return listStudents;
		
	}


}
