package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	
	//propiedades
	private String nombre = null;
	private String matricula = null;
	private String modelo = null;
	private ArrayList<Byte> valoraciones = new ArrayList<>();
	private boolean ocupado = false;
	
	//constructores
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	//setters
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setValoracion(byte estrellas) {
		valoraciones.add(estrellas);
	}
	
	public void setOcupado(boolean estado) {
		this.ocupado = estado;
	}

	
	//getters
	public ArrayList<Byte> getValoraciones() {
		return this.valoraciones;
	}
	
	public boolean estaOcupado() {
		return this.ocupado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
