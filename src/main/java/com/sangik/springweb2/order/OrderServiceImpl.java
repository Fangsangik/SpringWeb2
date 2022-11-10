package com.sangik.springweb2.order;

import com.sangik.springweb2.Discount.DiscountPolicy;
import com.sangik.springweb2.Discount.FixedDiscountPolicy;
import com.sangik.springweb2.Member.Member;
import com.sangik.springweb2.Member.MemberRepository;
import com.sangik.springweb2.Member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

  private final MemberRepository memberRepository = new MemoryMemberRepository();
  private final DiscountPolicy discountPolicy = new FixedDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
