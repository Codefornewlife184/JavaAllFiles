package CoreJavaDay50.day12_stringManipulations;

public class C05_StringManipulation05 {

	public static void main(String[] args) {
		/*
		 Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
			String str1 = "$13.99"
			String str2 = "$10.55"
			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

		 */
		
		String str1 = "$13.99";
		String str2 = "$10.55";
		
		str1=str1.replace("$", "");
		str2=str2.replace("$", "");
		
		System.out.println("Str'larin toplami : " + (str1+str2)); // 13.9910.55
		// 13.9910.55 $ karakterinden kurtulduk ama hala String oldugu icin concat oldu. Yanyana birleştirdi.

		
		Double sayi1= Double.parseDouble(str1); 
		// ilkbastaki double kucukte olur ama buyuk daha iyi olur bu method da
		Double sayi2=Double.parseDouble(str2);
		
		System.out.println("Iki sayinin toplami : $" + (sayi1+sayi2)); // $24.54  burada toplama işlemi yapmış oldu.
	}

}