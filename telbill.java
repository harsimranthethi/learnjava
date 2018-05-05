import java.util.*;

class telbill{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int calls = sc.nextInt();
    int bill = 0;

    if(calls<=100) bill+=380;
    if(calls>100 && calls<=200) bill+=2*(calls-100);
    if(calls>200 && calls<=300) bill+=3*(calls-200);
    if(calls>300) bill+=4*(calls-300);

    System.out.println(bill);


    }

  }
