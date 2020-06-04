package com.jdc.demo.service;

import java.util.List;

import com.jdc.demo.model.Member;

public interface MemberService {
	Member create(Member member);

	Member findById(int id);

	List<Member> findAll();

}
