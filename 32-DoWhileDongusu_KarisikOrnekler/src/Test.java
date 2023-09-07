
public class Test {

	public static void main(String[] args) {
	int i =1;
	int toplam=0;
	do {
		if (i%2==1) {
			System.out.println(i);
			toplam+=i;
		}
		i++;
	} while (i<=10);
	System.out.println("Toplam :"+toplam);
	

	}

}
