public class cone {
    public static void main(String[] args) {
      double h = Double.parseDouble(args[0]) ;
      double r = Double.parseDouble(args[1]) ;
      double l = Math.sqrt(h*h+r*r);
      System.out.println(l);
      System.out.println(Math.PI*(r*l+r*r));
      double v = Math.PI*r*r*h/3;
      System.out.println(v);

      if (v>300)
      {
         System.out.println("It's a HUGE cone!!");
      } else
      {
        System.out.println("It's a Small cone");
      }


    }
}
