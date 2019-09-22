package domaci;

public class Pice extends Namirnica {

	private double kolicina;
	private double enVr;

	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina = kolicina;
		this.enVr = enVr;
	}

	@Override
	public double energVr() {
		return kolicina * enVr;
	}

	public double getKolicina() {
		return kolicina;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + kolicina + "l, " + energVr() + "kJ)";
	}
}
