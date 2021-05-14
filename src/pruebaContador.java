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
        int expected = 6;
        assertEquals(expected, c.incrementar());  
    }

    

}
