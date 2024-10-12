package JavaKonusalSorular.Pratik17_Encapsulation.Pr04;

import java.util.Scanner;

public class C06_StudentsRunner {

	public static void main(String[] args) {
		
	
		// 3. adimda ise scanner objesi ie tanimlama yaptim
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz : ");
		String name = scan.nextLine();
		System.out.println("Lutfen yasiniz giriniz : ");
		int age = scan.nextInt();
		
		
		// 4. adimda ise student1 objesi olusturdum..
		
		C06_Students student1 = new C06_Students();
		student1.setName(name);
		student1.setAge(age);
		
		System.out.println("Ögrencinin adi : " + student1.getName()+ "\nYasi : " + student1.getAge());

		scan.close();

	}

}
