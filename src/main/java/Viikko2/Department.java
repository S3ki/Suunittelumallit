package Viikko2;

import java.util.ArrayList;
import java.util.List;

public class Department extends Entity {
    private List<Entity> employees = new ArrayList<>();

    public Department(String name) {
        super(name);
    }


    @Override
    public void printData() {
        System.out.println("This is deparment: " + name + " and it has employees: ");
        for (Entity employee : this.employees) {
            employee.printData();
        }
        System.out.println(""); // Empty line for better readability, very janky i know.
    }

    @Override
    public void add(Entity entity) {
        this.employees.add(entity);
    }

    @Override
    public void remove(Entity entity) {
        this.employees.remove(entity);
    }

    @Override
    public double getSalary() {
        double salary = 0;
        for (Entity employee : this.employees) {
            salary += employee.getSalary();
        }
        return salary;
    }
    @Override
    public String toXml() {
        StringBuilder xml = new StringBuilder();
        xml.append("<Department name=\"" + name + "\">\n");
        for (Entity component : this.employees) {
            xml.append(component.toXml()).append("\n");
        }
        xml.append("</Department>");
        return xml.toString();
    }
}
