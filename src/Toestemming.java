public class Toestemming {

    public boolean checkOfVliegtuigMagStijgen(boolean toestemmingVanVerkeerstoren, int geladenGewicht, int tegenWind) {
        if (toestemmingVanVerkeerstoren && (geladenGewicht < 1000 || tegenWind > 50)) {
            System.out.println("Het vliegtuig mag wel stijgen.");
            return true;
        } else {
            System.out.println("Het vliegtuig mag niet stijgen.");
            return false;
        }
    }
}
