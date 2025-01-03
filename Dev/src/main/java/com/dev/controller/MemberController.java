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
	
	@RequestMapping(value = "/member/select", method = RequestMethod.POST)
	public String memberView(@ModelAttribute MemberVO memberVO, Model model) {
		
		model.addAttribute("member", memberVO);
		
		return "memberView";
	}
	
}
