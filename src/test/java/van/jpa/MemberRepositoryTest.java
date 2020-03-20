package van.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private EntityManagerFactory factory;

    @Test
    void manyToOne은_정말_즉시_로딩일까() {
        PersistenceUnitUtil persistenceUnitUtil = factory.getPersistenceUnitUtil();
        Optional<Member> maybeMember = memberRepository.findById(1L);

        //멤버 클래스의 team이름의 필드가 로드 되어있는지 테스트
        assertThat(persistenceUnitUtil.isLoaded(maybeMember.get(), "team")).isFalse();

        Member member = maybeMember.get();
        assertThat(persistenceUnitUtil.isLoaded(maybeMember.get(), "team")).isFalse();

        Team team = maybeMember.get().getTeam();
        assertThat(persistenceUnitUtil.isLoaded(maybeMember.get(), "team")).isFalse();

        String name = maybeMember.get().getTeam().getName();
        assertThat(persistenceUnitUtil.isLoaded(member, "team")).isTrue();
    }
}
