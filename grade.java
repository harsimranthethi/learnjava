public class grade{
    public static void main(String[] args){
      int marks= Integer.parseInt(args[0]);
      String grade = "";
      if(marks>=80) {
        grade="A";
      }
      if(marks>=60 && marks<80){
        grade="B";
      }
      if(marks>=40 && marks<60){
        grade="C";

      }
      if(marks<40 ){
        grade="D";
      }
      System.out.println(grade);

    }
}
