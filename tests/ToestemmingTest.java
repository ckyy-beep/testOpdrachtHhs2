import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToestemmingTest {

    // Condition coverage >>>
    @Test
    public void checkOfvliegtuigMagStijgen_geenToestemming_geenGeladenGewicht_geenTegenwind() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 1200;
        int tegenWind = 40;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_welToestemming_900GeladenGewicht_60Tegenwind() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 900;
        int tegenWind = 60;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    // Decision coverage >>>
    @Test
    public void checkOfvliegtuigMagStijgen_welToestemming_1200GeladenGewicht_60Tegenwind() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 1200;
        int tegenWind = 60;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_geenToestemming_1200GeladenGewicht_60Tegenwind() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 1200;
        int tegenWind = 60;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    // Condition / decision coverage >>>
    @Test
    public void checkOfvliegtuigMagStijgen_welToestemming_1200GeladenGewicht_60Tegenwind_2() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 1200;
        int tegenWind = 60;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_geenToestemming_800GeladenGewicht_40Tegenwind() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 800;
        int tegenWind = 40;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    // Modified Condition / Decision coverage  == MC/DC coverage >>>
    @Test
    public void checkOfvliegtuigMagStijgen_welToestemming_1200GeladenGewicht_60Tegenwind_3() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 1200;
        int tegenWind = 60;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_welToestemming_800GeladenGewicht_40Tegenwind() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 800;
        int tegenWind = 40;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_geenToestemming_800GeladenGewicht_40Tegenwind_2() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 800;
        int tegenWind = 40;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_geenToestemming_1200GeladenGewicht_60Tegenwind_2() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 1200;
        int tegenWind = 60;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    //MCC Coverage == Multiple Condition Coverage >>>
    @Test
    public void checkOfvliegtuigMagStijgen_welToestemming_800GeladenGewicht_60Tegenwind_4() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 800;
        int tegenWind = 60;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_true_true_false() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 800;
        int tegenWind = 40;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_true_false_true() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 1200;
        int tegenWind = 80;
        boolean expected = true;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_true_false_false() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = true;
        int geladenGewicht = 1200;
        int tegenWind = 40;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_false_true_true() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 800;
        int tegenWind = 60;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_false_true_false() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 800;
        int tegenWind = 40;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_false_false_true() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 1200;
        int tegenWind = 60;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOfvliegtuigMagStijgen_false_false_false() {
        //Arrange
        Toestemming toestemming = new Toestemming();
        boolean toestemmingVanVerkeerstoren = false;
        int geladenGewicht = 1200;
        int tegenWind = 40;
        boolean expected = false;

        //Act
        boolean actual = toestemming.checkOfVliegtuigMagStijgen(toestemmingVanVerkeerstoren, geladenGewicht, tegenWind);

        //Assert
        assertEquals(expected, actual);
    }

}
