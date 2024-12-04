package Viikko14.Facade;

import java.io.IOException;

public class FacadeAPI {
    API api;

    public FacadeAPI(API api) {
        this.api = api;
    }

    public String getAttributeValueFromJson(String urlString, String attributeName){
        String returningString = "";
      try {
          returningString = api.apiSetup(urlString, attributeName);
      } catch (IOException e) {
          e.printStackTrace();
      }
        return returningString;
    }

}
