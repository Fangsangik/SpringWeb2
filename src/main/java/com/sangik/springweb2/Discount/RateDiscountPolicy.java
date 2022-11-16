package com.sangik.springweb2.Discount;

import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
