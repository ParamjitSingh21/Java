class PowerofTwo
{
  public static boolean checkNumber(int n)
  {

    if (n == 0)
    {
      return false;
    }
     while (n != 1)
     {
       if (n%2 != 0){
         return false;
       }
        n = n/2;
      }
      return true;
  }
  public static void main(String[] args) {
    System.out.println("Number is power of : "+checkNumber(53));

  }
}
