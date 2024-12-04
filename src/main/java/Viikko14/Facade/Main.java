package Viikko14.Facade;

public class Main {
    public static void main(String[] args) {
        API facade = new API();

        FacadeAPI facadeAPI = new FacadeAPI(facade);

        try {
            String joke = facadeAPI.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println("Random Joke: " + joke);
        } catch (Exception e) {
            System.err.println("Error fetching Chuck Norris joke: " + e.getMessage());
        }



    }
}
