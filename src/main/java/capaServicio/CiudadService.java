package capaServicio;
import java.util.List;

import capaPresentacion.Ciudades.CiudadesBuscarForm;
import Excepciones.Excepcion;
import Pojo.Ciudad;
public interface CiudadService {
	
List<Ciudad> getAll();
	
	/**
	 * Obtiene una ciudad determinada
	 * @param idCiudad Identificador de la ciudad buscada
	 * @return Ciudad encontrada
	 */
	Ciudad getById(Long idCiudad) ;
	
	List<Ciudad> filter(CiudadesBuscarForm filter) throws Excepcion;

	void deleteByid(Long id);

	void save(Ciudad c) throws Excepcion;


}
