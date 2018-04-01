public class wordsplit {
    public static void main(String[] args) {
      String s = args[0] ;
      for(int i = 0; i <s.length();i++){
        System.out.println(s.substring(i,i+1));
      }

    }
}
