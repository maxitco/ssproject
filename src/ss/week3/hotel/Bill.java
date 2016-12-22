package ss.week3.hotel;

public class Bill {
    private java.io.PrintStream OutStream;
    public Bill.Item[] items = new Bill.Item[20]; 
    
    
    public static interface Item{
        public String toString();
        public double getAmount();
    }
    
    
    public Bill(java.io.PrintStream OutStream){
        //something something printed if there is an outstream
        if(OutStream != null){
            System.out.println("yoyo"); 
        }
        //nada  
    }   
    
    
    public void close(){
        ss.week3.Format.printLine("Total:", getSum());          
    }
    
    //ensures that the total is equal to the sum of the values of all items in the array items (Bill.Item) 
    public double getSum(){
        double total = 0;
        int i = 0;
        while(i<=this.items.length && this.items[i] != null){
            total = total + this.items[i].getAmount();              
            i++;
        }
        return total;               
    }
    
    //@requires item != null;
    public void newItem(Bill.Item item){
        assert(item != null);
        //index for while loop
        int i = 0;
        //boolean variable to indicate if the item was added to the array
        boolean placed = false;
        
        //stops when the index exceeds the array length or when the item is added 
        while(i<=this.items.length && placed == false){
            
            //checks if the array spot is empty
            if(this.items[i] == null){
                this.items[i] = item;
                placed = true;
            }
            
            //if the item cannot be added a warning is given
            if(i == items.length && placed == false){
                System.out.println("array is full");    
            }           

            i++;
        }       
    }
    
    
    
}