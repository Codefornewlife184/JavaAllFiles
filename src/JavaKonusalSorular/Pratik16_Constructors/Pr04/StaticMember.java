package JavaKonusalSorular.Pratik16_Constructors.Pr04;

		public class StaticMember {

			// Constructors konusu tek class ta i�elenecek.
			static int x ;
			int y;
			
			StaticMember(){
			x+=2; // x de�eri 2 ike +2 art�t�p 4 yap�yoruz.
			y++; // y ye yukar�da de�er atanmam��t� ve burada +1 ekle diyor ve ye 1 oluyor.

		 }
		    static int getSquare() {
			return x * x ;
		}

		public static void main(String[] args) {
			
			StaticMember sm1=new StaticMember();
			StaticMember sm2=new StaticMember();
			
			int z =sm1.getSquare(); // z yi belirleme ad�na metoda yani 13.sat�ra gidiyoruz. 4*4=16 bulduk.

			System.out.println("-x"+z+"-y"+sm2.y); // -x16-y1
			
			}

		}
	