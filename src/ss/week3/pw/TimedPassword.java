package ss.week3.pw;

public class TimedPassword extends Password{

    private long validTime;
    
    //@invariant this.getValidTime() > 0;
    
    /*@ensures !this.isExpired(); */
    public TimedPassword(long endtime)
    {
        super();
        this.validTime = java.lang.System.currentTimeMillis() + (endtime*1000);
    }
    
    public TimedPassword()
    {
        // 24h validity
        this(java.lang.System.currentTimeMillis() + 1000);
    }
    //@pure;
    public boolean isExpired()
    {
        return java.lang.System.currentTimeMillis() >= this.validTime;
    }
    
    //@pure;
    public long getValidTime()
    {
        return this.validTime;
    }
    
    public boolean setWord(java.lang.String oldpass, java.lang.String newpass){
        if (super.setWord(oldpass, newpass))
        {
            this.validTime = java.lang.System.currentTimeMillis() + 1000;
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
