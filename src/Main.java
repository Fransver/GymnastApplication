import campus.Campus;
import dataConvert.DataLayer;
import interfaces.IDataLayer;
import ui.*;

public class Main {

    public static void main(String[] args) throws Exception {

        IDataLayer dataLayer = new DataLayer(); //Interface vanuit de dataLayer
        Campus campus = new Campus(dataLayer);
        new CampusPage(campus);
    }

}


