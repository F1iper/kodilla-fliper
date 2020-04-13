package coding.bat.warmup;

import org.junit.Assert;
import org.junit.Test;

public class StringSamplesTestSuite {

    @Test
    public void calculateCharsInString (){
        //Given
        String someString = "elephant";
        char someChar = 'e';
        int count = 0;

        //When
        for(int i = 0; i<someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }
        }

        //Then
        Assert.assertEquals(2, count);
    }

}
