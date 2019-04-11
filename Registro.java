package died.guia03.ejercicio03;
import died.guia03.ejercicio02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private final int capMaxListado=20;
	
	
	//Constructores
	public Registro() {
		this.ciudad="-";
		this.historico= new Temperatura[this.capMaxListado-1];
	}
	public Registro(String ciudad) {
		this.ciudad=ciudad;
		this.historico=new Temperatura[this.capMaxListado-1];
	}
	
	//Métodos
	private String getCiudad() {
		return this.ciudad;
	}
	public void imprimir() {
		System.out.println("Nombre de la ciudad: "+this.getCiudad());
		//System.out.println("Temperaturas registradas: "+(for(int i=0;i<=(this.capMaxListado-1);i++) this.historico[i];));
	}
	public void agregarTemperatura(Temperatura t) {
		for(int i=19;i<=this.capMaxListado-1;i--) {
			if (this.historico[i]==null) {
				this.historico[i].grados=t.grados;
				this.historico[i].escala=t.escala;
				break;
			}
		}
	}
	public double mediaAsCelsius(){
		double suma=0;
		int cont=0;
		
		for(int i=0;i<=this.capMaxListado-1;i++) {
			if(this.historico[i]!=null) {
				suma+=this.historico[i].asCelsius();
				cont++;
			}
		}
		return suma/cont;
	}
	public double mediaAsFahrenheit(){
		double suma=0;
		int cont=0;
		
		for(int i=0;i<=this.capMaxListado-1;i++) {
			if(this.historico[i]!=null) {
				suma+=this.historico[i].asFahrenheit();
				cont++;
			}
		}
		return suma/cont;
	}
	/*public double tempMaxima() { IMPLEMENTAR CON RECURSION
		tempMaximaAxu(this.historico,);
	}*/
}
