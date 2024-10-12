package CoreJavaDay50.day12_stringManipulations;

public class C09_StringManipulation09 {

	
		public static void main(String[] args) {

			// endsWith ve startsWith true false verdirir...

			String str= "Java kolaydir";
			
			System.out.println(str.endsWith("r")); // true
			System.out.println(str.endsWith("ir")); // true
			System.out.println(str.endsWith("dir")); // true
			System.out.println(str.endsWith("")); // true
			System.out.println(str.endsWith("Java kolaydir")); // true
			
			
			System.out.println(str.startsWith("J")); // true
			System.out.println(str.startsWith("Java")); // true
			System.out.println(str.startsWith("r")); // false
			System.out.println(str.startsWith("")); // true
			System.out.println(str.startsWith("Java kolaydir")); // true

		}

	}