package com.svalero.feedbackentornos.model;

public class Calendario {
	
	private String lugarpartido;
	private String fechapartido;
	
	
	public Calendario(String lugarpartido, String fechapartido) {
		super();
		this.lugarpartido = lugarpartido;
		this.fechapartido = fechapartido;
	}


	public String getLugarpartido() {
		return lugarpartido;
	}


	public void setLugarpartido(String lugarpartido) {
		this.lugarpartido = lugarpartido;
	}


	public String getFechapartido() {
		return fechapartido;
	}


	public void setFechapartido(String fechapartido) {
		this.fechapartido = fechapartido;
	}
	
	public void añadirPartido(Partido partido, String resultado, String hora, String lugar, String equipo1, String equipo2) {
		
	}
	
}
