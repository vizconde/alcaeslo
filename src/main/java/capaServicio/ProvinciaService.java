package capaServicio;

import java.util.List;

import Pojo.Provincia;
public interface ProvinciaService {
	
List<Provincia> getAll();
	

	Provincia getById(Long idProv) ;

}
