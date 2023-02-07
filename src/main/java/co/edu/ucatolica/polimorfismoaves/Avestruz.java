/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves;

import co.edu.ucatolica.polimorfismoaves.supertypeimp.SinCanto;
import co.edu.ucatolica.polimorfismoaves.supertypeimp.SinVuelo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 *
 */
public class Avestruz extends Ave {

	public static final Logger logger = LoggerFactory.getLogger(Avestruz.class);
	
	public Avestruz (){
		logger.debug("instanciando aveztruz");
		tipoSonido = new SinCanto();
		tipoVuelo  = new SinVuelo();
	}
	
}
