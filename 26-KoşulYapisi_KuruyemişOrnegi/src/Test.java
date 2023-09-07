
public class Test {

	public static void main(String[] args) {
		/*
		 * bir kuruyemişçi toptancıdan ; 12 kilo leblebiyi kilosunu 3,5 TL'ye 25 kilo
		 * fındık,kilosunu 15,7 TL'ye 40 kilo badem , kilosunu 22 TL den almıştır.
		 * 
		 * bu ürüleri satarken , --> leblebinin kilosunu %50 fazlası satması --> fındık
		 * ise , %40 fazlasına --> badem ise , %60 fazlasına satmıştır.
		 * 
		 * kuruyemişci o günkü kazandıgı para ile dükkanın kirasını ödemek isemektedir..
		 * 
		 * kira tutarı : 500 TL kazandığı paa 500 Tl den yüksek ise kirayı ödeyebilsin
		 * değilse ödeyemesi...
		 */
		// fiyatlar
		double leblebi = 3.5;
		double findik = 15.7;
		double badem = 22;

		double maliyeTutar = (leblebi * 12) + (findik * 25) + (badem * 40);

		double satisTutar = ((leblebi * 1.5) * 12) + ((findik * 1.4) * 25) + ((badem * 1.6) * 40);

		double kaarTutar = satisTutar - maliyeTutar;

		if (kaarTutar > 500) {
			System.out.println("Kirayi Odeyebilirsin :))");
		} else {
			System.out.println("Kirayı ödemek için yeterli paranız bulunmamaktadır.Lütfen daha sonra deneyiniz.");
		}
		System.out.println("Maliyet Tutar:" + maliyeTutar);
		System.out.println("Satis Tutar:" + satisTutar);
		System.out.println("Kazanc Tutar:" + kaarTutar);
	}

}
