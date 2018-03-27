public class moto{
  public static void main(String[] args){
    String house = args[0];
    System.out.println(house);

    switch(house){
      case "S":
        System.out.println("Stedfast to the end");
        break;
      case "M":
        System.out.println("Honor at all cost");
        break;
      case "L":
        System.out.println("Abide by truth");
        break;
      case "D":
        System.out.println("United in strength");
        break;
      default:
        System.out.println("no house like that");
    }

  }
}
