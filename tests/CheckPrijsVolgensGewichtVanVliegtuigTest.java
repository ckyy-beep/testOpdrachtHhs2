import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckPrijsVolgensGewichtVanVliegtuigTest {
    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_0Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 0;
        double expected = 0;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_500Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 500;
        double expected = 100;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_999Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 999;
        double expected = 100;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_1000Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 1000;
        double expected = 500;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_4999Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 4999;
        double expected = 500;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_5000Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 5000;
        double expected = 2500;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void checkPrijsVolgensGewichtVanVliegtuigTest_8888Gewicht() {
        //Arrange
        PrijsVoorLandenOpSchiphol prijsVoorLandenOpSchiphol = new PrijsVoorLandenOpSchiphol();
        int vliegtuigGewicht = 8888;
        double expected = 2500;

        //Act
        double actual = prijsVoorLandenOpSchiphol.checkPrijsVolgensGewichtVanVliegtuig(vliegtuigGewicht);

        //Assert
        System.out.println("Expected: " + expected);
        System.out.println("Actual  : " + actual);
        assertEquals(expected, actual, 0);
    }
}
