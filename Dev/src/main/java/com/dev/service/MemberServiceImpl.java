package com.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.mapper.MemberMapper;
import com.dev.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

	@Override
	public MemberVO selectMember(MemberVO member) {
		return mapper.selectMember(member);
	}
}
