package ss.week3.hotel;

public class Hotel {
    private Room room0,room1;
    private Password HPassword;
    private String name;
    
    //@requires name != null;
    //@ensures getName() == name;
    public Hotel(String name) {
        this.name = name;
        this.room0 = new Room(1);
        this.room1 = new Room(2);
        this.HPassword = new Password();
    }
    
    /*@ requires guestname != "" && this.getRoom(guestname) != null; */
    /*@ requires password != ""; */
    //@ ensures (this.getFreeRoom() != null && this.getRoom(guestname) == null && this.getPassword().testWord(password) == true) ? \result.getGuest().getName() == guestname : null;
    public Room checkIn(java.lang.String password, java.lang.String guestname)
    {
        Guest newguest;
        if(this.HPassword.testWord(password))
        {
            Room freeRoom = this.getFreeRoom();
            if (freeRoom != null)
            {
                newguest = new Guest(guestname);
                newguest.checkin(freeRoom);
                return freeRoom;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
    /*@ requires guestname != null; */
    /*@ ensures !(\old(this.getRoom(guestname).getSafe().isActive()));*/
    /*@ ensures this.getRoom(guestname).getGuest() == null; */
    public void checkOut(java.lang.String guestname)
    {
        if(guestname.length() > 0 && this.getRoom(guestname) != null)
        {
        this.getRoom(guestname).getSafe().deactivate();
        
        this.getRoom(guestname).getGuest().checkout();
        }
    }
    
    /*@ensures \result == null || \result.getGuest() == null;  */
    //@pure;
    public Room getFreeRoom()
    {
        if (this.room0.getGuest() == null) {
                return this.room0;
            }
        else if (this.room1.getGuest() == null) {
            return this.room1;
        }
        return null;
    }
    /*@ensures \result.getGuest().getName().equals(guest) || \result.getGuest() == null;*/
    //@pure;
    public Room getRoom(java.lang.String guest)
    {
        if (this.room0.getGuest() != null && this.room0.getGuest().getName() == guest) {
                return this.room0;
            }
        else if (this.room1.getGuest() != null && this.room1.getGuest().getName() == guest) {
            return this.room1;
        }
        else return null;
    }
    //@ ensures \result != null;
    /*@pure */
    public Password getPassword()
    {
        return this.HPassword;
    }
    //@ ensures \result != null;
    /*@pure */
    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        String output;
        output = "";
        if (this.room0.getGuest() != null)
        {
            output = output + this.room0.getGuest().toString();
            output = output + " in ";
            output = output + this.room0.toString();
            if (this.room0.getSafe().isActive())
            {
                output = output + ", the safe is active. ";
            }
            else
            {
                output = output + ", the safe is inactive. ";
            }
        }
        if (this.room1.getGuest() != null)
        {
            output = output + this.room1.getGuest().toString();
            output = output + " in ";
            output = output + this.room1.toString();
            if (this.room1.getSafe().isActive())
            {
                output = output + ", the safe is active. ";
            }
            else
            {
                output = output + ", the safe is inactive. ";
            }
        }
        System.out.println(output);
        return output;
    }
    /*@requires guestname.length() > 0;
    @requires nights > 0;
    @reguires outStream != null;
    @ensures (guestname.length() > 0 && this.getRoom(guestname) instanceof PricedRoom) ? \result != null : \result == null ;
    */
  public Bill getBill(String guestname, int nights, java.io.PrintStream outStream)
  {
      if (guestname.length() > 0 && nights > 0 && outStream != null && this.getRoom(guestname) instanceof PricedRoom)
      {
          Room room = this.getRoom(guestname);
          Bill bill = new Bill(outStream);
          for (int count = 0; count < nights; count++)
          {
              if (room.getSafe().isActive())
              {
                  bill.newItem((Bill.Item)room.getSafe());
              }
              bill.newItem((Bill.Item)room);
          }
          return bill;
      }
      else return null;
  }
}
