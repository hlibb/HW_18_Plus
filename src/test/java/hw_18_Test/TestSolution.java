package hw_18_Test;

import hw_18.Solution;
import org.junit.*;

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
}


