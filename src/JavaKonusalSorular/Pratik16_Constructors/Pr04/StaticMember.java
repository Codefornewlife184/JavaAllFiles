package JavaKonusalSorular.Pratik16_Constructors.Pr04;

		public class StaticMember {

			// Constructors konusu tek class ta iþelenecek.
			static int x ;
			int y;
			
			StaticMember(){
			x+=2; // x deðeri 2 ike +2 artýtýp 4 yapýyoruz.
			y++; // y ye yukarýda deðer atanmamýþtý ve burada +1 ekle diyor ve ye 1 oluyor.

		 }
		    static int getSquare() {
			return x * x ;
		}

		public static void main(String[] args) {
			
			StaticMember sm1=new StaticMember();
			StaticMember sm2=new StaticMember();
			
			int z =sm1.getSquare(); // z yi belirleme adýna metoda yani 13.satýra gidiyoruz. 4*4=16 bulduk.

			System.out.println("-x"+z+"-y"+sm2.y); // -x16-y1
			
			}

		}
	