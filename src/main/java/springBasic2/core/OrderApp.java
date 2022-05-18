package springBasic2.core;

import springBasic2.core.member.Grade;
import springBasic2.core.member.Member;
import springBasic2.core.member.MemberService;
import springBasic2.core.member.MemberServiceImpl;
import springBasic2.core.order.Order;
import springBasic2.core.order.OrderService;
import springBasic2.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println("order = " + order);
    }
}
