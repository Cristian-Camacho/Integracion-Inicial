package ar.edu.utn.java.inicial.programa;

import ar.edu.utn.java.inicial.modelo.*;

public class Main {

	public static void main(String[] args) 
	{
		
		CorreoElectronico mail1 = new CorreoElectronico();
		EnviadorDeCorreos cartero = new EnviadorDeCorreos();

		
		mail1.setDireccion("unMail@edu.com");
		mail1.setAsunto("El asunto del mail que voy a mandar es este texto");
		
		cartero.EnviarCorreo(mail1);

	}

}
