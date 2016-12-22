package ss.week2;

import org.junit.Before;
import org.junit.Test;
import ss.week1.hotel.Guest;
import ss.week1.hotel.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Testprogram for Room and Guest.
 * Lab Exercise SoftwareSystems
 * @author Arend Rensink, Jip Spel
 * @version $Revision: 1.2 $
 */
public class RectTest {
    /** Testvariabele for a <tt>Guest</tt>-object. */
    private Rectangle rect0;
    private Rectangle rect1;

    /**
     * Sets initial variables to a well-defined initial value.
     * <p>
     * Assigns a <tt>Guest</tt> object to the <tt>ot</tt> instance variable
     * with the name <tt>&quot;Ot&quot;</tt> and assigns a <tt>Guest</tt> object
     * to the <tt>sien</tt> instance variable with the name <tt>&quot;Sien&quot;</tt>.
     * Also assigns <tt>Room</tt> objects to instance variables <tt>k101</tt> and
     * <tt>k102</tt> with numbers <tt>101</tt> and <tt>102</tt> respectively.
     * Lastly, checks in <tt>sien</tt> in room <tt>k102</tt>.
     */
    @Before
    public void setUp() {
        // initialisation of Guest-variables
        rect0 = new Rectangle(1,1);
        rect1 = new Rectangle(2,3);
    }

    /**
     * Test if the initial condition complies to the specification.
     */
    @Test
    public void testInitialcondition() {
        assertEquals(1, rect0.length());
        assertEquals(1, rect0.width());
        assertEquals(2, rect1.length());
        assertEquals(3, rect1.width());
    }

    /**
     * Tests area calculation
     */
    @Test
    public void testArea() {
        assertEquals(1, rect0.area());
        assertEquals(6, rect1.area());
    }

    /**
     * Checks perimeter calculation
     */
    @Test
    public void testPerimeter() {
        assertEquals(4, rect0.perimeter());
        assertEquals(10, rect1.perimeter());
    }

}
