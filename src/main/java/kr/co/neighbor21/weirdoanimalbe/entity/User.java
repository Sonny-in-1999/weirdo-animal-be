package kr.co.neighbor21.weirdoanimalbe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import kr.co.neighbor21.weirdoanimalbe.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity(name = "user")
public class User extends BaseEntity {

    @Id
    @Column(name = "user_id")
    private String userId;

    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull
    @Column(name = "nick_name", nullable = false)
    private String nickName;

    @Column(name = "bio")
    private String bio;

    @Column(name = "birthday")
    private LocalDate birthday;

    /* TODO: 이미지 저장 방법 고민 필요 */
//    @Column(name = "profile_img")
//    private byte[] profileImg;
}
