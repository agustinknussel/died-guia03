package died.guia03.ejercicio02;

public class Temperatura {
	public double grados;
	public Escala escala;
	
	//Constructores
	public Temperatura() {
		this.grados=0.0;
		this.escala=Escala.CELSIUS;
	}
	public Temperatura(double temp,Escala esc) {
		this.grados=temp;
		this.escala=esc;
	}
	//Métodos
	public String toString() {
		String string = null;
		
		switch (this.escala) {
			case CELSIUS:
				string=this.grados+" C°";
				break;
			case FAHRENHEIT:
				string=this.grados+" F°";
				break;
		}
	return string;	
	}
	public double asCelsius() {
		double temperatura=this.grados;
		
		switch (this.escala) {
		case CELSIUS:
			break;
		case FAHRENHEIT:
			temperatura=(temperatura-32)*5/9;
		}
		return temperatura;
	}
	public double asFahrenheit() {
		double temperatura=this.grados;
		
		switch (this.escala) {
		case FAHRENHEIT:
			break;
		case CELSIUS:
			temperatura=temperatura*9/5+32;
		}
		return temperatura;
	}
	public void aumentar(Temperatura temp) {
		if(temp.grados>0.0) {
			switch (this.escala) {
			case CELSIUS:
				this.grados+=temp.asCelsius();
				break;
			case FAHRENHEIT:
				this.grados+=temp.asFahrenheit();
				break;
			}
		}
			/*otra implementacion
			 * switch (temp.escala) {
			case CELSIUS:
				switch (this.escala) {
				case CELSIUS:
					this.grados+=temp.grados;
					break;
				case FAHRENHEIT:
					this.grados+=temp.asFahrenheit();
					break;
				}
			case FAHRENHEIT:
				switch (this.escala) {
				case CELSIUS:
					this.escala+=temp.asCelsius();
					break;
				case FAHRENHEIT:
					this.escala+=temp.grados;
					break;
				}
			}*/
	}
	public void disminuir(Temperatura temp) {
		if(temp.grados>0.0) {
			switch (this.escala) {
			case CELSIUS:
				this.grados-=temp.asCelsius();
				break;
			case FAHRENHEIT:
				this.grados-=temp.asFahrenheit();
				break;
			}
		}
	}
}
