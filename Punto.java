package died.guia03.ejercicio01;

public class Punto {
	float abs;
	float ord;
	
	//constructor
	public Punto (float x, float y) {
		this.setAbs(x);
		this.setOrd(y);
	}
	//metodos
	public float getOrd() {
		return ord;
	}
	public float getAbs() {
		return abs;
	}
	public void setOrd(float ord) {
		this.ord=ord;
	}
	public void setAbs(float abs) {
		this.abs=abs;
	}
	public boolean equals(Object otroPunto) {
		if (otroPunto instanceof Punto) {
			float a=this.getAbs();
			float b=this.getOrd();
			float a2=((Punto) otroPunto).getAbs();
			float b2=((Punto) otroPunto).getOrd();
			
			if(a==a2 & b==b2)
				return true;
			return false;
		}
		return false;
	}
	
}
