package kr.co.neighbor21.weirdoanimalbe.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import kr.co.neighbor21.weirdoanimalbe.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity(name = "post")
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @NotNull
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @Column(name = "content", nullable = false)
    private String content;

    /* TODO: 이미지 저장 방법 고민 필요 */
//    @Column(name = "image")
//    private String image;

    @NotNull
    @Column(name = "like", nullable = false)
    private int like;

    @NotNull
    @Column(name = "hate", nullable = false)
    private int hate;

    /* TODO: cascade 전략 고민 필요 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    /* TODO: cascade 전략 고민 필요 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
