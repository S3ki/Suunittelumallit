package Viikko11.Builder;

public class OfficeComputerBuilder implements ComputerBuilder {

    Computer computer;

    public OfficeComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildMotherboard() {
        computer.addComponent(new Component("Intel Z790"));

    }
    @Override
    public void buildRam() {
        computer.addComponent(new Component("Ram: 1x 8gb 1600mhz"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("HardDrive: 500gb"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Intel Card"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Linux Ubuntu"));
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Intel i5-U9823"));
    }

    @Override
    public void displayComponents() {
        System.out.println(computer.toString());
    }
}
