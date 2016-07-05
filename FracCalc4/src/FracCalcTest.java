import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class FracCalcTest extends TestCase 
{
	@Test
	public void testAdditionBasic() {
		assertEquals("2/5", FracCalc.produceAnswer("1/5 + 1/5"));
		assertEquals("1_1/5", FracCalc.produceAnswer("3/5 + 3/5"));
		assertEquals("1_1/5", FracCalc.produceAnswer("4/5 + 2/5"));
		assertEquals("1/4", FracCalc.produceAnswer("1/8 + 1/8"));
	}
	
	@Test
	public void testAdditionIntermediate() {
		assertEquals("2/5", FracCalc.produceAnswer("3/5 + -1/5"));
		assertEquals("5_5/6", FracCalc.produceAnswer("20/8 + 3_1/3"));
		assertEquals("1", FracCalc.produceAnswer("3/5 + 2/5"));
		assertEquals("1_1/20", FracCalc.produceAnswer("4/5 + 2/8"));
		assertEquals("452", FracCalc.produceAnswer("452 + 0"));
		assertEquals("2", FracCalc.produceAnswer("1 + 1"));
		assertEquals("4", FracCalc.produceAnswer("1 + 3"));
		assertEquals("254", FracCalc.produceAnswer("0 + 254"));
		assertEquals("1021778", FracCalc.produceAnswer("124543 + 897235"));
		assertEquals("900", FracCalc.produceAnswer("978 + -78"));
	}
	
	@Test
	public void testAdditionAdvanced() {
		assertEquals("-9035", FracCalc.produceAnswer("-9035 + 0"));
		assertEquals("-64", FracCalc.produceAnswer("64 + -128"));
		assertEquals("-133", FracCalc.produceAnswer("-98 + -35"));
		assertEquals("62_11/19", FracCalc.produceAnswer("0 + 34_543/19"));
		assertEquals("-44_229/888", FracCalc.produceAnswer("-38_3/72 + -4_82/37"));
		assertEquals("-7/8", FracCalc.produceAnswer("5_3/4 - 6_5/8"));
	}

	@Test
	public void testSubtractionBasic() {
		assertEquals("1/5", FracCalc.produceAnswer("3/5 - 2/5"));
		assertEquals("4/5", FracCalc.produceAnswer("9/10 - 1/10"));
		assertEquals("0", FracCalc.produceAnswer("1/5 - 1/5"));
		assertEquals("0", FracCalc.produceAnswer("4_1/2 - 4_1/2"));
	}
	
	@Test
	public void testSubtractionIntermediate() {
		assertEquals("0", FracCalc.produceAnswer("68591 - 68591"));
		assertEquals("-36891", FracCalc.produceAnswer("48623 - 85514"));
		assertEquals("-9284", FracCalc.produceAnswer("0 - 9284"));
		assertEquals("-2/5", FracCalc.produceAnswer("2/5 - 4/5"));
		assertEquals("-1_5/8", FracCalc.produceAnswer("4_1/2 - 5_9/8"));
		assertEquals("-1_1/8", FracCalc.produceAnswer("3_3/4 - 4_7/8"));
	}
	
	@Test
	public void testSubtractionAdvanced() {
		assertEquals("12_3/8", FracCalc.produceAnswer("5_3/4 - -6_5/8"));
		assertEquals("8_5/21", FracCalc.produceAnswer("-12_3/7 - -20_2/3"));
		assertEquals("-1_5/12", FracCalc.produceAnswer("-2/3 - 3/4"));
	}

	@Test
	public void testMultiplicationBasic() {
		assertEquals("3", FracCalc.produceAnswer("1_1/2 * 2"));
		assertEquals("6/25", FracCalc.produceAnswer("3/5 * 2/5"));
		assertEquals("0", FracCalc.produceAnswer("0 * 0"));
		assertEquals("0", FracCalc.produceAnswer("0 * 9321"));
		assertEquals("0", FracCalc.produceAnswer("0 * -5902"));
		assertEquals("164268", FracCalc.produceAnswer("234 * 702"));
		assertEquals("216", FracCalc.produceAnswer("12 * 18"));
		assertEquals("8", FracCalc.produceAnswer("12/3 * 2/1"));
	}
	
	@Test
	public void testMultiplicationIntermediate() {
		assertEquals("2", FracCalc.produceAnswer("16 * 1/8"));
		assertEquals("0", FracCalc.produceAnswer("0 * 4/5"));
		assertEquals("2", FracCalc.produceAnswer("3 * 2/3"));
		assertEquals("1_1/2", FracCalc.produceAnswer("6 * 1/4"));
		assertEquals("8994872", FracCalc.produceAnswer("1 * 8994872"));
	}
	
	@Test
	public void testMultiplicationAdvanced() {
		assertEquals("-842346", FracCalc.produceAnswer("1 * -842346"));
		assertEquals("-75421", FracCalc.produceAnswer("-1 * 75421"));
		assertEquals("37953", FracCalc.produceAnswer("-1 * -37953"));
		assertEquals("8", FracCalc.produceAnswer("-12/3 * -2/1"));
	}
	
	@Test
	public void testDivisionBasic() {
		assertEquals("9/16", FracCalc.produceAnswer("3/4 / 4/3"));
		assertEquals("2_1/4", FracCalc.produceAnswer("3/2 / 2/3"));
		assertEquals("9457", FracCalc.produceAnswer("9457 / 1"));
		assertEquals("0", FracCalc.produceAnswer("0 / 37569"));
		assertEquals("6/11", FracCalc.produceAnswer("6 / 11"));
		assertEquals("4/9", FracCalc.produceAnswer("4 / 9"));
		assertEquals("1", FracCalc.produceAnswer("23 / 23"));
		assertEquals("2_6/7", FracCalc.produceAnswer("20 / 7"));
		assertEquals("13/24", FracCalc.produceAnswer("1_1/12 / 2"));
	}
	
	@Test
	public void testDivisionIntermediate() {
		assertEquals("2_2/3", FracCalc.produceAnswer("16/4 / 3/2"));
		assertEquals("0", FracCalc.produceAnswer("0 / -98701"));
		assertEquals("1", FracCalc.produceAnswer("3/4 / 3/4"));
		assertEquals("-2_2/3", FracCalc.produceAnswer("16/4 / -3/2"));
	}
	
	@Test
	public void testDivisionAdvanced() {
		assertEquals("1_5/8", FracCalc.produceAnswer("-13 / -8"));
		assertEquals("-5/21", FracCalc.produceAnswer("1_2/3 / -5_6/3"));
		assertEquals("6_661/5520", FracCalc.produceAnswer("-38_3/72 / -4_82/37"));
		assertEquals("-2803", FracCalc.produceAnswer("-2803 / 1"));
		assertEquals("-12457", FracCalc.produceAnswer("12457 / -1"));
		assertEquals("45236", FracCalc.produceAnswer("-45236 / -1"));
		assertEquals("-2_6/7", FracCalc.produceAnswer("-20 / 7"));
	}
}
