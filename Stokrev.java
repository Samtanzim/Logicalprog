/*import java.util.*;
public class STokRev
  {
    public static void main(String args[])
    {
      String str="HELLO GOOD MORNING EVERYONE ALA";
      StringTokenizer st=new StringTokenizer(str," ");//[HELLO GOOD MORNING EVERYONE ALA]
      String rev=" ";
      for(int i=str.length()-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);//ALA EN
        }
      System.out.println(rev);
      while(st.hasMoreTokens())//OLLEH DOOG//TRUE 
      {
        String c=st.nextToken();//HELLO
        StringBuilder b=new StringBuilder(c);
        String d=b.reverse().toString();
        System.out.print(d+" ");//0LLEH
        if(d.equals(c))//HELLO==OLLEH ALA==ALA RADAR=RADAR
        {
          System.out.println();
          System.out.println("It is a palindrome "+c);
        }
      }
  }
  }*/