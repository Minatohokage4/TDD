/*Code by Nantipat 	Tullwattana(Army Horyshit) 
 ID 5730213093 
 facebook codegeassmasterzeronebreakout
  office: Ban-InW
 */

package FuckingTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
public class FizzBuzzTest {
	@Test
	public void  inputOneShouldOutputOne()
	{
		for(int i=1;i<18;i++) // You can Edit value N
			Assert.assertEquals(new cheakcase().c(new cheakReturn().value (i),i),new FizzBuzz().get(i));
	}	 
	public void  assertOutput(String expected)
	{
		for(int i=1;i<18;i++) 
			Assert.assertEquals(expected,new FizzBuzz().get(i)); // Need use method  assertOutput for paramiter
	}
}