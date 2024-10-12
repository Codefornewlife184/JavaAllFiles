package JavaKonusalSorular.Pratik14_Arrays;

public class Pr04 {

	public static void main(String[] args) {

		// Soru : Verilen bir array in tum elemanlarini toplayan bir program yazalim.


				int arr[]= {2,4,6,8,10};
				
				int toplam=0;
				
				for (int i = 0; i < arr.length; i++) {
					toplam+=arr[i];
				}
				System.out.println("Verilen array'deki tum elementlerin toplami : " + toplam);

			}

		}
	