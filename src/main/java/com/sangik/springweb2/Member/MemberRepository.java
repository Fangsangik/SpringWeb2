package com.sangik.springweb2.Member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
