package ss.week3.pw;

public class Password extends ss.week3.hotel.Password {
    private Checker checker;
    public static String factoryPassword;
    
    public Password(Checker checker)
    {
        super();
        this.checker = checker;
        this.factoryPassword = this.checker.generatePassword();
        this.setWord(super.INITIAL, this.factoryPassword);
        
    }
    
    public Password()
    {
        this(new BasicChecker());
    }
}
