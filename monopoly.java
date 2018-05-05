public class monopoly{
  public static void main(String args[]){

    Player sim = new Player();
    sim.Name = "Simran";
    Player mahi = new Player();
    mahi.Name = "Mahika";

    sim.BankBalance = 1000;
    mahi.BankBalance = 1000;

    sim.ShowBal();
    mahi.ShowBal();

    sim.Pay(100,mahi);

    sim.ShowBal();
    mahi.ShowBal();


    }

}


class Player{
  String Name;
  int BankBalance;

  public void Pay(int amount, Player to ){
    BankBalance-= amount;
    to.BankBalance+= amount;

  }

  public void ShowBal(){
    System.out.println(Name + " bank Bal = "+ BankBalance);
  }


}
