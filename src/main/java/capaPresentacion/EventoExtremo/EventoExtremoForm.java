package capaPresentacion.EventoExtremo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.FutureOrPresent;

import org.springframework.format.annotation.DateTimeFormat;


import Pojo.Ciudad;
import Pojo.EventoExtremo;
//cumple con todos obligatorios y fecha actual y anterior
public class EventoExtremoForm {
	
	private Long id;
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@FutureOrPresent
	private Date fecha;
	@NotNull
	private Long idCiudad;
	@NotNull
	private String descripcion;
	
	
	public EventoExtremoForm(EventoExtremo ee) {
		super();
		this.id = ee.getId();
		this.fecha = ee.getFecha();
		this.idCiudad = ee.getCiudad().getId();//aplique lo indicado de referenciar al IdCiudad que resulta mas sencillo de representar en JSON
		this.descripcion = ee.getDescripcion();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Long getIdCiudad() {
		return idCiudad;
	}


	public void setIdCiudad(Long idCiudad) {
		this.idCiudad = idCiudad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public EventoExtremo toPojo()
	{
		EventoExtremo ee = new EventoExtremo();
		ee.setId(this.getId());
		ee.setDescripcion(this.getDescripcion());
		ee.setFecha(this.getFecha());
		return ee;
	}
	// falta validacion fecha actual y posterior
	
	}

