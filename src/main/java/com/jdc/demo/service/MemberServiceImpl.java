package com.jdc.demo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.demo.model.Member;
import com.jdc.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public Member create(Member member) {

		return memberRepository.save(member);
	}

	@Override
	public Member findById(int id) {

		return memberRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + "not found"));
	}

	@Override
	public List<Member> findAll() {

		return memberRepository.findAll();
	}

}
