public class logic{
  public static void main(String[] args){
    double r1=3,r2=2, v, ar,a=3,b=4,c=5,d=6,x=1,y=2,z=3,yy,m1=3,m2=1,g=9.81,fa,ta;
    double pi = 3.14;
    v= 2/3*pi*( Math.pow(r1,3)-Math.pow(r2,3));
    ar = pi*(3*Math.pow(r1,2)-Math.pow(r2,2));
    ta = Math.pow((a+b),2) + Math.pow((c+d),2);
    fa=2*m1*m2*g/(m1+m2);

    System.out.println(v);
    System.out.println(ar);
    System.out.println(ta);
    System.out.println(fa);

    int m = 15, n=20, p=-4;
    System.out.println(m>=20&&m<=30);
    System.out.println(m!=15 && n!=20);
    System.out.println("-----");
    System.out.println(m>=n||n>=m && p<m);
    System.out.println("-----");
    System.out.println(m>=n);
    System.out.println(n>=m );
    System.out.println(m>=n||n>=m );
    System.out.println(p<m);



  }
}
