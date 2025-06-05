/**
 * Package Name : com.pcwk.ehr.member.dao <br/>
 * Class Name: MemberDao.java <br/>
 * Description: 회원 DAO <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-18<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.member.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.ehr.cmn.PLog;
import com.pcwk.ehr.cmn.Workdiv;
import com.pcwk.ehr.member.vo.MemberVO;

public class MemberDao implements Workdiv<MemberVO>, PLog {

	public static final String MEMBER_DATA = ".\\data\\member.csv";
	public static List<MemberVO> members = new ArrayList<MemberVO>();

	// 파일에서 회원정보 읽기
	public MemberDao() {
		getMemberReadFile(MEMBER_DATA);
	}

	/**
	 * 회원 존재 확인
	 * 
	 * @param dto
	 * @return true(존재)/false(없음)
	 */
	public boolean isExistsMember(MemberVO dto) {
		boolean flag = false;

		for (MemberVO vo : members) {
			if (dto.getMemberId().equals(vo.getMemberId())) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	// 회원정보 파일을 읽고 -> List<MemberVO>
	/**
	 * 회원정보 파일 to List<MemberVO>
	 * 
	 * @param path
	 * @return
	 */
	public List<MemberVO> getMemberReadFile(String path) {

		// 1. file read
		// 2. 읽은 한줄 -> List<MemberVO>
		// 3. List<MemberVO> members에 추가
		try (BufferedReader reader = new BufferedReader(new FileReader(path));) {
			String line;
			while ((line = reader.readLine()) != null) {
				// LOG.debug(line);
				// pcwk01,이상무01,4321a,yejiad12@gmail.com,0,2025-04-18,일반 to MamberVO

				String[] dataArr = line.split(",");

				String memberId = dataArr[0];// 회원ID
				String name = dataArr[1];// 이름
				String password = dataArr[2];// 비밀번호
				String email = dataArr[3];// 이메일
				int loginCount = Integer.parseInt(dataArr[4]);// 로그인 횟수
				String regDt = dataArr[5];// 가입일
				String role = dataArr[6];// 권한

				MemberVO memberVO = new MemberVO(memberId, name, password, email, loginCount, regDt, role);
				// LOG.debug(memberVO);
				members.add(memberVO);
			}
			LOG.debug("┌──────────────────────┐");
			LOG.debug("│ List<MemberVO>       │");
			LOG.debug("└──────────────────────┘");

			for (MemberVO vo : members) {
				LOG.debug(vo);
			}

		} catch (FileNotFoundException e) {
			LOG.debug("FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			LOG.debug("IOException:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			LOG.debug("Exception:" + e.getMessage());
			e.printStackTrace();
		}

		return members;
	}

	@Override
	public int doSave(MemberVO dto) {
		int flag = 0;
		// members
		LOG.debug("1. param:" + dto);

		// 기존 회원이 존재하면
		if (isExistsMember(dto) == true) {
			flag = 2;
			return flag;
		}

		flag = this.members.add(dto) ? 1 : 0;
		LOG.debug("2. flag:" + flag);
		return flag;
	}

	@Override
	public MemberVO doSelectOne(MemberVO dto) {
		MemberVO outVO = null;
		LOG.debug("1. param:" + dto);
		for (MemberVO vo : members) {
			if (vo.getMemberId().equals(dto.getMemberId())) {
				outVO = vo;
				break;
			}
		}
		LOG.debug("2. outVO: " + outVO);

		return outVO;
	}

	@Override
	public List<MemberVO> doRetrieve(MemberVO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doUpdate(MemberVO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doDelete(MemberVO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
