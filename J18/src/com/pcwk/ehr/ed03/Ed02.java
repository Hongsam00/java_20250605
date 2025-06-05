/**
 * 파일명:Ed02.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ed02 {

	static void displayAllSet(Set<Integer> set) {
		// HashSet 요소 전체 출력
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1~45: 중복제거 6개 숫자 출력

		Set<Integer> lotto = new HashSet<Integer>();

		while (lotto.size() < 6) {
			// 1~45 난수
			// 0.0 <= Math.random() < 1.0
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
		}
		
		displayAllSet(lotto);
		
	}

}
