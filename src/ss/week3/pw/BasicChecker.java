package ss.week3.pw;


import java.math.BigInteger;


public class BasicChecker implements Checker{
        //@requires input.length() > 0;
        //@pure;
        public boolean acceptable (String input)
        {
            if(input.length() < 6 || input.contains(" ")){
                return false;
            }
            else{
            return true;
            }
        }
        //@ensures this.acceptable(\result);
        public String generatePassword()
        {
            java.security.SecureRandom random = new java.security.SecureRandom();
            /*byte bytes[] = new byte[20];
            random.nextBytes(bytes);
            String password = new String(bytes, java.nio.charset.StandardCharsets.UTF_8);
            password.replace(" ", "Y");
            */
            String password = new BigInteger(120, random).toString();
            password = "A" + password;
            password = password + "1";
            System.out.println(password);
            return password;
        }
}
