package JavaKonusalSorular.Pratik17_Encapsulation.Pr03;

public class C05_Encapsulation05 {
	
	// C05 ve C06 classlarını beraber yaptik

	String name;
	String surName;
	private int age;// encapsulation icin veriyi private yaptik

	public static void main(String[] args) {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else
			this.age = -age;

	}

}
