package per.olabeight.demo;

/**
 * 
 * DigitsConvertTest.java
 * a class you offer some examples which test the method DigitsConvert and its subclasses.
 * @author qianxiaoyong
 * 2020年9月2日 下午3:10:02
 *
 */
public class DigitsConvertTest {
	DigitsConvert test = new DigitsConvert();
	DigitsConvertFrom0299 test1 = new DigitsConvertFrom0299();
	
	/**
	 * tests a example which offers number Array that member's value ranged from 0 to 9.
	 * @throws Exception
	 */
	@org.junit.Test
	public void test029() throws Exception {
		System.out.println(test.convert(new Integer[] {2,3}));
		System.out.println(test.convert(new Integer[] {5,7}));
		System.out.println(test.convert(new Integer[] {5,7, 9}));
		System.out.println(test.convert(new Integer[] {9}));
		System.out.println(test.convert(new Integer[] {0, 1}));
	}
	
	/**
	 * tests a example which offers number Array that member's value ranged from 0 to 9.
	 * @throws Exception
	 */
	@org.junit.Test
	public void test0299() throws Exception {
		System.out.println(test1.convert(new Integer[] {23}));
		System.out.println(test1.convert(new Integer[] {1, 15,0,79}));
	}

}
