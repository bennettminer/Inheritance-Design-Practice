public class Employee extends Person{
    double payRate;
    double hoursWorked;
    String department;
    double wage;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    public Employee(){
        super();
        payRate = 0.0;
        hoursWorked = 0.0;
        department = "N/A";
    }

    public Employee(double payRate1, double hoursWorked1, String department1, String firstName1, String lastName1){
        super(firstName1, lastName1);
        payRate = payRate1;
        hoursWorked = hoursWorked1;
        department = department1;
    }

    public double calculatePay(){
        double regPay;
        double overPay = 0;
        double overHours = hoursWorked - HOURS;

        regPay = HOURS * payRate;
        if (hoursWorked > HOURS){
            overPay = overHours * payRate * OVERTIME;
        }
        wage = regPay + overPay;
        return wage;
    }

    public String toString(){
        return "The wages for " + firstName + " " + lastName + " from the " + department + " department are: $" + wage; 
    }

    public void print(){
        System.out.println("The employee " + firstName + " " + lastName + " from the " + department + " department worked " + hoursWorked + " hours with a pay rate of $" + payRate + ". The wages for this employee are $" + wage);
    }

    public void setAll(String firstName1, String lastName1, double payRate1, double hoursWorked1, String department1){
        firstName = firstName1;
        lastName = lastName1;
        payRate = payRate1;
        hoursWorked = hoursWorked1;
        department = department1;
    }

    public double getPayRate(){
        return payRate;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    public String getDepartment(){
        return department;
    }

    public boolean equals(Object o){
        if (o == firstName){
            return true;
        }
        else {
            if (o == lastName){
                return true;
            }
            else {
                return false;
            
            }
        }
    }
}