
public class Ejemplo01{
	public static void main(String[] args) {
		
		int edad = 35;

		if( edad>=0 && edad<=17 ){
			System.out.println("Menor de Edad - RECIBE AUXILIO DE TRANSPORTE.");
		}else if( edad>=18 && edad<=59 ){
			System.out.println("Mayor de Edad - PAGA IMPUESTO");
		}else if( edad>=60 && edad<=120 ){
			System.out.println("Tercera Edad - RECIBE AUXILIO DE VEJEZ.");
		}else if( edad<0 || edad>120){
			System.out.println("Edad Fuera de Rango.");
		}

	}
}