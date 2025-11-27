package example.spring.rest.data.jpa.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.spring.rest.data.jpa.entity.Course;
import example.spring.rest.data.jpa.repo.CourseRepository;

@Service // Marks this class as a service implementation class
public class CourseService {
	
	@Autowired //Injecting CourseRepository into CourseService
	private CourseRepository repoObject;
	
	public Collection<Course> getAllCourses(){
		Collection<Course> allCourse=repoObject.findAll();
		return allCourse;
	}
	
	public Course getSingleCourse(String course_id) {
		Optional<Course> opRef=repoObject.findById(course_id);
		Course foundCourse=null;
		if(opRef.isPresent()) {
			foundCourse=opRef.get();
			
		}
		return foundCourse;
	}
	
	public void createNewCourse(Course courseObject) {
		repoObject.save(courseObject);
	}
	
	public void deleteSingleCourse(String course_id) {
		repoObject.deleteById(course_id);
	}
}
