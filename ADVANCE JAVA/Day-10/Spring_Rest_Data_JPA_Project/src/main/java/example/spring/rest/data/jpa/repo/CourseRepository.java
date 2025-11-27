package example.spring.rest.data.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.spring.rest.data.jpa.entity.Course;


//No need of @ Repository because JPA repository is already a managed component 
//No course repository is also extending to it so it also become managed component.
public interface CourseRepository extends JpaRepository< Course, String>{
	//Additional methods if any
	//Nothing to be added if only regular CRUD operations are to be performed
}
