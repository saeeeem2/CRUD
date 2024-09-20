package com.crud.www.repository;

import java.util.List;

import com.crud.www.security.AuthVO;
import com.crud.www.security.MemberVO;

public interface MemberDAO {

	int insert(MemberVO mvo);

	int insertAuthInit(String name);

	MemberVO selectName(String username);

	List<AuthVO> selectRole(String username);

	int updateLastLogin(String authName);

	List<MemberVO> selectAllList();

	void modify(MemberVO mvo);

	void modifyPwd(MemberVO mvo);

	void removeRole(String name);

	int remove(String name);
}
