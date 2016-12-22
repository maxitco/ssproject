package ss.week3;

import java.text.DecimalFormat;

public class Format {
 
    //@requires text.length() > 0 && !Double.isNaN(amount);
    public static void printLine(String text, double amount)
    {
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        String output = String.format("%1$-20s %2$20s", text, df.format(amount));
        System.out.println(output);
    }
    public static void main(String[] args) {
        printLine("Je moeder", 4562456272.257624724684);
        printLine("Je moeder", -456272.257624724684);
        printLine("Je moeder", 4562456272.25762684);
        printLine("Je moeder", 4562456272.257624724684);
        printLine("Je moeder", -4562272.257624724684);
        printLine("Je moeder", 45626272.257624724684);
    }
    
}
