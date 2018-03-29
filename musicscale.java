//Write a program to find frequencies of notes from middle C to next C

public class musicscale{
  public static void main(String[] args){

    double c = 440;
    double r = Math.pow(2,(1.0/12));
    System.out.println(440 * Math.pow(r,0));
    System.out.println(440 * Math.pow(r,1));
    System.out.println(440 * Math.pow(r,2));
    System.out.println(440 * Math.pow(r,3));
    System.out.println(440 * Math.pow(r,4));
    System.out.println(440 * Math.pow(r,5));
    System.out.println(440 * Math.pow(r,6));
    System.out.println(440 * Math.pow(r,7));
    System.out.println(440 * Math.pow(r,8));
    System.out.println(440 * Math.pow(r,9));
    System.out.println(440 * Math.pow(r,10));
    System.out.println(440 * Math.pow(r,11));
    System.out.println(440 * Math.pow(r,12));
  }
}
