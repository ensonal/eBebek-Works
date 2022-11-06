package eBebek;

public class Employee {
   private String name;
   private double salary;
   private double workHours;
   private int hireYear;
   final int CURRENT_YEAR = 2021;

   public static void main(String[] args){
       Employee e1 = new Employee("Enes",2000,45,1985);
       e1.tax();
       e1.bonus();
       e1.raiseSalary();
       System.out.println(e1.toString());

   }

   public Employee(String name, double salary, double workHours, int hireYear) {
       this.name = name;
       this.salary = salary;
       this.workHours = workHours;
       this.hireYear = hireYear;
   }

   /**
    * This returns the employee's tax.
    * @return this employee's tax
    */
   public double tax(){
       double tax = 0;
       if(salary > 1000){
            tax = salary * 0.03;
       }
       return tax;
   }

   /**
    * This returns the amount of bonus this employee is entitled to.
    * @return the amount of bonus this employee
    */
   public double bonus(){
       double bonus = 0;
       if(this.workHours > 40){
           bonus = (workHours - 40) * 30;
       }
       return bonus;
   }

   /**
    * This returns the pay increase amount for this employee.
    * @return the pay increase amount
    */
   public double raiseSalary(){
       double raise = 0;
       if(this.hireYear == CURRENT_YEAR){
           System.out.println("No raise!");
       }else if(this.hireYear < CURRENT_YEAR){
           if(CURRENT_YEAR - hireYear < 10){
               raise = salary * 0.05;
           }else if(CURRENT_YEAR - hireYear > 9 && CURRENT_YEAR - hireYear < 20){
               raise = salary * 0.10;

           }else if(CURRENT_YEAR - hireYear > 19){
               raise = salary * 0.15;

           }
       }
       return raise;
   }

   /**
    * Prints all the employee's information.
    */
   @Override
   public String toString() {
       return "Adı: " + name + "\n" +
               "Maaşı: " + salary + "\n" +
               "Çalışma Saati: " + workHours + "\n" +
               "Başlangıç Yılı: " + hireYear + "\n" +
               "Vergi: " +  tax() + "\n" +
               "Bonus: " + bonus() + "\n" +
               "Maaş Artışı: " + raiseSalary() + "\n" +
               "Vergi ve Bonuslar ile birlikte maaş: " + (salary - tax() + bonus()) + "\n" +
               "Toplam Maaş: " + (salary - tax() + bonus() + raiseSalary()) ;
   }
}