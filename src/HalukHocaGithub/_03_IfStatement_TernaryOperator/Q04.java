package HalukHocaGithub._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		              dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */

		Scanner input = new Scanner (System.in);
		System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
		String str=input.next().toLowerCase();

		if (str.equals("qa")) {
			System.out.println("Mesleginiz : " + "Quality Analyst");
		}else if (str.equals("dev")) {
			System.out.println("Mesleginiz : " + "Developer");
		}else if (str.equals("ba")) {
			System.out.println("Mesleginiz : " + "Business Anlayst");
		}else if (str.equals("pm")) {
			System.out.println("Mesleginiz : " + "Project Manager");
		}else System.out.println("hatali giris");
		
		input.close();



	}

}