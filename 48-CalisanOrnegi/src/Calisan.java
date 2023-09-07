
public class Calisan {
	
	public int no;
	
	public String isim;
	
	public String soyisim;
	
	public int tecrube;
	
	public double maas;
	
	public Calisan() 
	{
		
	}
	//alt shift s 
	public Calisan(int no, String isim, String soyisim, int tecrube, double maas) {
		this.no = no;
		this.isim = isim;
		this.soyisim = soyisim;
		this.tecrube = tecrube;
		this.maas = maas;
	}
	
	public void calisanBilgileriGoster() {
		System.out.println("********çalısan bılgılerı********");
		System.out.println("no     :"+no);
		System.out.println("isim   :"+isim);
		System.out.println("soyisim:"+soyisim);
		System.out.println("Tecrube:"+tecrube);
	}
	
	public void zamYap(int ZamDegeri)
	{
		System.out.println("Maasınıza"+ZamDegeri+"zam yapıldı.");
		System.out.println("Şuanki guncel maaşınız :"+(maas+ZamDegeri));
		
	}
	
	public void formatAt (String isletimsistemi,String kim)
	{
		System.out.println(kim +"şuanda"+isletimsistemi+"format atıyor");
	}
	

}
