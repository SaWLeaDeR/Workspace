package main;

import java.util.Map;

import demo.Course;
import demo.Student;

public class Test {

	public static void main(String[] args) {

			//Create Course
			Course ceng1004 = new Course("CENG 1004", "Introduction to OOP");
			
			//Create students and register them to the course
			
			Student student = new Student("Ali", "Dere", 1001);
			ceng1004.addStudent(student);
			
			student = new Student("Aysu", "Aral", 1002);
			ceng1004.addStudent(student);
			
			student = new Student("Ali", "Bora", 1004);
			ceng1004.addStudent(student);
			
			student = new Student("Demir", "Bora", 1003);
			ceng1004.addStudent(student);
			
			student = new Student("Ceren", "Aslan", 1005);
			ceng1004.addStudent(student);
			
			//TEST 1 : Print course
			System.out.println("-------TEST1-------");
			System.out.println(ceng1004);
			
			
			//TEST 2 : Print students in ascending order by Id number
			System.out.println();
			System.out.println("-------TEST2-------");
			
			for (Student stu : ceng1004.listStudentsOrderById()){
			
				System.out.println(stu);
			
			}
			//TEST 3 : Print students in ascending order by name
			
			System.out.println();
			
			System.out.println("-------TEST3-------");
			
			for (Student stu : ceng1004.listStudentsOrderByName()){
			
				System.out.println(stu);
			}
			
			//TEST 4 : Print students in ascending order by surname
			System.out.println();
			System.out.println("-------TEST4-------");
			for (Student stu : ceng1004.listStudentsOrderBySurname()){
			System.out.println(stu);
			}
			//assign grades to students
			student = ceng1004.getStudent(1001);
			ceng1004.setGrade(student, 75);
			
			student = ceng1004.getStudent(1002);
			ceng1004.setGrade(student, 80);
			
			student = ceng1004.getStudent(1003);
			ceng1004.setGrade(student, 85);
			
			student = ceng1004.getStudent(1004);
			ceng1004.setGrade(student, 80);
			
			student = ceng1004.getStudent(1005);
			ceng1004.setGrade(student, 85);
			
			//TEST 5 : Print students and grades in ascending order by id number
			
			System.out.println();
			
			System.out.println("-------TEST5-------");
			
			
			
			Map<Student,Integer> map = ceng1004.listStudentGradesOrderbyId();
			
			
			for (Student stu : map.keySet()){
			
				
				System.out.println(stu + " has grade " + map.get(stu));
			}
			
			
			//TEST 6 : Print students and grades in ascending order by name
			System.out.println();
			System.out.println("-------TEST6-------");
			
			
			map = ceng1004.listStudentGradesOrderbyName();
			
			for (Student stu : map.keySet()){
			
				System.out.println(stu + " has grade " + map.get(stu));
			}
			//TEST 7 : Print students and grades in descending order by grade
			
			System.out.println();
			
			System.out.println("-------TEST7-------");
			
			map = ceng1004.listStudentGradesOrderbyGrade();
			
			for (Student stu : map.keySet()){
			
				
				System.out.println(stu + " has grade " + map.get(stu));
	    }

	}
}