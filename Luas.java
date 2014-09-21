public class Luas{

	public static void main(String[] args) {
		menuluas menu = new menuluas();
		menu.insert();
	}
}

abstract class HitungLuas{
	abstract double Luas();
}

class Persegi extends HitungLuas {
	double sisi;
	Persegi(double s) {
		sisi = s;
		if (s<=0){System.out.println("Jangan input 0");}
	}
	double Luas() {
		return sisi * sisi;
	}
}
class PPanjang extends HitungLuas {
	double panjang, lebar;
	PPanjang(double p, double l) {
		panjang = p;
		lebar = l;
		if ((p<=0)||(l<=0)){System.out.println("Jangan input 0");}
	}
	double Luas() {
		return panjang * lebar;
	}
}
class Segitiga extends HitungLuas {
	double alas, tinggi;
	Segitiga(double a, double t) {
		alas = a;
		tinggi = t;
		if ((a<=0)||(t<=0)){System.out.println("Jangan input 0");}
	}
	double Luas() {
		return (0.5 * alas) * tinggi;
	}
}