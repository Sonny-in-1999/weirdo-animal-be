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
@Entity(name = "pet_type")
public class PetType {

    @Id
    @Column(name = "pet_type_id")
    private String petTypeId;

    @NotNull
    @Column(name = "pet_type_name", nullable = false)
    private String petTypeName;
}
