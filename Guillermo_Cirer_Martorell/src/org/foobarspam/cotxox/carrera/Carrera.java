package org.foobarspam.cotxox.carrera;

public class Carrera {
	
	//propiedades
	String tarjetaCredito = null;
	String origen = null;
	String destino = null;
	double distancia = 0.0;
	int tiempoEsperadoMinutos = 0;
	Tarifa costeEsperado = null;
	
	//constructores
	public Carrera(){
	}
	
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	//setters
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void setTiempoEsperado(int minutosEstimados) {
		this.tiempoEsperadoMinutos = minutosEstimados;
	}
	
	//getters
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}
	
	public String getOrigen() {
		return this.origen;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
}
