package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int DiscountFixAmount = 1000;  // 정액 할인 정책 = 1000원 할인

    @Override  // VIP면 할인, 아니면 할인없음
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return DiscountFixAmount;
        } else {
            return 0;
        }
    }
}
