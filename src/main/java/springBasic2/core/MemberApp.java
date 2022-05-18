package springBasic2.core;

import springBasic2.core.member.Grade;
import springBasic2.core.member.Member;
import springBasic2.core.member.MemberService;
import springBasic2.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appconfig = new AppConfig();
        MemberService memberService = appconfig.memberService();

        Member member = new Member(1L, "member1", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
