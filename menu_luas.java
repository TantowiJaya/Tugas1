import java.util.Scanner;

public class menu_luas {
	public void insert()
	{
		Scanner scan = new Scanner(System.in);
		int pilih;
		
		System.out.println(" 1. Luas Persegi \n 2. Luas Persegi Panjang \n 3. Luas Segitiga");
		System.out.print(" Masukan Pilihan : ");
		pilih = scan.nextInt();
		switch(pilih)
		{
			case 1 :
			{ double sisi; 
				System.out.print("\n Masukan Sisi : ");
				sisi = scan.nextDouble();
				Persegi psg = new Persegi(sisi);
				System.out.println(" Hasil = " + psg.Luas());
			} break;
			case 2 :
			{ double pjg,lbr;
				System.out.print("\n Masukan Panjang : ");
				pjg = scan.nextDouble();
				System.out.print(" Masukan Lebar   : ");
				lbr = scan.nextDouble();
				PPanjang pp = new PPanjang(pjg, lbr);
				System.out.println(" Hasil = " + pp.Luas());
			} break;
			case 3 :
			{ double als,tg;
				System.out.print("\n Masukan Alas   : ");
				als = scan.nextDouble();
				System.out.print(" Masukan Tinggi : ");
				tg = scan.nextDouble();
				Segitiga sg = new Segitiga(als, tg);
				System.out.println(" Hasil = " + sg.Luas());
			} break;
			default : System.out.println(" Pilihan tidak ada");
		}
	}
}