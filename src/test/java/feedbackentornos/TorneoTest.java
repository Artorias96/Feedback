package feedbackentornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.svalero.feedbackentornos.model.Torneo;
import com.svalero.feedbackentornos.model.Jugadores;
import com.svalero.feedbackentornos.model.Partido;

public class TorneoTest {
	
	private static Torneo torneo;
	
	@BeforeAll
	
	public static void crearTorneo() {
		torneo = new Torneo();
		
		Jugadores jugadorConDni = new Jugadores();
		jugadorConDni.setNombre("Paco");
		jugadorConDni.setDni("85478962D");
		torneo.registrarJugador(jugadorConDni);
	}
	
	@Test
	public void registrarJugador() {
		
		Jugadores jugadorConDni = new Jugadores();
		jugadorConDni.setNombre("Pedro");
		jugadorConDni.setDni("85478962D");
		
		Jugadores jugadorSinDni = new Jugadores();
		jugadorSinDni.setNombre("Fernando");
		jugadorSinDni.setDni(null);
		
		
		assertEquals(true, torneo.registrarJugador(jugadorConDni));
		assertEquals(false, torneo.registrarJugador(jugadorConDni));
		assertEquals(false, torneo.registrarJugador(jugadorSinDni));
		
		assertEquals(2, torneo.getCantidadJugadores());
		
	}

	public void añadirPartido() {
		
		Partido nuevoPartido = new Partido("1-3", "18:00", "Bernabeu", "Real Madrid", "Èibar");
		
	}
}


