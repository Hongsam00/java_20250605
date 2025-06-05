/**
 * 파일명:Ed03MiddleAdd.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ed01;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ed03MiddleAdd {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		int size = 1_000_000;

		// 기본 100만개추가
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}

		// 5000번째 인덱스에 추가
		// LinkedList 성능 측정
		long start02 = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			linkedList.add(5000, i);
		}

		long end02 = System.currentTimeMillis();
		System.out.println("┌───────────────────────┐");
		System.out.println("│ LinkedList		│");
		System.out.println("└───────────────────────┘");
		System.out.printf("LinkedList Integer %d개 추가 경과  시간 %d%n", size, (end02 - start02));

		// ArrayList 성능측정
		long start01 = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			arrayList.add(5000, i);
		}

		long end01 = System.currentTimeMillis();
		System.out.println("┌───────────────────────┐");
		System.out.println("│ ArrayList		│");
		System.out.println("└───────────────────────┘");
		System.out.printf("ArrayList Integer %d개 추가 경과  시간 %d%n", size, (end01 - start01));
	}

}
