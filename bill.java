public class bill{
  public static void main(String[] args){
    int pant= Integer.parseInt(args[0]);
    int shirt= Integer.parseInt(args[1]);
    int total= pant +shirt;
    int tax= (18*total)/100;
    int total_amount=total+tax;
    System.out.println("pay " + total_amount);

    if (total_amount>320){
      total_amount -= total_amount*5/100;
      System.out.println("you got discount");
    }
    System.out.println(total_amount);
  }
}
