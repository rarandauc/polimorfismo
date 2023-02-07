/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves;
 
import co.edu.ucatolica.polimorfismoaves.supertypeimp.Grasnido;
import co.edu.ucatolica.polimorfismoaves.supertypeimp.VueloConAlas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 
 *
 */
public class Gallina extends Ave {

	public static final Logger logger = LoggerFactory.getLogger(Gallina.class);
	
		public Gallina(){
			logger.debug("instnaciando una gallina");
			tipoSonido = new Grasnido();
			tipoVuelo	= new VueloConAlas();
		}
}
