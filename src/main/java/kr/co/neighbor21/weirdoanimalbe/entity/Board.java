package kr.co.neighbor21.weirdoanimalbe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity(name = "board")
public class Board {

    @Id
    @Column(name = "board_id")
    private String boardId;

    @NotNull
    @Column(name = "board_name", nullable = false)
    private String boardName;
}