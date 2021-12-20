import campus.Campus;
import dataConvert.DataLayer;
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

        /**
         * LOGIN:  Iris
         * Password: TVSomeren
         */

//        IdAndPasswords idandpasswords = new IdAndPasswords();
//        new LoginPage(idandpasswords.getLoginInfo());

        DataLayer dataLayer = new DataLayer();
        Gymnast gymnast = dataLayer.getGymnasts()[0]; ;
        Campus campus = new Campus();
        CampusPage campusPage = new CampusPage(campus, gymnast );







    }

}


