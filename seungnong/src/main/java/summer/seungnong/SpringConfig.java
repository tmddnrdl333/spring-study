package summer.seungnong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import summer.seungnong.repository.MemberRepository;
import summer.seungnong.repository.MemoryMemberRepository;
import summer.seungnong.service.MemberService;

@Configuration

public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
