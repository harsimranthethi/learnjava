public class sumgp {
    public static void main(String[] args) {
      double a = Double.parseDouble(args[0]) ;
      double r = Double.parseDouble(args[1]) ;
      double n = Double.parseDouble(args[2]) ;

      double sum = 0;

      for(int i = 1; i<=n ; i++){
        double term = Math.pow(r,(i-1))*a;
        sum=sum+term;
        System.out.println(i + " - " + term+ " - " + sum);
      }

      double calc_sum = a*(Math.pow(r,n)-1)/(r-1);
      System.out.println(calc_sum);
    }
  }
