public class ooemp{
  public static void main(String args[]){

    Employee jitendra = new Employee();
    jitendra.Empid = 100;
    jitendra.Name = "Jtiendra Pal Thethi";
    jitendra.Sal = 2000;

    jitendra.Show();
    jitendra.Pay();
    jitendra.Show();
    jitendra.Increment();
    jitendra.Show();


    Employee sim = new Employee();
    sim.Empid = 201;
    sim.Name = "Harsimran";
    sim.Sal = 10000;

    sim.Show();
    sim.Pay();

    sim.setSSN(50);


    }

}


class Employee{
  public int Empid;
  public String Name;
  public int Sal;
  private int SSN ;

  public void Show(){
    System.out.println("Employee " + Empid + " with name " + Name +" has sal of "+ Sal);
  }

  public void setSSN(int s){
    SSN = s;
  }

  public void Pay(){
    Sal += 100;
    System.out.println(Name + " was paid now sal = " + Sal);
  }

  public void Increment(){
    System.out.println("Congratulations " + Name);
    Sal = Sal * 2;
  }


}
