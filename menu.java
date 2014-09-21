import java.util.Scanner;

public class menu {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		input_bilangan insert = new input_bilangan();
		insert.masukan();
		
		switch(insert.X)
		{
			case 1 : { kali hitung = new kali(insert.A, insert.B); 
			System.out.println(" Hasil perkalian = " + hitung.hasil_kali());} break;
			case 2 : { bagi hitung = new bagi(insert.A, insert.B); 
			System.out.println(" Hasil pembagian = " + hitung.hasil_bagi());} break;
			case 3 : { tambah hitung = new tambah(insert.A, insert.B); 
			System.out.println(" Hasil pertambahan = " + hitung.hasil_tambah());} break;
			case 4 : { kurang hitung = new kurang(insert.A, insert.B); 
			System.out.println(" Hasil pengurangan = " + hitung.hasil_kurang());} break;
			default : System.out.println(" Pilihan tidak ada");
		}
	}
}
	