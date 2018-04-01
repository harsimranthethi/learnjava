public class weekday {
  public static void main(String[] args){
    String day = args[0];
    System.out.println(day);

    switch(day.toLowerCase()){
      case "mon":
      case "monday":
        System.out.println("It's going to be a long week");
        break;
      case "tue":
      case "tuesday":
        System.out.println("The week has only begun");
        break;
      case "wed":
      case "wednesday":
        System.out.println("You're halfway through");
        break;
      case "thurs":
      case "thursday":
        System.out.println("Almost there!");
        break;
      case "fri":
      case "friday":
        System.out.println("Yeah!! You survived!");
        break;
      case "sat":
      case "sun":
      case "saturday":
      case "sunday":
        System.out.println("Have a nice day!");
        break;
      default:
        System.out.println("What Day ?!?!");
    }

  }
}
