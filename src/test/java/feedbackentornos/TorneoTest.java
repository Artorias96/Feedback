package feedbackentornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.svalero.feedbackentornos.model.Torneo;
import com.svalero.feedbackentornos.model.Jugadores;

public class TorneoTest {
	
	@BeforeAll
	
	
	@Test
	public void registrarJugador() {
		Torneo torneo = new Torneo();
		
		Jugadores jugador = new Jugadores();
		jugador.setNombre("Paco");
		assertEquals(true, torneo.registrarJugador(jugador));
		assertEquals(false, torneo.registrarJugador(jugador));
		
	}

}
