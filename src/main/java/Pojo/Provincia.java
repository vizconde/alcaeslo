package Pojo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provincia {
	@Id
	private long idProvincia;
	
	private String nombreProvincia;
	
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
