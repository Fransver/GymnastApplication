import campus.Campus;
import dataConvert.DataLayer;
import interfaces.IDataLayer;
import models.Gymnast;
import ui.*;


/**
 * Belangrijkste to do acties:
 *
 * 1. User doorgeven vanuit de login
 * 2. Verder werken aan Single Responsibility
 * 3. Projectstructuur uitbreiden met modules.
 * 4. Nieuwe poging Json testen aanmaken.
 *
 */

public class Main {

    public static void main(String[] args) throws Exception {

        IDataLayer dataLayer = new DataLayer(); //Interface vanuit de dataLayer
        Campus campus = new Campus(dataLayer);
        CampusPage campusPage = new CampusPage(campus); //







    }

}


