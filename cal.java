public class cal{
  public static void main(String[] args){
    String mo = args[0];

    switch(mo){
      case "jan":
      case "1":
      case "3":
      case "5":
      case "7":
      case "8":
      case "10":
      case "12":
        System.out.println("days 31");
        break;
      case "2":
        System.out.println("days 28 or 29");
        break;
      case "4":
      case "6":
      case "9":
      case "11":
        System.out.println("days 30");
        break;
      default:
        System.out.println("no month like that");
    }

  }
}
