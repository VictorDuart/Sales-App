package io.github.VictorDuart.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "cadastre_date")
    private LocalDate cadastreDate;
}
