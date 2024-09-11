/**
 * 
 */
package slideDeckChallenges;

import java.util.ArrayList;

/**
 * 
 */
public class MergeAListWithNoDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		
		list1.add("Five");		// Added this value for testing

		list2.add("Four");
		list2.add("Two");
		list2.add("Five");

		// Ensure capacity

		int a, b;
		a = list1.size();
		b = list2.size();

		list1.ensureCapacity(a + b);

		// Merge lists (no duplicates)

//		for (int i = 0; i < list2.size(); i++) {
//			if (!list1.contains(list2.get(i))) {
//				list1.add(list2.get(i));
//			}
//		}
//		
//		System.out.println(list1);

		// Solution provided

		for (int loop = 0; loop < list2.size(); loop++) {
			if (!list2.contains(list1.get(loop))) {
				list1.add(list2.get(loop));
			}
		}

		System.out.println(list1);
	}

}
