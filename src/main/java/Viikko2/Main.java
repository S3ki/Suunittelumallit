package Viikko2;

public class Main {
    public static void main(String[] args) {

        Department orgDepartment = new Department("Executive Team");
        Department devDepartment = new Department("Dev Team");
        Department salesDepartment = new Department("Sales Team");


        Employee boss = new Employee("Eren Yeager", 1000000);

        Employee emp1 = new Employee("Armin Zekker", 120000.320);
        Employee emp2 = new Employee("Erwin Smith", 60000);
        Employee emp3 = new Employee("Usopp Johnson", 12435);
        Employee emp4 = new Employee("Robin Nico", 42000);

        orgDepartment.add(boss);
        devDepartment.add(emp1);
        devDepartment.add(emp2);
        salesDepartment.add(emp3);
        orgDepartment.add(devDepartment);
        orgDepartment.add(salesDepartment);
        orgDepartment.add(emp4);



        devDepartment.printData();


        System.out.println("Total Salary of Organization: " + orgDepartment.getSalary() + "\n");

        System.out.println(orgDepartment.toXml());
    }
}
