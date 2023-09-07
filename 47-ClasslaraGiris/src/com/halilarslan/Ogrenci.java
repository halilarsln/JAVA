package com.halilarslan;
//public her yerden erişebilir demek 
public class Ogrenci {

	public int id; //degişken-field-property
	
	public String isim;
	
	public String soyisim;
	
	public Ogrenci(int id,String isim,String soyisim) {
		// this : şuan üzerinde çalıştığım class
		this.id=id;
		this.isim=isim;
		this.soyisim=soyisim;
		
		
	}
}
