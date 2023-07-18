package holamundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.RealizarOperacion(4, 5,"S");
		System.out.println("Resultado de la suma es: " + resultado);

		Calculadora calculadora2 = new Calculadora(4,9);
		String resultadoConEnteros = calculadora2.ValoresCampos();
		System.out.println("Resultado de el metodo resultadoConEnteros: " + resultadoConEnteros);
		
		Calculadora calculadora3 = new Calculadora();
		int resultadoOperaciones = calculadora3.RealizarOperacion(5,3, "M");
		System.out.println("Resultado de metodo RealizarOperaciones : " + resultadoOperaciones);
	}

}
