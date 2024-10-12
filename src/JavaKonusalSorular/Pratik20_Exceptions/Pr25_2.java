package JavaKonusalSorular.Pratik20_Exceptions;


public class Pr25_2 extends Exception {


	public static final long serialVersionUID = 1L;
	
	Pr25_2(String message){
		// p'li const creat ettim ki bu class dan olusan
	    // Object ile class'dan ve parent'inden field ve veriable call yapabilelim		
 super(message);
		
		
	}

}