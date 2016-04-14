package adamatti;

import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
    @Test
    public void testSum() throws Exception {
        //Given
        Sample sample = new Sample();

        //When
        int result =sample.doSum(1,2);

        //Then
        Assert.assertEquals(3,result);
    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        //Given
        Sample sample = new Sample();

        //When
        int result =sample.doSum(0,0);

    }
}
