package domaci;

public class Meni {

	Namirnica[] nizNamirnica;
	int brNamirnica;

	public Meni(int duzinaNiza) {
		super();
		nizNamirnica = new Namirnica[duzinaNiza];
		brNamirnica = 0;
	}

	public boolean dodajNamirnicu(Namirnica n) {
		if (brNamirnica == nizNamirnica.length) {
			System.out.println("Meni popunjen.");
			return false;
		}
		nizNamirnica[brNamirnica++] = n;
		return true;
	}

	public double energVr() {
		double enV = 0;
		for (int i = 0; i < brNamirnica; i++) {
			enV += nizNamirnica[i].energVr();
		}
		return enV;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni (" + energVr() + "kJ)");
		for (int i = 0; i < brNamirnica; i++) {
			sb.append("\n" + nizNamirnica[i]);
		}
		return sb.toString();
	}
}
