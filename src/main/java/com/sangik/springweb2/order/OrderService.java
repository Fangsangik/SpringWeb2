package com.sangik.springweb2.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
