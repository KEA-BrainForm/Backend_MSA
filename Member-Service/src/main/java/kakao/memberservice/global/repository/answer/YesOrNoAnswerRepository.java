package kakao.memberservice.global.repository.answer;

import kakao.memberservice.global.entity.anwer.YesOrNoAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YesOrNoAnswerRepository extends JpaRepository<YesOrNoAnswer, Long> {
    Optional<YesOrNoAnswer> findById(Long id);

}
