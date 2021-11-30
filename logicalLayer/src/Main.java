import campus.Campus;
import dataConvert.DataLayer;
import models.Gymnast;
import ui.CampusPage;


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

        Gymnast gymnast = new Gymnast(0,"","",0,0,"");
        DataLayer dataLayer = new DataLayer();



        new Campus();
        new CampusPage();





        /**
         * LOGIN:  Iris
         * Password: TVSomeren
         */

//        IdAndPasswords idandpasswords = new IdAndPasswords();
//        new LoginPage(idandpasswords.getLoginInfo());

    }

}


