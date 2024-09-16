package dad.codewars.thejourneybeggins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberStringExampleTests {

    @Before
    public void setUp() {
    }

    @Test
    public void test1() {
        assertEquals("123", Kata.numberToString(123));
        }
    @Test
    public void test2() {
        assertEquals("234", Kata.numberToString(999));
    }
    @Test
    public void test3() {
        assertEquals("113", Kata.numberToString(543));
    }

    }



