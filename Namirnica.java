package domaci;

public abstract class Namirnica extends Energent {

	protected String ime;
	protected int id;
	private static int idBrojac;

	public Namirnica(String ime) {
		this.ime = ime;
		this.id = idBrojac;
		idBrojac++;
	}

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[" + id + "] " + ime;
	}
}
