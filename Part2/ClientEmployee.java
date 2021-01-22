public class ClientEmployee{
    public static void main(String[] args) {
        Employee emp1 = new Employee(25.50, 50, "COSC", "John", "Doe");
        emp1.calculatePay();
        System.out.println(emp1.toString());
        emp1.print();
        emp1.setAll("James", "Bond", 35, 47, "THEATRE");
        System.out.println(emp1.getFirst());
        System.out.println(emp1.getLast());
        System.out.println(emp1.getPayRate());
        System.out.println(emp1.getHoursWorked());
        System.out.println(emp1.getDepartment());
        emp1.calculatePay();
        System.out.println(emp1.toString());
        emp1.print();
        System.out.println(emp1.equals("James"));
    }
}