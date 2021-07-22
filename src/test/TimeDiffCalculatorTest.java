package test;

import main.TimeDiffCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeDiffCalculatorTest {


    private TimeDiffCalculator timeDiffCalculator;

    @Before
    public void SetUp() {
        timeDiffCalculator = new TimeDiffCalculator();
    }

    @Test
    public void Insert() {

        Assert.assertEquals(true, timeDiffCalculator.timeIsPresentInRange(5,5,8));
        Assert.assertEquals(true, timeDiffCalculator.timeIsPresentInRange(10,5,14));
        Assert.assertEquals(false, timeDiffCalculator.timeIsPresentInRange(-1,-5,-38));
        Assert.assertEquals(true, timeDiffCalculator.timeIsPresentInRange(6,5,8));
        Assert.assertEquals(false, timeDiffCalculator.timeIsPresentInRange(28,5,8));

    }
}
