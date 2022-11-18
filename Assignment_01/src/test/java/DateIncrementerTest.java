import assignment1.DateIncrementer;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateIncrementerTest {
    //test for incrementing a day
    @Test
    public void DateIncrementerDayTest(){
        String expected = "12-04-2001";
        String actual = DateIncrementer.incrementDate(11,4,2001);
        assertEquals(expected, actual);
    }


    //test for incrementing month
    @Test
    public void DateIncrementerMonthTest(){
        String expected = "01-02-2001";
        String actual = DateIncrementer.incrementDate(31,1,2001);
        assertEquals(expected, actual);

        expected = "01-05-2012";
        actual = DateIncrementer.incrementDate(30, 4, 2012);
        assertEquals(expected, actual);
    }


    //test for incrementing year
    @Test
    public void DateIncrementerYearTest(){
        String expected = "01-01-2022";
        String actual = DateIncrementer.incrementDate(31,12,2021);
        assertEquals(expected, actual);
    }


    //test for incrementing date in february in a leap year
    @Test
    public void DateIncrementerLeapYearTest(){
        String expected = "01-03-2016";
        String actual = DateIncrementer.incrementDate(29,2,2016);
        assertEquals(expected, actual);

        expected = "29-02-2016";
        actual = DateIncrementer.incrementDate(28,2,2016);
        assertEquals(expected, actual);

        expected = "01-03-2015";
        actual = DateIncrementer.incrementDate(28,2,2015);
        assertEquals(expected, actual);
    }
}
