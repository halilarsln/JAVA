


/*
public class Test {

	public static void main(String[] args) {
		String islemSecenekleri="Bakiye Görüntüleme-->1"
				+"Para çekmek -->2"
				+"Farklı hesaba para yatırmak için-->3"
				+"Çıkış için q tuşuna basınız";
		
		
		Scanner scanner = new Scanner(System.in);
		
		double canBakiye = 2450;
		String canIBAN = "TR1564 4587 159 154 369 2541 13 89";
		String canKullanici = "halil21";
		String canSifre="123";
		
		double halilBakiye = 1200;
		String halilIBAN = "TR1564 4587 159 154 369 2541 13 89";
		String halilKullanici = "halil12";
		String halilSifre="456";
		
		System.out.println("ATM'ye HOŞGELDİNİZ. :))");
		System.out.println("Lütfen bilgilerinizi giriniz");
		
		System.out.println("Kullanıcı Adı :");
		String kullanciAdi = scanner.nextLine();
		
		
		System.out.println("Şifre");
		String sifre = scanner.nextLine();
		
		if ( kullaniciAdi.equals("halil12") && sifre.equals("123")) ;
		{
			System.out.println("Can'ın Hesabına giriş yapılduı...");
			System.out.println(islemSecenekleri);
			
			System.out.print("Lütfen bir seçim yapınız :");
			String secim =scanner.nextLine();
			
			switch (secim) 
			{
			case "1":
				System.out.println("Bakiyeniz :"+ canBakiye);
				break;
				
			case "2":
				System.out.println("Çekmek istediğiniz tutarı giriniz:");
				int cekilecekTutar = scanner.nextInt();
				if(canBakiye >= cekilecekTutar)
				{
					canBakiye -= cekilecekTutar;
					System.out.println("Kalan tutar :" + canBakiye);
				}else {
					System.out.println("Bakiyenizden fazla para çekemezsiniz..");
					
				}
				break;
			case "3":{
				System.out.println("Ne kadar yatırmak istiyorsunuz :");
				int yatirilacaTutar = scanner.nextInt();
				if(yatirilacaTutar<=canBakiye)
				{
					System.out.println("İban Giriniz :");
					scanner.nextLine();
					String (yatirilacakIBAN.equals(canIBAN));
					{
						System.out.println("Para Halil ARSLAN adli kisiye yatırılıyor...");
						canBakiye-=yatirilacaTutar;
						halilBakiye+=yatirilacaTutar;
						
						System.out.println("Bakiyeniz :" + canBakiye);
						System.out.println("Halil'in Bakiye :" + halilBakiye );
					}
					break;
				}
				else if (kullaniciAdi.equals("halil12")&& sifre.equals("456")) 
				{
					System.out.println("Halil Arslan Hesabına giriş yapılduı...");
					System.out.println(islemSecenekleri);
				}
				else {
					System.out.println("Kullanıcı adınız veya şifreniz yanlış tekrar deneyiniz");
				}
				
			
				
					
				
			
		
		
		
		
		
		
		
		
		
		
		
		

	}
*/
			
