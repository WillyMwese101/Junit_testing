import org.junit.Test;
import static org.junit.Assert.*;
public class Mathstest {
    @Test
    public void testAdd() {
        Maths mts = new Maths();
        assertEquals(20, mts.add(15,5));

    }

    @Test
    public void testSub() {
        Maths mts = new Maths();
        assertEquals(5, mts.subtract(8,3));
    }

    @Test
    public void testADD2(){
        Maths mts = new Maths();
        assertEquals("MweseziWilson", mts.add("Mwesezi", "Wilson"));
    }

    @Test
    public void testprod() {
        Maths mts = new Maths();
        assertEquals(6, mts.product(2,3));

    }

    @Test
    public void testDiv() {
        Maths mts = new Maths();
        assertEquals(3, mts.divide(9,3));

    }
}
