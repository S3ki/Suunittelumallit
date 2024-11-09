package Viikko11.Builder;

public class GamingComputerBuilder implements ComputerBuilder {
    Computer computer;
    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildMotherboard() {
        computer.addComponent(new Component("Asus PRIME B550M"));

    }
    @Override
    public void buildRam() {
        computer.addComponent(new Component("Ram: 1x 16gb 3200mhz"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("HardDrive: 2TB/2000GB"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Nvidia Geforce RTX4090"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Windows 11"));
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("AMD Ryzen 5900X"));
    }

    @Override
    public void displayComponents() {
        System.out.println(computer.toString());
    }
}
