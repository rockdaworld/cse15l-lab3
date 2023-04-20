import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
    int[] input3 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{4,3,2,1}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
    int[] input3 = {4, 3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayExamples.reversed(input3));
    int[] input4 = {1};
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input4));
  }
  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0);
    double[] input2 = {1};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input2), 0);
    double[] input3 = {1, 1};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input3), 0);
    double[] input4 = {1, 1, 1};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input4), 0);
    double[] input5 = {4, 4, 5, 6};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input5), 0);
  }
}
