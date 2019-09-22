package domaci;

public class Hrana extends Namirnica {

	private double tezina;
	private double belancevine;
	private double masti;
	private double ugljHidrati;

	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
		super(ime);
		if (belancevine + masti + ugljHidrati > 100) {
			System.out.println("Zbir procenata veci od 100.");
			return;
		} else {
			this.tezina = tezina;
			this.belancevine = belancevine;
			this.masti = masti;
			this.ugljHidrati = ugljHidrati;
		}
	}

	public double getTezina() {
		return tezina;
	}

	public double getBelancevine() {
		return tezina * belancevine / 100;
	}

	public double getMasti() {
		return tezina * masti / 100;
	}

	public double getUgljHidrati() {
		return tezina * ugljHidrati / 100;
	}

	@Override
	public double energVr() {
		return (tezina * belancevine / 100) * 16.7 + (tezina * masti / 100) * 37.6
				+ (tezina * ugljHidrati / 100) * 17.2;
	}

	@Override
	public String toString() {
		return super.toString() + " (" + tezina + "g, " + energVr() + "kJ)";
	}
}
