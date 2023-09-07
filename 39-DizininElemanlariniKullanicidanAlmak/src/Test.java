import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Dizinin elamanlarını kullanıcından almak
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dizinin kac elamanli olsun :");
		int diziUzunluk = scanner.nextInt();
		scanner.nextLine();
		
		String[]isimler= new String[diziUzunluk];
		
		for (int i = 0; i < diziUzunluk; i++) 
		{
			System.out.println("Dizinin "+(i)+" index degerini giriniz:");
			isimler[i]= scanner.nextLine();
			
			
		}
		System.out.println("******dizinin elemanlari******");
		for (int i = 0; i < isimler.length; i++) 
		{
			System.out.println(isimler[i]);
		}

	}

}
