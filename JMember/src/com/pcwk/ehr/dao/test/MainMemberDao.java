/**
 * Package Name : com.pcwk.ehr.dao.test <br/>
 * Class Name: MainMemberDao.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-18<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.dao.test;

import com.pcwk.ehr.member.dao.MemberDao;
import com.pcwk.ehr.member.vo.MemberVO;

public class MainMemberDao {

	private MemberVO member01;
	private MemberVO member02;
	private MemberVO member03;

	public MainMemberDao() {
		member01 = new MemberVO("pcwk06", "이상무06", "4321a", "yejiad12@gmail.com", 0, "2025-04-23", "일반");
		member02 = new MemberVO("pcwk07", "이상무07", "4321a", "yejiad13@gmail.com", 0, "2025-04-23", "관리자");
		member03 = new MemberVO("pcwk08", "이상무08", "4321a", "yejiad14@gmail.com", 0, "2025-04-23", "일반");
	}

	// 회원 가입
	public void doSave() {
		MemberDao dao = new MemberDao();

		// doSave() 테스트

		member01.setMemberId("pcwk01");

		int flag = dao.doSave(member01);
		if (flag == 0) {
			System.out.println("등록 실패");
		} else if (flag == 2) {
			System.out.println("기존 회원 존재 합니다.");
		} else {
			System.out.println("등록 성공");
		}

	}

	public void isExistsMember() {
		MemberDao dao = new MemberDao();
		MemberVO param = new MemberVO();

		param.setMemberId("pcwk01");
		boolean flag = dao.isExistsMember(param);
		if (flag == true) {
			System.out.println("회원존재 확인 성공");
		} else {
			System.out.println("회원존재 확인 실패");
		}
	}

	// 회원 단건 조회
	public void doSelectOne() {
		MemberDao dao = new MemberDao();
		MemberVO param = new MemberVO();

		param.setMemberId("pcwk01");

		MemberVO outVO = dao.doSelectOne(param);

		if (null != outVO) {
			System.out.println("회원 조회 성공\n" + outVO);
		} else {
			System.out.println("회원 조회 실패");
		}
	}

	public static void main(String[] args) {

		// 88Hello github99
		// Hello
		MainMemberDao main = new MainMemberDao();
		// 회원가입
		main.doSave();

		// 회원존재 확인
		// main.isExistsMember();

		// 회원 단건 조회
		main.doSelectOne();
	}

}
