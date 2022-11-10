package com.sangik.springweb2.Discount;

import com.sangik.springweb2.Member.Member;

public interface DiscountPolicy {

    /**
     *
     * @return 할인 대상 금액
     */


    int discount(Member member, int price);
}
