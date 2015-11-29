package org.azzyzt.ed.randomdata;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

/**
 * Unit tests for RandomDataGenerator.
 */
public class RandomDataGeneratorTest
{
    private RandomDataGenerator rdg;

    @BeforeMethod
    public void setupGenerator(){
        rdg = new RandomDataGenerator();
    }

    @Test
    public void returnsOneRandomString() {
        final List<String> strings = rdg.randomStrings(1);
        Assert.assertNotNull(strings);
        Assert.assertEquals(strings.size(), 1);
    }
}
