/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves.supertypeimp;

import co.edu.ucatolica.polimorfismoaves.supertype.TipoVuelo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *Esta clase especifica el vuelo de un ave
 */
public class VueloConAlas implements TipoVuelo {


	
	public static final Logger logger =LoggerFactory.getLogger(VueloConAlas.class);
	
        @Override
	public void vuelo() {
		logger.debug("Esta volando, aleteando");
		System.out.println("Esta volando, aleteando");

	}

}
