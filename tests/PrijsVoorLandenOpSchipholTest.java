import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrijsVoorLandenOpSchipholTest {
    @Test
    public void berekenPrijsTest_500_1_wel_wel() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 500;
        int aantalPassagiers = 1;
        boolean bagageBehandeldDoorLuchthaven = true;
        boolean isNederlandseVliegtuig = true;
        double expected = 1089;

        //Act
        double actual = prijsVoorLandenOpSchiphol.berekenPrijs(vliegtuigGewicht, aantalPassagiers, bagageBehandeldDoorLuchthaven, isNederlandseVliegtuig);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void berekenPrijsTest_500_3_niet_niet() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 500;
        int aantalPassagiers = 3;
        boolean bagageBehandeldDoorLuchthaven = false;
        boolean isNederlandseVliegtuig = false;
        double expected = 150;

        //Act
        double actual = prijsVoorLandenOpSchiphol.berekenPrijs(vliegtuigGewicht, aantalPassagiers, bagageBehandeldDoorLuchthaven, isNederlandseVliegtuig);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void berekenPrijsTest_3500_1_niet_wel() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 3500;
        int aantalPassagiers = 1;
        boolean bagageBehandeldDoorLuchthaven = false;
        boolean isNederlandseVliegtuig = true;
        double expected = 605;

        //Act
        double actual = prijsVoorLandenOpSchiphol.berekenPrijs(vliegtuigGewicht, aantalPassagiers, bagageBehandeldDoorLuchthaven, isNederlandseVliegtuig);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void berekenPrijsTest_3500_3_wel_niet() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 3500;
        int aantalPassagiers = 3;
        boolean bagageBehandeldDoorLuchthaven = true;
        boolean isNederlandseVliegtuig = false;
        double expected = 1550;

        //Act
        double actual = prijsVoorLandenOpSchiphol.berekenPrijs(vliegtuigGewicht, aantalPassagiers, bagageBehandeldDoorLuchthaven, isNederlandseVliegtuig);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void berekenPrijsTest_8000_1_wel_niet() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 8000;
        int aantalPassagiers = 1;
        boolean bagageBehandeldDoorLuchthaven = true;
        boolean isNederlandseVliegtuig = false;
        double expected = 3300;

        //Act
        double actual = prijsVoorLandenOpSchiphol.berekenPrijs(vliegtuigGewicht, aantalPassagiers, bagageBehandeldDoorLuchthaven, isNederlandseVliegtuig);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void berekenPrijsTest_8000_3_niet_wel() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 8000;
        int aantalPassagiers = 3;
        boolean bagageBehandeldDoorLuchthaven = false;
        boolean isNederlandseVliegtuig = true;
        double expected = 4537.5;

        //Act
        double actual = prijsVoorLandenOpSchiphol.berekenPrijs(vliegtuigGewicht, aantalPassagiers, bagageBehandeldDoorLuchthaven, isNederlandseVliegtuig);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }
}
