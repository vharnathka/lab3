import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {6,8,10,12};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{12,10,8,6},input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {5,6,7};
    assertArrayEquals(new int[]{7,6,5},ArrayExamples.reversed(input2));
  }
}
