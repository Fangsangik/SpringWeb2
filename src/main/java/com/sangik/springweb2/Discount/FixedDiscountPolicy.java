package com.sangik.springweb2.Discount;

import com.sangik.springweb2.Member.Grade;
import com.sangik.springweb2.Member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000dnjs gkfdls

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
