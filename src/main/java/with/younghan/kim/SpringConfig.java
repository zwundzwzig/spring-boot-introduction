package with.younghan.kim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import with.younghan.kim.aop.TimeTraceAop;
import with.younghan.kim.repository.*;
import with.younghan.kim.service.MemberService;

@Configuration
public class SpringConfig {

  private final MemberRepository memberRepository;

  @Autowired
  public SpringConfig(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @Bean
  public MemberService memberService() {
    return new MemberService(memberRepository);
  }

//  @Bean
//  public TimeTraceAop timeTraceAop() {
//    return new TimeTraceAop();
//  }

//  @Bean
//  public MemberRepository memberRepository() {
//    return new MemoryMemberRepository();
//    return new JdbcTemplateMemberRepository();
//    return new JdbcTemplateMemberRepository(dataSource);
//    return new JpaMemberRepository(em);
//    }

}
