//calculate the tax to pay

//till 2 L no tax
//till 5L - 10 % over 2 Lakh
//till 10L - 20 % over 5 Lakh
//more than 10L 30% over 10 Lakh
// print the total tax as percent of income

// enter value in lakh - like 2,25,000 = 2.25

public class incometax{
  public static void main(String[] args){
    double s = Double.parseDouble(args[0]);
    System.out.println(tax(s)/s*100);
    System.out.println(tax(s)*100000);
  }

  public static double tax(double income){
    if(income<=2){
      return 0;
    } else if(income <=5){
      return 0.1*(income-2);
    } else if(income <=10){
      return 0.1*(5-2)+ 0.2*(income-5);
    } else {
      return 0.1*(5-2)+ 0.2*(10-5) + 0.3 * (income -10);
    }
  }

}
