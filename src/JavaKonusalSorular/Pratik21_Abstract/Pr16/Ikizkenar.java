package JavaKonusalSorular.Pratik21_Abstract.Pr16;

public class Ikizkenar extends Sekil {
	
	public double a;
	public double b;
	public double h;

	
	public Ikizkenar(double a, double b, double h) {
		super();
		this.a = a;
		this.b = b;
		this.h = h;
	}

	@Override
	public double cevre() {
		
		return a+a+b;
	}

	@Override
	public double alan() {
		
		return h*b/2;
	}

}
