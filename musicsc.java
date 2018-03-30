//Write a program to find frequencies of notes from middle C to next C

public class musicsc{
  public static void main(String[] args){

    double c = 55;
    double r = Math.pow(2,(1.0/12));
    double freq = 0;
    for(int i=0;freq<20000;i++){
      freq = c * Math.pow(r,i);
      System.out.println(i);
      System.out.println(freq);
    }
  }
}
