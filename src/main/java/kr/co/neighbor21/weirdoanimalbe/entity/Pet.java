package kr.co.neighbor21.weirdoanimalbe.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@Entity(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Long petId;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private LocalDate birthday;

    @NotNull
    @Column(name = "d_day")
    private LocalDate dDay;

    /* TODO: 이미지 저장 방법 고민 필요 */
//    @Column(name = "profile_img")
//    private String profileImg;

    @NotNull
    @Column(name = "like", nullable = false)
    private Integer like;

    @NotNull
    @Column(name = "hate", nullable = false)
    private Integer hate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_type_id")
    private PetType petType;

    /* TODO: cascade 전략 고민 필요 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
