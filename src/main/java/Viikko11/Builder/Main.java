package Viikko11.Builder;

public class Main {

    public static void main(String[] args) {
        ComputerBuilder gamingPC = new GamingComputerBuilder();
        ComputerBuilder officePC = new OfficeComputerBuilder();

        ComputerDirector gamingDirector = new ComputerDirector(gamingPC);
        ComputerDirector officeDirector = new ComputerDirector(officePC);

        gamingDirector.buildGamingPC();
        officeDirector.buildPC();

        System.out.println("Gaming PC:");
        gamingDirector.showComponents();

        System.out.println("Office PC:");
        officeDirector.showComponents();
    }
}
