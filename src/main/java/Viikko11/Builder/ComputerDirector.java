package Viikko11.Builder;

public class ComputerDirector {
    ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    // Double RAM sticks 32GB
    void buildGamingPC(){
        computerBuilder.buildMotherboard();
        computerBuilder.buildProcessor();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildRam();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildOperatingSystem();
    }

    void buildPC(){
        computerBuilder.buildMotherboard();
        computerBuilder.buildProcessor();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildOperatingSystem();
    }

    void showComponents(){
        computerBuilder.displayComponents();
    }
}
