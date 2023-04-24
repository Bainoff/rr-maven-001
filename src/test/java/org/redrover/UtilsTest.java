package org.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testSum(){
        Assert.assertEquals(Utils.sum(3,5),8);
    }

    @Test
    public void testAbbr(){
        Assert.assertEquals(Utils.abbr("1234567890", 10), "1234567...");
    }

    @Test
    public void testAbbr2(){
        Assert.assertEquals(Utils.abbr2("1234567890", 11), "1234567890");
    }
}
