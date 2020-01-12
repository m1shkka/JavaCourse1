package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    String min = "883337";
    String easyMax = "883999";
    String hardMax = "883340";
    String easyExpected = "easy";
    String hardExpected = "hard";

    @Test
    public void getBetterTypeTestEasy()
    {
        Assert.assertEquals(App.getBetterType(min,easyMax), easyExpected);
    }

    @Test
    public void getBetterTypeTestHard()
    {
        Assert.assertEquals(App.getBetterType(min,hardMax), hardExpected);
    }
}
