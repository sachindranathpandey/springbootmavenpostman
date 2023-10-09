package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course, long courseId);

	public Course deleteCourse(Course course, long parseLong);

}
