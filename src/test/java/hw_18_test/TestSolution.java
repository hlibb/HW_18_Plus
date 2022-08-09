package hw_18_test;

import hw_18.Solution;
import org.junit.Assert;
import org.junit.Before;

public class TestSolution {
    private Solution s;
    @Before
    public void initSolution() {
        s = new Solution();
    }
    @org.junit.Test
    public void testOne() {
        Assert.assertEquals(2001, s.romanToInt("MMI"));
    }
    @org.junit.Test
    public void testTwo() {
        Assert.assertEquals(1666, s.romanToInt("MDCLXVI"));
    }

    @org.junit.Test
    public void testThree() {
        Assert.assertEquals(1994, s.romanToInt("MCMXCIV"));
    }

    @org.junit.Test
    public void testFour() {
        Assert.assertEquals(4, s.romanToInt("IV"));
    }
    @org.junit.Test
    public void testFive() {
        Assert.assertEquals(994, s.romanToInt("CMXCIV"));
    }
}

