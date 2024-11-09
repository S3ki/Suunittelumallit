package Viikko11.Builder;

public interface ComputerBuilder {
    void buildMotherboard();
    void buildRam();
    void buildHardDrive();
    void buildGraphicsCard();
    void buildOperatingSystem();
    void buildProcessor();

    void displayComponents();

}
