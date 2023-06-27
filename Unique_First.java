package sample;



public class Unique_First {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));

	}

	public static int firstUniqChar(String s) {

		int min = Integer.MAX_VALUE;

		for (int i = 'a'; i <= 'z'; i++) {

			int idx = s.indexOf(i);

			if (idx != -1 && s.lastIndexOf(i) == idx) {

				min = Math.min(min, idx);

			}

		}

		return min != Integer.MAX_VALUE ? min : -1;

	}

}
