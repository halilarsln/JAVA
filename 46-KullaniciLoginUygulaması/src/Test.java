import java.util.Scanner;

public class Test {
	static boolean aktif = true;
	static int hakSayisi = 3;
	

	public static void main(String[] args) {
		// kullanıcının uygulamaya giriş yapmasını sağlayalım. 3 hakkı olsun.
		// 3 hakkını doldurduğu zaman hesabını dısable yapalım. dogru girerse sisteme giriş yapsın.
		
		Scanner scanner = new Scanner(System.in);
		if (aktif) {
			if (hakSayisi>0) 
			{
				while (aktif) 
				{
					System.out.print("Kullanici Adiniz:");
					String username = scanner.nextLine();
					
					System.out.print("Sifreniz :");
					String password =scanner.nextLine();
					
					boolean sonuc = login(username,password);
					if (sonuc) {
						System.out.println("Uygulama başarılı olarak giris yaptiniz :");
						break;
					}else {
						if (hakSayisi==0) 
						{
							aktif=false;
							break;
						}
					}
				}
			}if (aktif==false) 
			{
				System.out.println("Hak Sayiniz dolmuştur.");
			}else {
				System.out.println("Hak sayiniz dolmustur,hesabiniz bloke oldu!");
			}
		}else {
			System.out.println("Hesabiniz aktif degildir,yöneticin,iz ile iletiime geçiniz!");
		}

	}
	public static boolean login(String username,String password) 
	{
		//halil -------123
		if (username.equals("halil")&& password.equals("123")) 
		{
			return true; //başarılı
		}else {
			hakSayisi--;
			System.out.println("kullanici adi ve Sifreniz yanlistir.");
			if (hakSayisi==0) 
			{
				aktif=false;
			}
			return false;
		}
	}

}
