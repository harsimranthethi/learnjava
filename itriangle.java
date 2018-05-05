import java.util.*;
class itriangle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double a,b,c;
    System.out.println("enter first side of triangle");
    a = sc.nextDouble();

    System.out.println("enter second side of triangle");
    b = sc.nextDouble();

    System.out.println("enter third side of triangle");
    c = sc.nextDouble();

    double s = (a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("triangle of sides \t"+ a + "\t" + b + "\t" + c + "\t");
    if(Double.isNaN(area) || area == 0) {
      System.out.println( "i dont think this is a triangle");

    } else { //it is a triangle
      System.out.println( "i am sure "+ area + " is the area of triangle ");

      if(area>100) {
        System.out.println("its a big triangle");
      } else {
        System.out.println("its a small triangle");
      }

      if(area>1000){ System.out.println("Actually it is pretty big");}

    }


  }
}
