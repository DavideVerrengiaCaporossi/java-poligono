package Jana60;

public class Triangolo implements Poligono {
	//attributi
	private double base;
	private double altezza;
	private double lato1 ;
	private double lato2 ;
	
	
	
	//costruttore
	public Triangolo(double base, double altezza, double lato1, double lato2) {
		super();
		this.base = base;
		this.altezza = altezza;
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	//metodi da importare
	@Override
	public  Double calcolaPerimetro() {
		return this.base + this.lato1 + this.lato2;
	}
	
	@Override
	public  Double calcolaArea() {
		return this.base * this.altezza / 2;
	}
	
}