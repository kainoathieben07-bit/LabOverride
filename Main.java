import java.util.Scanner;
class Employee {
    String name;
    String stat;
    double calc(){
        return 0.0;
    }
}
class Full extends Employee{
    double base;
    double bonus;

    @Override
    double calc() {
        return base+bonus;
        }
    void displayFull(){System.out.println("Employee name: "+name
            + "\nEmployee type: "+stat+"\nBase pay: $"+base+
            "\nBonus: $"+bonus+"\nMonthly Salary: $"+calc());}
    }
class Part extends Employee{
    double hrs;
    double mny;

    @Override
    double calc(){
        return hrs * mny;
    }
    void displayPart(){System.out.println("\nEmployee name: "+name
            +"\nEmployee type: "+stat+"\nHours worked: "+hrs
            +"\n Hourly rate: $"+mny+"\nMonthly Salary: $"+calc());}
    }
void main(String[] args) {
    Scanner dih = new Scanner(System.in);
    System.out.println("\nEnter employee type (full-time/part-time):");
    String ft = "Full-time";
    String pt = "Part-time";
    String enter = dih.nextLine();

    if (enter.equalsIgnoreCase(ft)){
        Full puh = new Full();
        puh.stat="Full-time";
        System.out.println("\nEmployee name:");
        puh.name = dih.nextLine();

    System.out.println("\nEnter monthly base pay:");
    puh.base= dih.nextDouble();

    System.out.println("\nEnter bonus:");
    puh.bonus= dih.nextDouble();
    puh.displayFull();}

    if(enter.equalsIgnoreCase(pt)){
        Part cuh = new Part();
        cuh.stat= "Part-time";
        System.out.println("\nEmployee name:");
    cuh.name = dih.nextLine();

    System.out.println("\nEnter hourly rate (in $):");
    cuh.mny=dih.nextDouble();

    System.out.println("\nEnter hours worked this month:");
    cuh.hrs=dih.nextDouble();

    cuh.displayPart();}
}
