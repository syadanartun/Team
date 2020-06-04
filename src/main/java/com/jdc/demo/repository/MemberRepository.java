package com.jdc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc.demo.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
