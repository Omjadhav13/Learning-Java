package example.spring.rest.data.jpa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Course;
import example.spring.rest.data.jpa.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService serviceObject;
	@GetMapping("/courses")
	public Collection<Course> getAllCourses(){
		Collection<Course> allCourses=serviceObject.getAllCourses();
		return allCourses;
	}
	
	@GetMapping("/courses/{crsid}")
	public Course getSingleCourse(@PathVariable("crsid") String course_id) {
		Course foundCourse=serviceObject.getSingleCourse(course_id);
		return foundCourse;
	}
	
	@PostMapping("/courses")
	public void createNewCourse(@RequestBody Course courseObject) {
		//ReuestBody-> used to capture the data available in request object
		serviceObject.createNewCourse(courseObject);
	}
	
	@DeleteMapping("/courses/{crsid}")
	public void  deleteSingleCourse(@PathVariable("crsid") String course_id) {
		serviceObject.deleteSingleCourse(course_id);
		
	}
}
