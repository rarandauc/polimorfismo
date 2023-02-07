/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves.supertypeimp;

import co.edu.ucatolica.polimorfismoaves.supertype.TipoSonido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Grasnido implements TipoSonido {

	public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);
	
        @Override
	public void makeSound() {
		logger.debug("grasnando");
		System.out.println("grasnando");

	}

}
