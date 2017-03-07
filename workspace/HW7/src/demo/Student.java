package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student>{
	
	private String name ;
	private String surname ;
	private int id ;
	private int grade ;
	
	Map<String, Object> student = new HashMap<> () ;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

	public Student(String name, String surname, int id) {
		
		this.name = name;
		this.surname = surname;
		this.id = id;
		
		List<String> a =new ArrayList<>(Arrays.asList(name));
		List<String> b =new ArrayList<>(Arrays.asList(surname));
		List<Integer> c =new ArrayList<>(Arrays.asList(id));
		List<Integer> d =new ArrayList<>(Arrays.asList(grade));
		List<Student> e =new ArrayList<>();
		for (int i = 0; i < student.size(); i++) {

			e.add((Student) a);
			e.add((Student) b);
			e.add((Student) c);
			e.add((Student) d);
		}
	}
	public Map<String, Object> getStudent() {
			return student;	
		

		
	}
	public void setStudent(Map<String, Object> student) {
		this.student = student;
	}
	@Override
	public int compareTo(Student o) {

		int compareId = ((Student) o).getId();
		
		return this.id - compareId;
	}
	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", id=" + id;
	}	
	
}	
