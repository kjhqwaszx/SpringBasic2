package springBasic2.core.discount;

import springBasic2.core.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
