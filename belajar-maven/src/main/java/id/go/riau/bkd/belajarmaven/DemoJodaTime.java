package id.go.riau.bkd.belajarmaven;

import org.joda.time.DateTime;

public class DemoJodaTime {
	
	public static void main(String[] x){
		DateTime sekarang = new DateTime();
		DateTime tigaBulanLagi = sekarang.plusMonths(3);

		System.out.println("Tiga bulan dari sekarang : "+tigaBulanLagi);
	}
}