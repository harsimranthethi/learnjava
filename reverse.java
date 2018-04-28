
public class reverse{
  public static void main(String[] args){

    String s = args[0];
    String r = "";

    /*
    for(int i = 0; i <s.length(); i++){
      int start = s.length()-i-1;
      r += s.substring(start, start+1);
    }
    */

    for(int i = s.length(); i > 0; --i){
      String letter = s.substring(i-1, i);
      System.out.println((i-1) + " to " + i + " letter " + letter);
      r += letter;
    }

    System.out.println(r);

    System.out.println(s.equals(r));



  }
}
