package springBasic2.core;

import springBasic2.core.discount.DiscountPolicy;
import springBasic2.core.discount.FixDiscountPolicy;
import springBasic2.core.discount.RateDiscountPolicy;
import springBasic2.core.member.MemberRepository;
import springBasic2.core.member.MemberService;
import springBasic2.core.member.MemberServiceImpl;
import springBasic2.core.member.MemoryMemberRepository;
import springBasic2.core.order.OrderService;
import springBasic2.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
