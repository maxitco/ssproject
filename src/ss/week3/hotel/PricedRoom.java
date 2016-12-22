package ss.week3.hotel;

public class PricedRoom extends Room implements Bill.Item{
    private double price;
    
    //price of a room is per night
    
    public PricedRoom(int roomNo, double inprice, PricedSafe Safe)
    {
        super(roomNo);
        this.price = inprice;
        this.safe = Safe;
    }
    public PricedRoom(double price1, double safe_price, int roomNo){

        this(roomNo, price1,new PricedSafe(safe_price));
    }
    
    public double getAmount(){
        return this.price;
    }
    
    public String toString(){
        return "1 night in this room costs: " + Double.toString(this.price);
    }
}