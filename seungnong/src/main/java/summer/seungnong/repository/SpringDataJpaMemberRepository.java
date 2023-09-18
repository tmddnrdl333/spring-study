package summer.seungnong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import summer.seungnong.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name); /* JPQL - select m from Member m where m.name =  ? */

}
