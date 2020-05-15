package com.svalero.feedbackentornos.model;

public class Partido {
	
	private String resultado;
	private String hora;
	private String lugar;
	private String equipo1;
	private String equipo2;
	
	public Partido(String resultado, String hora, String lugar, String equipo1, String equipo2) {
		super();
		this.resultado = resultado;
		this.hora = hora;
		this.lugar = lugar;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}

	public String getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	
	
}
