/**
 * Package Name : com.pcwk.ehr.ed03 <br/>
 * 파일 명: PcwkOperation.java <br/>
 */
package com.pcwk.ehr.ed03;

//함수형 인터페이스, 문법체크, 함수가 1개만 있어야 한다.
@FunctionalInterface
public interface PcwkOperation {
	
	int operation(int a, int b);
}
