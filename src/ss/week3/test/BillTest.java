package ss.week3.test;

import org.junit.Before;
import org.junit.Test;
import ss.week3.hotel.*;



import static org.junit.Assert.*;

public class BillTest {
    private Bill bill1;
    private Bill.Item item;
    private double price1 = 105.15;
    private double price2 = 250.79;

    @Before
    public void setUp() throws Exception {
        this.bill1 = new Bill(null);
        this.item = new BasicItem("roomrent", price1);
    }

    
    @Test
    public void testAddingItems() throws Exception{
        //is 1 item correctly added to the list
        bill1.newItem(item);
        assertTrue(bill1.items[0] != null);
        assertTrue(bill1.items[1] == null);
        
        //does the to String function work
        assertTrue(bill1.items[0].toString().equals("roomrent"));
        
        //does newItem correctly add multiple items
        bill1.newItem(item);
        assertTrue(bill1.items[1] != null);
        assertTrue(bill1.items[2] == null);
    }
    
    
    @Test
    public void testGetSum() throws Exception {     
        //does the getSum function work
        //4 times the same item ==> getSum() == 4*pirce1
        bill1.newItem(item);
        bill1.newItem(item);
        bill1.newItem(item);
        bill1.newItem(item);
        // bill1.newItem(new BasicItem("roomrent", price2));
        assertTrue(bill1.getSum() == (4*price1));       
    }
    
    @Test
    public void testClose() throws Exception {  
        bill1.newItem(item);
        bill1.newItem(item);
        bill1.newItem(item);
        bill1.newItem(item);
        bill1.close();
    }
    
    

}