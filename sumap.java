public class sumap{
    public static void main(String[] args){
      double a = Double.parseDouble(args[0]) ;
      double d = Double.parseDouble(args[1]) ;
      double n = Double.parseDouble(args[2]) ;
      double sum = 0;

      for(int i = 1; i<=n ; i++){
        double term = a+(i-1)*d;
        sum=sum+term;
        System.out.println(i + " - " + term+ " - " + sum);


      }

    }
  }
