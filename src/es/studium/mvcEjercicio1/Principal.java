package es.studium.mvcEjercicio1;

public class Principal
{

	public static void main(String[] args)
	{
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		new Controlador(vista, modelo);
		
	}

}
