// Java code to explain how to generate random password
 
// Here we are using random() method of util class in Java
import java.util.*;
public class NewClass
{
    public static void main(String[] args)
    {
        // Length of your password as I have choose here
        // to be 8
        int length = 10;
        System.out.println(geekPassword(length));
    }
 
    // This our Password generating method
    // We have used static here, so that we not to make
    // any object for it
    static char[] geekPassword(int len)
    {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
 
        // A strong password has Cap_chars, Lower_chars, numeric
        // value and symbols. So we are using all of them to
        // generate our password
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@_";
 
        String values = capitalChars + smallChars + numbers + symbols;
 
        // Using random method
        Random rndm_method = new Random();
 
        char[] password = new char[len];
 
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = 
               values.charAt(rndm_method.nextInt(values.length()));
        }
 
        return password;
    }
}