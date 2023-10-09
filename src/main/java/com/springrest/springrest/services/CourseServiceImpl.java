package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {

		list = new ArrayList<Course>();
		list.add(new Course(1904, "Java", "Multithreding"));
		list.add(new Course(56, "Spring", "Spring MVC"));
		list.add(new Course(4567, "Microservice", "Springboot"));
		list.add(new Course(2090, "Data JPA", "Hibernate"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override

	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course uCourse, long courseId) {
		Course c = null;
		for (Course sub : list) {

			if (sub.getId() == courseId) {

				sub.setTitle(uCourse.getTitle());
				sub.setDescription(uCourse.getDescription());
				c = sub;
				break;
			}
		}
		return c;
		// TODO Auto-generated method stub

	}

	@Override
	public Course deleteCourse(Course uCourse, long courseId) {
		Course c = null;
		for (Course sub : list) {

			if (sub.getId() == courseId) {
				list.remove(sub);
				c = sub;
				break;
			}
		}
		System.out.println(list);
		return c;
	}

}
