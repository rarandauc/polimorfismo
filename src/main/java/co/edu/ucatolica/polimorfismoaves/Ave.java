/**
 * 
 */
package co.edu.ucatolica.polimorfismoaves;

import co.edu.ucatolica.polimorfismoaves.supertype.TipoSonido;
import co.edu.ucatolica.polimorfismoaves.supertype.TipoVuelo;



/**
 * 
 *
 */
public abstract class Ave {

		 TipoSonido tipoSonido;
		 TipoVuelo tipoVuelo;
		
		//metodos de una ave
		
	

		public void realizaVuelo(){
			tipoVuelo.vuelo();
		}
	
		public void realizaSonido(){
			tipoSonido.makeSound();
		}
}
