public class degreeadd {
    public static void main(String[] args) {
      int h1 = Integer.parseInt(args[0]) ;
      int m1 = Integer.parseInt(args[1]) ;
      int s1 = Integer.parseInt(args[2]) ;
      int h2 = Integer.parseInt(args[3]) ;
      int m2 = Integer.parseInt(args[4]) ;
      int s2 = Integer.parseInt(args[5]) ;

      int h3, m3,s3;

      s3 = s1+s2;
      if(s3 >=60) {m2++ ; s3-=60;};

      m3 = m1+m2;

      if(m3 >=60) {h2++; m3-=60;};

      h3 = h1 + h2;

      System.out.println(h3 + ":" + m3 + ":" + s3);






    }
}
