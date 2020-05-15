package com.svalero.feedbackentornos.model;

public class Equipo {

	private String nombre;
	private String patrocinador;
	private String colorCamiseta;
	private String camiseta;
	private String colorCamiseta2;
	private String categoria;
	
	
	public Equipo(String nombre, String patrocinador, String colorCamiseta, String camiseta, String colorCamiseta2,
			String categoria) {
		super();
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.colorCamiseta = colorCamiseta;
		this.camiseta = camiseta;
		this.colorCamiseta2 = colorCamiseta2;
		this.categoria = categoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPatrocinador() {
		return patrocinador;
	}


	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}


	public String getColorCamiseta() {
		return colorCamiseta;
	}


	public void setColorCamiseta(String colorCamiseta) {
		this.colorCamiseta = colorCamiseta;
	}


	public String getCamiseta() {
		return camiseta;
	}


	public void setCamiseta(String camiseta) {
		this.camiseta = camiseta;
	}


	public String getColorCamiseta2() {
		return colorCamiseta2;
	}


	public void setColorCamiseta2(String colorCamiseta2) {
		this.colorCamiseta2 = colorCamiseta2;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
