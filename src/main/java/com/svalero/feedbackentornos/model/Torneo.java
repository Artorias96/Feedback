package com.svalero.feedbackentornos.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Torneo {
	
	private static Scanner teclado = new Scanner(System.in);

	private List<Jugadores> jugadores;
	private List<Equipo> equipos;
	
	private List<Partido> partidos;
	
	public Torneo() {
		jugadores = new ArrayList<>(); 
		equipos = new ArrayList<>();
		partidos = new ArrayList<>();
	}
	
	public void RegistrarJugador(Jugadores nuevoJugador) 
	{
		System.out.println("Nombre");
			String nombre=teclado.next();
			nuevoJugador.setNombre(nombre);
		System.out.println("Apellidos");
		    String apellidos=teclado.next();
		    nuevoJugador.setApellidos(apellidos);
		System.out.println("Fecha Nacimiento");
			String fechaNac=teclado.next();
			nuevoJugador.setFechaNac(fechaNac);
		System.out.println("Direccion");
			String direccion=teclado.next();
			nuevoJugador.setDireccion(direccion);
		System.out.println("Telefono");
			String telefono=teclado.next();
			nuevoJugador.setTelefono(telefono);
		System.out.println("Dni");
			String dni=teclado.next();
			nuevoJugador.setDni(dni);
			
		System.out.println("Hemos Registrado el usuario " + nuevoJugador.getNombre());
		String freno=teclado.next();
	}
	
	
	public void añadirEquipo(Equipo equipo) {
		
	}
	
	public void formarEquipo(Equipo NuevoEquipo) {
		
		System.out.println("Nombre");
		String nombre=teclado.next();
		NuevoEquipo.setNombre(nombre);
	System.out.println("Patrocinador");
	    String patrocinador=teclado.next();
	    NuevoEquipo.setPatrocinador(patrocinador);
	System.out.println("Color Camiseta");
		String colorcamiseta=teclado.next();
		NuevoEquipo.setColorCamiseta(colorcamiseta);
	System.out.println("Camiseta");
		String camiseta=teclado.next();
		NuevoEquipo.setCamiseta(camiseta);
	System.out.println("Color segunda camiseta");
		String colorcamiseta2=teclado.next();
		NuevoEquipo.setColorCamiseta2(colorcamiseta2);
	System.out.println("Categoria");
		String categoria=teclado.next();
		NuevoEquipo.setCategoria(categoria);
		
	System.out.println("El equipo " + NuevoEquipo.getNombre() + " fue registrado correctamente");
	String freno=teclado.next();
		
	}
	
	
	public boolean registrarJugador(Jugadores jugador) {
		for(Jugadores unJugador : jugadores) {
			if(unJugador.getNombre().equals(jugador.getNombre()))
					return false;
		}
		
		if (jugador.getDni()==null)
			return false;
		
		jugadores.add(jugador);
		return true;
		
	}
	
	public int getCantidadJugadores() {
		return jugadores.size();
	}
	
}
