package capaServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capaDaos.ICiudadRepo;
import capaPresentacion.Ciudades.CiudadesBuscarForm;
import Excepciones.Excepcion;
import Pojo.Ciudad;

@Service
public class CiudadServiceImpl implements CiudadService {
	
	@Autowired
	ICiudadRepo repo;

	@Override
	public List<Ciudad> getAll() {
		
		return repo.findAll();
	}



	@Override
	public Ciudad getById(Long idCiudad) {

		return repo.findById(idCiudad).get();
	}
	
	@Override
	public List<Ciudad> filter(CiudadesBuscarForm filter) throws Excepcion
	{
		//ver https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
		if(filter.getNombre()==null && filter.getProvinciaSeleccionada()==null)
			//return repo.findAll();
			throw new Excepcion("Es necesario al menos un filtro");
		else
			return repo.findByNombreOrIdProvincia(filter.getNombre(),filter.getProvinciaSeleccionada());
				
	}



	@Override
	public void deleteByid(Long id) {
		repo.deleteById(id);
		
	}



	@Override
	public void save(Ciudad c) throws Excepcion {
		if(c.getId()==0 && !repo.findByNombreAndIdProvincia(c.getNombre(), c.getProvincia().getIdProvincia()).isEmpty()) //estoy dando de alta una nueva ciudad y ya existe una igual?
			throw new Excepcion("Ya existe una ciudad con el mismo nombre, para la misma provincia");  
		else
			repo.save(c);
		
	}

}
