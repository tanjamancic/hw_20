package domaci;

public class Main {

	public static void main(String[] args) {

		Meni meni = new Meni(10);
		meni.dodajNamirnicu(new Hrana("Hleb", 600, 7.5, 0.4, 49));
		meni.dodajNamirnicu(new Pice("Sok", 0.2, 18540));
		meni.dodajNamirnicu(new Hrana("Sir", 200, 17, 1.2, 4));

		System.out.println(meni);
	}
}
