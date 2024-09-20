package com.crud.www.service;

import java.util.List;

import com.crud.www.security.MemberVO;

public interface MemberService {

	int insertMember(MemberVO mvo);

	boolean updateLastLogin(String authName);

	MemberVO detail(String Name);

	List<MemberVO> getList();

	void modify(MemberVO mvo);

	void modifyPwd(MemberVO mvo);

	int remove(String Name);
}
