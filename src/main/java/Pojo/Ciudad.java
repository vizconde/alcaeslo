package Pojo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ciudad {

@Id
 private long id;
 private String nombre;
 private Provincia provincia;
 
 
 public long getId() {
	 return id;
 }
 
 public void setId(long id) {
	 this.id = id;
 }
 
 public String getNombre() {
	 return nombre;
 }
 
 public void setNombre(String nombre) {
	 this.nombre = nombre;
 }
 
 public Provincia getProvincia() {
	 return provincia;
 }
 
 public void setProvincia(Provincia provincia) {
	 this.provincia = provincia;
 }
 
}
