public class triangle {
    public static void main(String[] args) {
      double a = Double.parseDouble(args[0]) ;
      double b = Double.parseDouble(args[1]) ;
      double c = Double.parseDouble(args[2]) ;
      double p = (a+b+c)/2;
      double A = Math.sqrt(p*(p-a)*(p-b)*(p-c));
      System.out.println(A);



    }
}
