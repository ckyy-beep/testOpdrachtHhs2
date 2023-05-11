public class PrijsVoorLandenOpSchiphol {

    public static double meerDanTweePassagiers =  1.5;
    public static double bagageAfhandelingDoorSchiphol = 800;
    public static double btwVoorNederlandsVliegtuig =  21;

    public double berekenPrijs (int vliegtuigGewicht, int aantalPassagiers, boolean bagageBehandeldDoorLuchthaven, boolean isNederlandsVliegtuig) {
        double landingFee;

        if (vliegtuigGewicht < 1000) {
            landingFee = 100;
        } else if (vliegtuigGewicht >= 1000 && vliegtuigGewicht < 5000) {
            landingFee = 500;
        } else {
            landingFee = 2500;
        }

        if (aantalPassagiers > 2) {
            landingFee *= meerDanTweePassagiers;
        }

        if (bagageBehandeldDoorLuchthaven) {
            landingFee += bagageAfhandelingDoorSchiphol;
        }

        if (isNederlandsVliegtuig) {
            double tax = (landingFee * btwVoorNederlandsVliegtuig) / 100;
            landingFee += tax;
        }

        System.out.println("The landing fee is: " + landingFee + " euros.");

        return landingFee;

    }

    public double checkPrijsVolgensGewichtVanVliegtuig(int vliegtuiGewicht) {
        if (vliegtuiGewicht <= 0) {
            return 0;
        } else if (vliegtuiGewicht < 1000) {
            return 100;
        } else if (vliegtuiGewicht >= 1000 && vliegtuiGewicht < 5000) {
            return 500;
        } else {
            return 2500;
        }
    }
}
