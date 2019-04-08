package died.guia03.ejercicio01;

public class Recta {
	Punto p1;
	Punto p2;
	
	//Constructor 
	public Recta (Punto punto1,Punto punto2) {
		this.p1=punto1;
		this.p2=punto2;
	}
	public Recta () {
		this.p1=new Punto(1,1);
		this.p2=new Punto(2,2);
	}
	//Métodos
	public float pendiente() {
		float x1=this.p1.abs;
		float y1=this.p1.ord;
		float x2=this.p2.abs;
		float y2=this.p2.ord;
		float m=((y2-y1)/(x2-x1));
		
		return m;
	}
	public boolean paralelas(Recta otraRecta) {
		float m1=this.pendiente();
		float m2=otraRecta.pendiente();
		
		if(m1==m2)
			return true;
		return false;
	}
	public boolean equals(Object otraRecta) {
		if(otraRecta instanceof Recta) {
			float m1=this.pendiente();
			float m2=((Recta) otraRecta).pendiente();
			Punto p1=this.p1;
			Punto p2=((Recta) otraRecta).p1;
			float m3=((p2.ord-p1.ord)/(p2.abs-p1.abs));
			
			if(m1==m3 & m2==m3)
				return true;
			return false;
		}
		return false;
	}
}
