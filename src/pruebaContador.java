import static org.junit.Assert.*;
import org.junit.Test;

public class pruebaContador {

    @Test
    public void testContadorExiste() {
        Contador c = new Contador(0,1,2);
        assertNotNull(c);
    }

    @Test
    public void testContadorPorDefecto() {
        Contador c = new Contador(5);
        assertNotNull(c);
    }

    @Test
    public void testContadorIncrementar() {
        Contador c = new Contador(0,2,6);
        int expected = 2;
        assertEquals(expected, c.incrementar());  
    }

    @Test
    public void testContadorSuperarLimite() {
        Contador c = new Contador(1,3,3);
        int expected = 1;
        assertEquals(expected, c.limite()); 
        System.out.println("Se superó el límite"); 
    }

    @Test
    public void testContadorConocerValorActual() {
        Contador c = new Contador(0,2,8);
        int expected = 2;
        c.incrementar();
        assertEquals(expected, c.valorActual()); 
        System.out.println("Valor actual: " + c.valorActual());
    }

    @Test
    public void testContadorResetearValorActual() {
        Contador c = new Contador(0,2,6);
        int expected = 0;
        assertEquals(expected, c.resetear()); 
    }
    

}
