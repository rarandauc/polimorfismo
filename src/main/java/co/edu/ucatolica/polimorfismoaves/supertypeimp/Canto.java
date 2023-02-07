/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves.supertypeimp;

import co.edu.ucatolica.polimorfismoaves.supertype.TipoSonido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 */
public class Canto implements TipoSonido {

	public static final Logger logger = LoggerFactory.getLogger(Canto.class);
	
        @Override
	public void makeSound() {
		logger.debug("estoy cantando");
		System.out.println("estoy cantando");
		
	}

}
