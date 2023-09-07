
public class Test {

	public static void main(String[] args) {
		// 1 den 10 a kadar olan çift sayıları yazdır
		// 1 den 10 a kadar olan tek sayıları yazdır
		// 1 den 10 a kadar çift olan sayıların toplamı
		// 1 den 10 a kadar tek olan sayıların toplamı
		
		// 1
		// Enes
		// 3
		// Enes
		// 5
		// Enes
		
		for (int i = 1 ; i <= 10; i++) 
		{
			//Bir sayının çift oldugunuzu anlamak için : o sayıyı 2 ye böleriz kalan 0 ise çiftir
			//Tek olduğunu anlamak için bir sayıyı 2 ye böleriz kalan 1 ise tektir
			if(i%2==0)
			{
				System.out.println("Halil");
			}else {
				System.out.println(i);
			}
		}
		

	}

}
