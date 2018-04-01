public class factorial{
    /*
    public static void oldmain(String[] args){
      int n = Integer.parseInt(args[0]) ;
      double fact = 1;

      for(int i = 1; i<=n ; i++){
        fact = fact * i;
      }
      System.out.println(fact);

    }
    */

    public static void main(String[] args){
      int n = Integer.parseInt(args[0]) ;
      System.out.println(fnfact(n));
    }

    public static double fnfact(int x){
      if(x==1) return 1;
      return x * fnfact(x-1);
    }

    /*
    public static double ofnfact(int x){
      double fact = 1;
      for(int i = 1; i<=x ; i++){
        fact = fact * i;
      }
      return fact;

    }
    */




  }
