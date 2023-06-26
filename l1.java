/*class len1
  {
    public static void main(String args[])
    {
     String str="hello";
      int length=0;
      int index=0;
      while(index<str.length())
        {
          length++;
          index++;
        }
      System.out.println("the length is:" +length); 
    }
  }*/

class l1
  {
    public static void main(String args[])
    {
      String str="hello";
      int count=0;
      char a[]=str.toCharArray();
      for(int i=0;i<str.length();i++)
        {
          count++;
        }
      System.out.println("length is:" +count);
    }
  }