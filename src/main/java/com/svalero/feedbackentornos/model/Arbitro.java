package com.svalero.feedbackentornos.model;

public class Arbitro {

	private String observaciones;
	private int numeroTA;
	private int numeroTR;
	
	public Arbitro(String observaciones, int numeroTA, int numeroTR) {
		super();
		this.observaciones = observaciones;
		this.numeroTA = numeroTA;
		this.numeroTR = numeroTR;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getNumeroTA() {
		return numeroTA;
	}

	public void setNumeroTA(int numeroTA) {
		this.numeroTA = numeroTA;
	}

	public int getNumeroTR() {
		return numeroTR;
	}

	public void setNumeroTR(int numeroTR) {
		this.numeroTR = numeroTR;
	}
	
	
}
