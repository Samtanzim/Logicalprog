public class Ascii 
{
    public static void main(String[] args) 
  {
        String str = "Hello, World!";
        
        System.out.println("ASCII values of characters in: " + str );
        
        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            int asciiValue = (int) c;
            
            System.out.println("Character is:" + asciiValue);
        }
    }
}