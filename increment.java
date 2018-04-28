public class increment{
  public static void main(String[] args){
    int count=0,sum=0;
    sum+=++count;
    System.out.println("the value of the sum at first stage is "+sum);
    sum+=count++;
    System.out.println("the value of the sum at second stage is "+sum);
    sum=++count;
    System.out.println("the value of the sum at third stage is "+sum);
    count++;
    System.out.println("the value of the sum at fourth stage is "+count);
    ++count;
    System.out.println("the value of the sum at fifth stage is "+count);
  }
}
