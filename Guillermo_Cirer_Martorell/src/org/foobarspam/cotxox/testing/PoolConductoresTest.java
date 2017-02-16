package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.junit.Before;
import org.junit.Test;

public class PoolConductoresTest {

	Conductor imprudente;
	Conductor prudente;
	Conductor salvaje;
	ArrayList<Conductor> pilotos = new ArrayList<>();
	PoolConductores plantilla;

	@Before
	public void setUp() {
		imprudente = new Conductor("Anakin");
		prudente = new Conductor("Obiwan");
		salvaje = new Conductor("YarYar");
		pilotos.add(imprudente);
		pilotos.add(prudente);
		pilotos.add(salvaje);
		
		plantilla = new PoolConductores(pilotos);
	}
	
	@Test
	public void testAsignarConductor() {
		Conductor obtenido = plantilla.asignarConductor();
		//Deberia aparecer un nombre distinto en cada ejecucion de manera aleatoria
		System.out.println(obtenido.getNombre());
		assertTrue(obtenido.estaOcupado());
	}

}
