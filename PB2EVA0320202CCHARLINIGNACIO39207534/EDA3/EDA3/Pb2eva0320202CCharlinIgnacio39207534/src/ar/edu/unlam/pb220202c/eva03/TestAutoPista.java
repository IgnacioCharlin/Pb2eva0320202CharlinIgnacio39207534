package EDA3.Pb2eva0320202CCharlinIgnacio39207534.src.ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAutoPista {

	 private static final Class<VehiculoNotFounException> expected = null;
	@Test
		public void queSePuedaRegistrarTelepase () {
			Autopista oeste = new Autopista();
			Vehiculo fiat = new Vehiculo("aa548cd", 100, 130);
			assertTrue(oeste.registrarTelepase(100, fiat));
		}
	 	@Test (expected = VehiculoNotFounException.class)
		public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException{
	 		Autopista oeste = new Autopista();
			Vehiculo fiat = new Vehiculo("aa548cd", 100, 130);
			assertTrue(oeste.registrarTelepase(100, fiat));
			assertTrue(oeste.ingresarAutopista(150));
			oeste.salirAutpista(fiat);
		}
	 	@Test
		public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente() throws VehiculoNotFounException{
	 		Autopista oeste = new Autopista();
	        Vehiculo auto1 = new Vehiculo("AAA111", 100, 130);
	        Camion camion1 = new Camion("CCC555", 70, 80,2);
	        Camion camion2 = new Camion("ZZZ99", 70, 80,2);
	        auto1.enInfraccion();
	        camion1.enInfraccion();
	        assertTrue(camion2.enInfraccion());
	        oeste.registrarTelepase(100, auto1);
	        oeste.registrarTelepase(110, camion1);
	        oeste.registrarTelepase(120, camion2);
	        oeste.ingresarAutopista(100);
	        oeste.ingresarAutopista(110);
	        oeste.ingresarAutopista(120);
	       
		}
		@Test
	 	public void queIngreseALaAutopista() throws VehiculoNotFounException{
	 		Autopista oeste = new Autopista();
			Vehiculo fiat = new Vehiculo("aa548cd", 100, 130);
			assertTrue(oeste.registrarTelepase(100, fiat));
			assertTrue(oeste.ingresarAutopista(100));
		}
		
		@Test
	 	public void queSalgaDeLaAutopista() throws VehiculoNotFounException{
	 		Autopista oeste = new Autopista();
			Vehiculo fiat = new Vehiculo("aa548cd", 100, 130);
			assertTrue(oeste.registrarTelepase(100, fiat));
			assertTrue(oeste.ingresarAutopista(100));
			assertFalse(!oeste.getVehiculosEnCirculacion().contains(fiat));
		}
}
