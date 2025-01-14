package JavaKonusalSorular.Pratik16_Constructors.Pr05;

public class Student {

	// Constructors konusu tek class ta iželenecek.

	int number; 
	String name; 
	static String college ="ITS"; 

    Student(int r, String n, String college){
		this.number = r; 
		this.name = n; 
		this.college = college; 
	}

	public static void main(String args[]){ 
	Student s1 = new Student(111,"Karan", "MIT"); 
	Student s2 = new Student(222,"Aryan", "Harvard"); 
	
	System.out.println(s1.number); //111
	System.out.println(s2.number); //222
	System.out.println(s1.name); //Karan
	System.out.println(s2.name); //Aryan
	System.out.println(s1.college); //Harvard
	System.out.println(s2.college); //Harvard

	}
}