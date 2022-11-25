package capaPresentacion.Ciudades;
import java.util.Optional;

import capaServicio.CiudadService;
import capaServicio.ProvinciaService;
import Pojo.Ciudad;
import Pojo.Provincia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;



@Controller
@RequestMapping("/ciudadEditar")
public class CiudadEditarController {
	
	private CiudadService servicioCiudad;
	
    private ProvinciaService servicioProvincia;
    
    @RequestMapping(path = {"", "/{id}"},method=RequestMethod.GET)
    public String preparaForm(Model modelo, @PathVariable("id") Optional<Long> dni) throws Exception {
    	if (dni.isPresent()) {
    		Ciudad entity = servicioCiudad.getById(dni.get());
    		CiudadForm form = new CiudadForm(entity);
			modelo.addAttribute("formBean", form);
		} else {
 
	       modelo.addAttribute("formBean",new CiudadForm());
		}
       return "ciudadEditar";
    }

}
