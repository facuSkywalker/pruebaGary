package Cerradura;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCerradura {
	@Test
	public void queUnaCerraduraNuevaEstaCerrada(){
		//1. Preparación
		Cerradura miCerradura = new Cerradura(1234, 3);
		//2. Ejecución
		Boolean estadoCerradura = miCerradura.estaAbierta();
		//3. Contrastación
		assertFalse("",estadoCerradura);
		}
	

	@Test
    public void queSeBloqueeCuandoSeFallaElMaximo() {
         Cerradura x = new Cerradura(1234, 1);
           
            Integer a = 1236;
           
            x.abrir(a);
            x.abrir(a);
            x.abrir(a);
            x.abrir(a);
           
            Boolean abierto =  x.fueBloqueada();
           
            assertTrue("", abierto);
    }
    @Test
    public void queNoSeAbraBloqueda() {
         Cerradura x = new Cerradura(1234, 3);
         Integer z = 1234;
         Integer a = 1236;
           
            x.abrir(a);
            x.abrir(a);
            x.abrir(a);
            x.abrir(a);
           
            x.abrir(z);
   
            Boolean abierto =  x.estaAbierta();
           
            assertFalse("", abierto);
    }
    @Test
    public void Contadores() {
         Cerradura x = new Cerradura(1234, 10);
        
         Integer a = 1236;
           
            x.abrir(a);
            x.abrir(a);
            x.abrir(a);
            x.abrir(a);
           
        Integer z = 1234;
       
            x.abrir(z);
           
            x.cerrar();
           
            x.abrir(z);
           
            assertEquals(x.contarAperturasExitosas(), 2);
           
            assertEquals(x.contarAperturasFallidas(), 4);
           
   
   
    }

}
