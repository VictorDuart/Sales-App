package io.github.VictorDuart.model.entity;

import javax.persistence.*;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String desc;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Column
    private BigDecimal value;
}
