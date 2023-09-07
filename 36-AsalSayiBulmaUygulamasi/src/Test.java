import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// ASAL Sayı Bulma Uygulaması
		// Sadece bire ve kendisine bölünen sayılar asaldır.
		
		// ASAL olmadıgını anlamak için kendisi dısındaki
		
		Scanner scanner = new Scanner(System.in);
		boolean asalMi = false;
		
		System.out.println("******ASAL BULMA UYGULAMASINA HOSGELDINIZ******");
		System.out.println("Lutfen , bir sayiyi giriniz :");
		
		int sayi = scanner.nextInt();
		
		
		
		for(int i=2 ;i<sayi;i++)
		{
			if (sayi%i==0) 
			{
				asalMi=false;
				break;
				
				
			}
			else {
				asalMi=true;
			}
		}
		if (asalMi) 
		{
			System.out.println("Girdiginiz " + sayi +" sayisi asaldir.");
		}else {
			System.out.println("Girdiginiz " + sayi +" sayisi asal degildir.");
	
		}
		
		
		

	}

}
