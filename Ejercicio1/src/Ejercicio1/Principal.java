package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado vEmpleados[] = new Empleado[5];
		
		// Empleado 1
		vEmpleados[0] = new Empleado();
		
		//Empleado 2
		vEmpleados[1] = new Empleado("jose",27 );
		
		//Empleado 3
		vEmpleados[2] = new Empleado();
		
		//Empleado 4
		vEmpleados[3] = new Empleado();
		
		//Empleado 5
		vEmpleados[4] = new Empleado("Gustavo", 44);
		
		//Mostrar datos
		for(int i = 0; i < 5; i++)
		{
			System.out.println(vEmpleados[i].toString());
		}

		System.out.println(Empleado.devuelveProximoId());
	}

}
