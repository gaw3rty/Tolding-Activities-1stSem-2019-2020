public class CC2_Lab3 {
  public static void main (String [] args) {
    char a = 'J';
    char b = 'O';
    char c = 'S';
    char d = 'H';
    char e = '!';
    int num1 = a;
    int num2 = b;
    int num3 = c;
    int num4 = d;
    int num5 = e;
    int sum = (num1+num2+num3+num4+num5);
    int product = (num1*num2*num3*num4*num5);
    int average = sum/4;
    int remainder = product % average;
      System.out.println(a +"-"+  +num1);
      System.out.println(b +"-"+  +num2);
      System.out.println(c +"-"+  +num3);
      System.out.println(d +"-"+  +num4);
      System.out.println(e +"-"+  +num5);
      System.out.println("Sum: "+sum);
      System.out.println("Product: "+product);
      System.out.println("Average: "+average);
      System.out.println("Remainder: "+remainder);
  }
}     