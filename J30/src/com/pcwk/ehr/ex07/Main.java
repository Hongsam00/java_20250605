/**
 * Package Name : com.pcwk.ehr.ex07 <br/>
 * 파일 명: Main.java <br/>
 */
package com.pcwk.ehr.ex07;

public class Main {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(Operator oprator) {
		int result = scores[0];

		for (int score : scores) {
			result = oprator.apply(result, score);
		}

		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((x, y) -> Math.max(x, y));

		System.out.println("최대값: " + max);
		// 최소값 얻기
		int min = maxOrMin((x, y) -> Math.min(x, y));

		System.out.println("최소값: " + min);
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private static Object max(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
