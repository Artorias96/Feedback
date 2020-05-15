package com.svalero.feedbackentornos.model;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

	private List<Jugadores> jugadores;
	private List<Equipo> equipos;
	
	public Torneo() {
		jugadores = new ArrayList<>(); 
		equipos = new ArrayList<>();
	}
	
	public void añadirEquipo(Equipo equipo) {
		
	}
	
	public boolean registrarJugador(Jugadores jugador) {
		for(Jugadores unJugador : jugadores) {
			if(unJugador.getNombre().equals(jugador.getNombre()))
					return false;
		}
		
		jugadores.add(jugador);
		return true;
		
	}
	
}
