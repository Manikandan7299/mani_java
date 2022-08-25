package com.student;


class Student{
private int id;
private String name;
private String phoneNumber;
private int totalmarks;

public Student(int id, String name, String phoneNumber, int totalmarks) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.totalmarks = totalmarks;
}
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
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getTotalMarks() {
	return totalmarks;
}
public void setTotalMarks(int totalmarks) {
	this.totalmarks = totalmarks;
}

public void showDetails()
{
	System.out.println("Roll no= "+getId());
	System.out.println("Name = "+getName());
	System.out.println("Phone Number =  "+getPhoneNumber());
	System.out.println("Total marks =  "+getTotalMarks());
	System.out.println("======================================");
}
public static void showHighestRank(Student[] students)
{
	int mark = students[0].getTotalMarks();
	int objIndex=0;
	for(int i=1;i<students.length;i++)
	{
		if(mark<students[i].getTotalMarks())
		{
			mark=students[i].getTotalMarks();
			objIndex=i;
		}
		
	
	}
	
	students[objIndex].showDetails();
	
	
}


public static void showLowestRank(Student[] students)
{
	int mark = students[0].getTotalMarks();
	int objIndex=0;
	for(int i=1;i<students.length;i++)
	{
		if(mark>students[i].getTotalMarks())
		{
			mark=students[i].getTotalMarks();
			objIndex=i;
		}
		
	
	}
	students[objIndex].showDetails();
	

}

}


public class SimpleTesting
{  
public static void main(String args[]){  

	
	Student student1 = new Student(10, "Mani", "8986665434",482);

	
	Student student2 = new Student(11, "magesh", "9877555534", 422);

	
	Student student3 = new Student(12, "Aishwarya", "8765745454",477);


	Student student4 = new Student(13, "kumar", "9976076765", 500);

	
	Student student5 = new Student(14, "chandru", "8789848609", 412);
	
	Student[] students = new Student[] {student1,student2,student3,student4,student5};

	System.out.println("This is the highest rank");
	Student.showHighestRank(students);
	
	System.out.println("This is the lowest rank");
	Student.showLowestRank(students);
	
	}
}