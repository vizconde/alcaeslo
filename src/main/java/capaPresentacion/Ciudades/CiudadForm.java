package capaPresentacion.Ciudades;

import Pojo.Ciudad;
public class CiudadForm {
	
	private Long id;
	
	private String nombre;

	private Long idProvincia;
	
	public CiudadForm() {
		super();
	}
	public CiudadForm(Ciudad c) {
		super();
		this.id=c.getId();
		this.nombre=c.getNombre();
		this.idProvincia=c.getProvincia().getIdProvincia();
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Long getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}
	
	public Ciudad toPojo()
	{
		Ciudad c = new Ciudad();
		c.setId(this.id);
		c.setNombre(this.getNombre());
		return c;
	}
}
