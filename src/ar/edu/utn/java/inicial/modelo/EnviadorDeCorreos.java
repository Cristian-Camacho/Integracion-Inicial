package ar.edu.utn.java.inicial.modelo;

public class EnviadorDeCorreos 
{
	
	public void EnviarCorreo(CorreoElectronico correo) 
	{
		//Imprimir un mensaje que dice:
		//Enviando correo: DireccionDeCorreo con asunto: asunto
		//hint: String.format();
		
		
		System.out.println(String.format("Enviando correo a %s con asunto: %s", correo.getDireccion(), correo.getAsunto()));
		
	}

}
