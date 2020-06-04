package com.jdc.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc.demo.model.Member;
import com.jdc.demo.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/member")
	public String create(Model model) {
		model.addAttribute("member", new Member());
		return "memberForm";
	}

	@PostMapping("/member")
	public String process(@Valid Member member, BindingResult result) {
		if (result.hasErrors()) {
			return "memberForm";
		}
		memberService.create(member);
		return "redirect:/members";
	}

	@GetMapping("/members")
	public String showAllCategories(Model model) {
		model.addAttribute("members", memberService.findAll());
		return "members";
	}

}
