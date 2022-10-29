package Pojos;

public class Pronostico {
	private int temperatura; // hay que validar que sea mayor a 0 
	private int humedad;
	// falta setear estado del clima. ¿Es un arraylist?
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getHumedad() {
		return humedad;
	}
	
	public void setHumedad(int humedad) {
		this.humedad = humedad;
		
	}
}
