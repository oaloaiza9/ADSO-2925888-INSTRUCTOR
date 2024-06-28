import java.util.Scanner;

public class Ejemplo03{
	public static void main(String[] args) {
		
		// Creando variable de entrada de datos
		Scanner teclado = new Scanner(System.in);
		Scanner teclado_texto = new Scanner(System.in);

		// Leyendo datos
		System.out.print("Ingrese Turno: ");
		byte turno = teclado.nextByte();

		System.out.print("Cantidad Estudiantes: ");
		short cant_estudiantes = teclado.nextShort();

		System.out.print("Ingrese su cedula: ");
		int cedula = teclado.nextInt();

		System.out.print("Ingrese telefono: ");
		long telefono = teclado.nextLong();

		System.out.print("Ingrese nota: ");
		float nota = teclado.nextFloat();

		System.out.print("Ingrese grados: ");
		double grados = teclado.nextDouble();

		System.out.print("Ingrese Activo (true - false): ");
		boolean activo = teclado.nextBoolean();

		System.out.print("Ingrese nombre: ");
		String nombre = teclado_texto.nextLine();

		// Imprimiendo datos
		System.out.println("Turno es: " + turno);
		System.out.println("Cant Estudiantes: " + cant_estudiantes);
		System.out.println("Cedula: " + cedula);
		System.out.println("Nota: " + nota);
		System.out.println("Grados: " + grados);
		System.out.println("Estado: " + activo);
		System.out.println("Nombre: " + nombre);

	}
}