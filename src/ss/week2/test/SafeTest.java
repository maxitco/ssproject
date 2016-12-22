package ss.week2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ss.week3.hotel.Safe;


public class SafeTest {

    private Safe Safe1;
    private java.lang.String password = "testp@sswordXtrastr00ng";
    
    @Before
    public void setUp() throws Exception {
        Safe1 = new Safe(this.password);
    }

    @Test
    public void testInitialCondition() {
	    assertEquals(true,Safe1.getPassword().testWord(this.password));
		assertEquals(false,Safe1.isActive());
		assertEquals(false,Safe1.isOpen());
	}
	
	@Test
	public void  testActivate() {
	    assertEquals(false,Safe1.isActive());
	    Safe1.activate(this.password);
	    assertEquals(true,Safe1.isActive());
	}
	
	@Test
	public void testOpen() {
	    Safe1.activate(this.password);
	    assertEquals(false,Safe1.isOpen());
	    Safe1.open(this.password);
	    assertEquals(true,Safe1.isOpen());
	}
	
	@Test
	public void testDeactivate() {
	    Safe1.activate(this.password);
	    assertEquals(true,Safe1.isActive());
	    Safe1.deactivate();
	    assertEquals(false,Safe1.isActive());
	}
	
	@Test
	public void testClose() {
	    Safe1.activate(this.password);
	    Safe1.open(this.password);
	    assertEquals(true,Safe1.isOpen());
	    Safe1.close();
	    assertEquals(false,Safe1.isOpen());
	}
	@Test
	public void testMain() {
	    Safe1.main();
	}
}
