package com.sangik.springweb2.Member;

public interface MemberService {
    void join (Member member);

    Member findMember(Long memberId);
}


