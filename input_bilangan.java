import java.util.Scanner;

public class input_bilangan
{
	Scanner scan = new Scanner(System.in);
	double A,B;
	int X;
	void masukan()
	{
		System.out.println("\n Kalkulator Sederhana");
		System.out.println(" ====================");
		System.out.print(" Masukan nilai ke 1 : ");
		A=scan.nextDouble();
		System.out.print("\n MAsukan nilai ke 2 : ");
		B=scan.nextDouble();
		System.out.println("\n 1. x \n 2. / \n 3. + \n 4. -");
		System.out.print("\n Masukan Pilihan : ");
		X=scan.nextInt();
	}
}