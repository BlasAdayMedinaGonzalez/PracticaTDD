import static org.junit.Assert.*;
import org.junit.Test;

public class pruebaContador {

    @Test
    public void testContadorExiste() {
        Contador c = new Contador(0,1,2);
        assertNotNull(c);
    }
     
}