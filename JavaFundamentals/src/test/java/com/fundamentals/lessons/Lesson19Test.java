package com.fundamentals.lessons;
import com.fundamentals.main.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* Lesson 19 Test - Writing Unit Tests */
public class Lesson19Test {
    Lesson19 myLesson19;
    House myHouse;

    @BeforeEach
    void setup() {
        myLesson19 = new Lesson19();
    }

    @Test
    void testCalculateArea() {
        double expectedArea = 3.141592653589793;
        double actualArea = myLesson19.calculateArea(1);
         assertEquals(expectedArea, actualArea, "Value failed to match.");
    }

    @Test
    void testCharExample() {
        char[] expected = myLesson19.myCharExample();
        char[] actual = "UnitTest".toCharArray();
        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    void testIsGreaterTrue() {
        assertTrue(myLesson19.isGreaterExample(7, 3), "7 is Greater than 3.");
    }

    @Test
    void testIsGreaterFalse() {
        assertFalse(myLesson19.isGreaterExample(3, 7), "3 is Less than 7.");
    }

    @Test
    void testHouseNull() {
        assertNull(myLesson19.myHouseExample(myHouse), "House is null.");
    }

    @Test
    void testHouseNotNull() {
        myHouse = new House();
        assertNotNull(myLesson19.myHouseExample(myHouse), "House is not null.");
    }
}
