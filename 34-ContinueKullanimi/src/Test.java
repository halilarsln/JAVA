
public class Test {

	public static void main(String[] args) {
		// Continue Kullanimi ---Döngüyü sadece 1 kereye mahsus kırar...
		// 1 2 3 4 5 6 (7,8) 9 10 
		for (int i = 1; i <=10; i++) 
		{
			if (i==7 || i==8) // || veya demek
			{
				continue; // anahtar kelimeyi çalışınca sadece 1 kere kırdı.
			}
			System.out.println(i);
		}

	}

}
