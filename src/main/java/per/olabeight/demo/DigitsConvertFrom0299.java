package per.olabeight.demo;

import java.util.ArrayList;
import java.util.List;

public class DigitsConvertFrom0299 extends DigitsConvert {
	/**
	 * this method can get a String result which print all possible letters comninations that the member number
	 * ranged from 0 to 99 related like digitConvertMap. 
	 * @param digitsArr
	 * @return
	 * @throws Exception
	 */
	public String convert(Integer[] digitsArr) throws Exception {
		List<Integer> digitsList = new ArrayList<Integer>();
		for(int ele : digitsArr) {
			//if member's value is not in 0 to 9, throw a new Exception and stop it.
			if(ele > 99 || ele < 0) {
				throw new Exception("the digit given should be ranged from 0 to 99!");
			//if member's value is little to 10, digitsList can add it directly.
			}else if(ele < 10) {
				digitsList.add(ele);
			//if member's value ranges from 10 to 99, its value will be spilt into two parts and add them into digitsList separately.
			}else {
				digitsList.add(ele/10);
				digitsList.add(ele%10);
			}
		}
		
		return super.convert(digitsList.toArray(new Integer[] {}));
	}
	
}
