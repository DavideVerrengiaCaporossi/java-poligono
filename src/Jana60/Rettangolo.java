package Jana60;

public class Rettangolo implements Poligono {
	//attributi
	private double base;
	private double altezza;
	//costruttore
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	//metodoi importati
	@Override
	public  Double calcolaPerimetro() {
		return (this.base + this.altezza)*2;
		
	}
	@Override
	public  Double calcolaArea() {
		return this.base + this.altezza;
	}
	
	
}
	


	

