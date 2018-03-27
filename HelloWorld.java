public class HelloWorld {
    public static void main(String[] args) {
      double a = Double.parseDouble(args[0]) ;
      double b = Double.parseDouble(args[1]) ;
      double c = Double.parseDouble(args[2]) ;

      double sq = Math.sqrt(b*b-4*a*c);

      double r1 = (-1*b + sq)/(2*a);
      double r2 = (-1*b - sq)/(2*a);

      System.out.println(r1);
      System.out.println(r2);
    }
}
