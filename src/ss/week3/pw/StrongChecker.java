package ss.week3.pw;

public class StrongChecker extends BasicChecker{

    public boolean acceptable(String input)
    {
        Character begin, end;
        begin = input.charAt(0);
        end = input.charAt(input.length()-1);
        if (Character.isAlphabetic(begin) && Character.isDigit(end))
        {
            return super.acceptable(input);
        }
        else
        {
            return false;
        }
    }
    
    public String generatePassword()
    {
        String password = super.generatePassword();
        if (!Character.isAlphabetic(password.charAt(0)))
        {
            password = "A" + password;
        }
        if (!Character.isDigit(password.charAt(password.length()-1)))
        {
            password = password + "1";
        }
        return password;
    }
    
}
