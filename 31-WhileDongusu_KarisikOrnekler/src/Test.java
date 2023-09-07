
public class Test {

	public static void main(String[] args) {
		
		int i = 1;
		int toplam = 0;
		
		while (i<=10) 
		{
			if (i%2==0) {
				toplam+=i;	
			}
			
			i++;
			
		}
		System.out.println("Cift sayilarin toplami :" + toplam);

	}

}
