
public class Calcapp {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		
		System.out.println("Suma Total");
		System.out.println(calc.suma("23" , "0.98", "16.8" , "34.9" , "9"));
		
		System.out.println("Suma Total");
		System.out.println(calc.suma(10 , 15));
		
		System.out.println("Suma Total");
		System.out.println(calc.suma(10 , 15, 20));
		
		System.out.println("Suma Total");
		System.out.println(calc.suma(10.5 , 15.5));
		
		System.out.println("Suma Total");
		System.out.println(calc.suma(10.5 , 15.5 , 20.5));
		
		
		
	}

}
