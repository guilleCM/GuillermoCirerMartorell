package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	
	//propiedades
	private String tarjetaCredito = null;
	private String origen = null;
	private String destino = null;
	private double distancia = 0.0;
	private int tiempoEsperadoMinutos = 0;
	private double costeEsperado = 0.0;
	
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
	
	public int getTiempoEsperado() {
		return this.tiempoEsperadoMinutos;
	}
	
	//metodos
	public double getCosteEsperado() {
		return Tarifa.getCosteTotalEsperado(getDistancia(), getTiempoEsperado());
	}
}
