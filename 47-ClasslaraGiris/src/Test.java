import com.halilarslan.Ogrenci;

public class Test {

	public static void main(String[] args) {


		//Bir sınıf var.Biz bir sınıfın içindeki değişkenlere erişebimek içiN
		//o classtan nesne türetmemiz gerekiyor. NEW
		
		//Constructor (yapıcı metot) önce çalışır.
		
		/* ERİŞİM  BELİRLEYİCİLERİ(Access Modifiers)
		 * public   : her yerden erişebilir.
		 * private  : sadece bulunduğu class içerisinen erişebilir.
		 * protected: bulnduğu class içinden ve o class'ı miras alan alt classlardan erişebilir.
		 */
		
		Ogrenci ogrenci1 = new Ogrenci(7,"Ali","Çagdaş");
		
	//	ogrenci1.id=5;
	//	ogrenci1.isim="HALIL";
	//	ogrenci1.soyisim="ARSLAN";
		
		System.out.println("Ogrencinin Bilgileri");
		System.out.println("ID :"+ogrenci1.id);
		System.out.println("Isim:"+ ogrenci1.isim);
		System.out.println("Soyisim:" +ogrenci1.soyisim);

	}

}
