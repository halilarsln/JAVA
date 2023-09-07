
public class Test {

	public static void main(String[] args) {
		// Çarpım Tablosu yapımı
		
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <=10; j++)// döngüden çıkıp bir daha girince bir daha sıfırdan başlar. 
			{
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("---------------------");
		}

	}

}
