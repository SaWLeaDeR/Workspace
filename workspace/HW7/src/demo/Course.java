package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Course {
	
	
	private String code ;
	
	private String name ;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public Course(String code, String name) {
		
		this.code = code;
		this.name = name;
	}

    List<Student> students = new ArrayList<>() ;
	Map<Student,Integer> grades = new LinkedHashMap<Student, Integer>();

	public String toString() {
		return "Course = " + code + " " + name ;
	}
    public void addStudent (Student stu){
		
		students.add(stu);
    }
    public List<Student> listStudentsOrderById() {
    	Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
            	
                return new Integer(s1.getId()).compareTo(s2.getId());
            }
        });
		return (ArrayList<Student>) students;
    }	
    	
    public List<Student> listStudentsOrderByName(){
		Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                
                return new String(s1.getName()).compareTo(s2.getName());
            }
        });
		return (ArrayList<Student>) students;	
    	
    	
    }	
    public List<Student> listStudentsOrderBySurname(){
		Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
            	
                return new String(s1.getSurname()).compareTo(s2.getSurname());
            }
        });
		return (ArrayList<Student>) students;
	}
    public Student getStudent(int id)
	{
		Student s1 = new Student("","", 0);
	for (Student o : students) {
		if (o.getId() == id) {
			s1 = o;
		}
	}
		return s1;
	}
    public void setGrade(Student s1,int g1) {
    	
    	grades.put(s1, g1);
    	
    	}
    public Map<Student, Integer> listStudentGradesOrderbyId() {
		
		
		Map<Student,Integer> newgrades = new LinkedHashMap<Student,Integer>();
		
		
		for(Student s1 : this.listStudentsOrderById())
		{
			newgrades.put(s1, grades.get(s1));
		}
		return newgrades;
	}
    public Map<Student, Integer> listStudentGradesOrderbyName() {
		
		Map<Student,Integer> newgrades = new LinkedHashMap<Student,Integer>();
		
		
		for(Student s1 : this.listStudentsOrderByName())
		{
			newgrades.put(s1, grades.get(s1));
		}
		return newgrades;
	}
    public Map<Student, Integer> listStudentGradesOrderbyGrade() {
		
		Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
            	
                return new Integer(grades.get(s2)).compareTo(grades.get(s1));
            }
        });
		
		Map<Student,Integer> newgrades = new LinkedHashMap<Student,Integer>();
		
		for(Student s1 : students){
			newgrades.put(s1, grades.get(s1));
		}
		return newgrades;
	}
}
