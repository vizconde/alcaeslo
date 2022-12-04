package Pojo;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Provincia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//indica al mapeador que lo genera de manera autonumerica
	private long idProvincia;
	
	private String nombreProvincia;
	
	@OneToMany(mappedBy = "provincia")
	private List<Ciudad> ciudades;
	
	public long getIdProvincia() {
		return idProvincia;
	}
	
	public void setIdProvincia (long idProvincia) {
		this.idProvincia = idProvincia;
	}
	
	public String getnombreProvincia() {
		return nombreProvincia;
	}
	
	public void setnombreProvincia (String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	
}
