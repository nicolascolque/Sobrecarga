
public class Calcapp {
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		
		calc.mostrarresultado(calc.suma("23" , "0.98", "16.8" , "34.9" , "9"));
		
		calc.mostrarresultado(calc.suma(10 , 15));
		
		calc.mostrarresultado(calc.suma(10 , 15, 20));
		
		calc.mostrarresultado(calc.suma(10.5 , 15.5));
		
		calc.mostrarresultado(calc.suma(10.5 , 15.5 , 20.5));
		
				
	}

}
