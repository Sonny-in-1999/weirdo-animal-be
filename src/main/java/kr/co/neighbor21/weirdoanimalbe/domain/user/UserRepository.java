package kr.co.neighbor21.weirdoanimalbe.domain.user;

import kr.co.neighbor21.weirdoanimalbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
