package per.olabeight.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 
 * DigitsConvert.java
 * this class offers 2 methods that can convert an array of Integer to all 
 * @author qianxiaoyong
 * 2020年9月2日 下午2:29:09
 *
 */
public class DigitsConvert{
	
	/**
	 * a hashmap that key ranged from 0 to 9 and values are some letters which mapped by key。
	 */
	@SuppressWarnings("serial")
	private static final Map<Integer, Character[]> digitConvertMap = new HashMap<Integer, Character[]>(){
		{
			put(0, new Character[] {}); // 0 map to no letters.
			put(1, new Character[] {});// 1 also map to no letters.
			put(2, new Character[] {'A', 'B', 'C'});
			put(3, new Character[] {'D', 'E', 'F'});
			put(4, new Character[] {'G', 'H', 'I'});
			put(5, new Character[] {'J', 'K', 'L'});
			put(6, new Character[] {'M', 'N', 'O'});
			put(7, new Character[] {'P', 'Q', 'R', 'S'});
			put(8, new Character[] {'T', 'U', 'V'});
			put(9, new Character[] {'W','X', 'Y', 'Z'});
		}
	};

	/**
	 * this method can get a String result which print all possible letters comninations that the member number
	 * ranged from 0 to 9 related like digitConvertMap.
	 * @param digitsArr given Integer Arrays, which member should range from 0 to 9.
	 * @return
	 * @throws Exception
	 */
	public String convert(Integer[] digitsArr) throws Exception {
		Queue<Character[]> chq = new LinkedList<Character[]>();
		Character[]currentEle;
		for(int ele : digitsArr) {
			//if member's value is not in 0 to 9, throw a new Exception and stop it.
			if(ele > 9 || ele < 0) {
				throw new Exception("the digit given should be ranged from 0 to 9!");
			}
			//the element of chq requests the length of the letters Array related to the member great to 0.
			else if((currentEle = digitConvertMap.get(ele)).length > 0) {
				chq.offer(currentEle);
			}
		}
		//when chq has no element, the method will return "".
		if(chq.size() == 0) {
			return "";
		}
		String[] outputArr = new String[] {" "}, preArr = outputArr;
		Character[] head;
		int preArrLen;
		while((head = chq.poll()) != null) {
			outputArr = new String[preArr.length * head.length];
			for(int j = 0, lenOutside = head.length; j < lenOutside; j++) {
				for(int i = 0, lenInside = preArrLen = preArr.length; i < lenInside; i++) {
					outputArr[preArrLen * j +i] = preArr[i] + head[j];
				}
			}
			preArr = outputArr;
		}
		StringBuilder outbuilder = new StringBuilder();
		for(String outOne : outputArr) {
			outbuilder.append(outOne);
		}
		//because outputArr initValue is  {" "}, the first of the letter is " " which should be cut out.
		//And as example, the result should be toLowerCase. 
		return outbuilder.toString().substring(1).toLowerCase();
	}
	
}
