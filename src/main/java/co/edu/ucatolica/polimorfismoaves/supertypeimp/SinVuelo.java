/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves.supertypeimp;

import co.edu.ucatolica.polimorfismoaves.supertype.TipoVuelo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 */
public class SinVuelo implements TipoVuelo {

	/* (non-Javadoc)
	 * @see com.cibancode.patterndesign.lab4.supertype.TipoVuelo#vuelo()
	 */
	
	public static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);
	
        @Override
	public void vuelo() {
		logger.debug("no puedo volar");
		System.out.println("no puedo volar");
	}

}
