package Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int id;
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	Student(){
		this.name = "Unknown";
		this.id = 0;
	}
	public void print() {
		System.out.printf("%d %s \n", id, name);
	}
}

public class lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student("Oudam", 2020);
		Student st2 = new Student();
		
		System.out.println("Enter your name: ");
		String stuName = sc.nextLine();
		
		System.out.println("Enter your ID: ");
		int StuID = sc.nextInt();
		
		Student st3 = new Student(stuName, StuID);
		
		st1.print();
		st2.print();
		st3.print();
		
		List<Student> aistudent = new ArrayList<Student>();
		
		aistudent.add(st1);
		aistudent.add(st2);
		aistudent.add(st3);
		aistudent.add(new Student("Oudam", 2020));
		
		System.out.println("Total students in list: " + aistudent.size());
		
		// Enhanced for-loop to print all students in the list
		for (Student s : aistudent) {
			s.print();
		}
		
		sc.close(); // Good practice to close the scanner
	}
}