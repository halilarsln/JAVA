
public class Test {

	public static void main(String[] args) {
		//parametreli ve geriye deger döndürmeyen metot tanımlama
		
//		isimYazdir();
		topla(17,5);
isimSoyisimYazdir("HALIL","Arslan");
	}
	
	
	public static void isimSoyisimYazdir(String isim,String soyisim) {
		{
			System.out.println("Isim ve Soyisim : " + (isim+" "+soyisim));
		}
	}
	public static void topla(int sayi1,int sayi2)
	{
	    int sonuc = sayi1+sayi2;
	    System.out.println("Sonuc : " + sonuc);
	}
	
	public static void isimYazdir() 
	{
		System.out.println("Enes");
	}

}
