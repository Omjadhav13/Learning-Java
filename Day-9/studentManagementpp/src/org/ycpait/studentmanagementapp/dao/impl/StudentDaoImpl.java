package org.ycpait.studentmanagementapp.dao.impl;

import java.util.*;

import org.ycpait.studentManagementpp.entity.Student;
import org.ycpait.studentManagementpp.exception.StudentNotFoundException;

public class StudentDaoImpl {
	private List<Student> students;
	public StudentDaoImpl() {
		this.students=new ArrayList<Student>();
	}
	public void save(Student s) {
		this.students.add(s);
	}
	public List<Student> findAll(){
		return students;
	}
	public Student findOne(int rollNumber) throws StudentNotFoundException {
		boolean isFound=false;
		for(Student foundStudent : students) {
			if(foundStudent!=null) {
				if(foundStudent.getRollNumber()==rollNumber) {
					System.out.println(foundStudent);
					isFound=true;
					return foundStudent;
				}
			}
			
		}
			StudentNotFoundException ex=new StudentNotFoundException("Student with "+rollNumber+" not found");
			throw ex;
	}
	public void delete(int rollNumber) {
		Iterator<Student> list =students.iterator();

		while(list.hasNext()) {
			Student rol=list.next();
			if(rollNumber==rol.getRollNumber()) {
			list.remove();
				System.out.println("Student deleted ");
			}
		}	
	}
}