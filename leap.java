public class leap{
    public static void main(String[] args){
      int a = Integer.parseInt(args[0]);
      boolean isLeap = false;
      if(a%4 == 0) {isLeap=true;}
      if(a%100 == 0) {isLeap=false;}
      if(a%400 == 0) {isLeap=true;}
      System.out.println(isLeap);

    }
  }
