package capaServicio;

import java.util.List;

import capaPresentacion.Personas.PersonasBuscarForm;
import Excepciones.Excepcion;
import Pojo.Persona;

public interface PersonaService {



	List<Persona> getAll();

	List<Persona> filter(PersonasBuscarForm filter) throws Excepcion;

	/**
	 * Si la persona existe la actualizará, sino la creará en BD
	 * @param persona
	 * @throws Exception 
	 */
	void save(Persona persona) throws Excepcion;

	/**
	 * permite obtener una persona determinada 
	 * @param idPersona identificador de la persona buscada
	 * @return persona encontrada o null si no encontr{o la persona
	 * @throws Exception ante un error
	 */
	Persona getPersonaById(Long idPersona) throws Exception;

	void deletePersonaByid(Long id);

	
}
