package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.model.MemberVO;

@Controller
public class MemberController {
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String memberMain(MemberVO memberVO) {
		
		return "memberMain";
	}
	
	//GET,POST 차이 : GET은 서버의 리소스에서 데이터를 요청할 때, POST는 서버의 리소스를 새로 생성하거나 업데이트할 때 사용
	//DB로 따지면 GET은 SELECT, POST는 CREATE 라고 생각하면 됨
	
	@RequestMapping(value = "/member/select", method = RequestMethod.POST)
	public String memberView(@ModelAttribute MemberVO memberVO, Model model) {
		
		model.addAttribute("member", memberVO);
		
		return "memberView";
	}
	
}
