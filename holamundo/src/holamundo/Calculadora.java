package holamundo;

public class Calculadora {

	public int numero1;
	public int numero2;
	public float numero3;
	public float numero4;
	
	
	public Calculadora() {}

	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public Calculadora(float numero1, float numero2) {
		this.numero3 = numero1;
		this.numero4 = numero2;
	}
	
	private int Suma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	private int Resta(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	private int Multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	private int Division(int numero1, int numero2) {
		return numero1 / numero2;
	}
	
	public int RealizarOperacion(int numero1, int numero2, String operacion) {
		int resultado = 0;
		
		switch (operacion) { 
	    case "S":
	    	resultado = Suma(numero1, numero2);
	     break;
	    case "R":
	    	resultado = Resta(numero1, numero2);
		     break;
	    case "M":
	    	resultado = Multiplicacion(numero1, numero2);
		     break;
	    case "D":
	    	resultado = Division(numero1, numero2);
		     break;
		}
		return resultado;
		
	}
	
	public String ValoresCampos() {
		return "Variable numero1 es: " + numero1 + " y variable numero2 es: " + numero2;
	}
}
