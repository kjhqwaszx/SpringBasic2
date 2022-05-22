package springBasic2.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springBasic2.core.discount.DiscountPolicy;
import springBasic2.core.discount.FixDiscountPolicy;
import springBasic2.core.discount.RateDiscountPolicy;
import springBasic2.core.member.MemberRepository;
import springBasic2.core.member.MemberService;
import springBasic2.core.member.MemberServiceImpl;
import springBasic2.core.member.MemoryMemberRepository;
import springBasic2.core.order.OrderService;
import springBasic2.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
