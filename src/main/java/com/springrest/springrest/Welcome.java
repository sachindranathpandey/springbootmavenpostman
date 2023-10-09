package com.springrest.springrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.services.CourseService;

@RestController
public class Welcome {

	@Autowired
	private CourseService courseService;

	@GetMapping("/welcome")
	public String welcome() {
		return "This is Test Springboot";
	}

	// Get the courses

	@GetMapping("/courses")
	public List<Course> courses() {

		return this.courseService.getCourses();

	}

	// to get single course using courseID
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {

		return this.courseService.getCourse(Long.parseLong(courseId));
	}

	// To insert course data into list
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {

		this.courseService.addCourse(course);
		return course;

	}

	// Update Course Record
	@PutMapping("/update/{courseId}")
	public Course updateCourse(@PathVariable String courseId, @RequestBody Course course) {

		return this.courseService.updateCourse(course, Long.parseLong(courseId));

	}

	// Delete Course Record

	@DeleteMapping("/delete/{courseId}")
	public Course deleteCourse(@PathVariable String courseId, @RequestBody Course course) {

		return this.courseService.deleteCourse(course, Long.parseLong(courseId));

	}

}
