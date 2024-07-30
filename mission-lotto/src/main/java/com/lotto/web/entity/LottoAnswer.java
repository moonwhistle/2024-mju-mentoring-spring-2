package com.lotto.web.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class LottoAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lottoAnswer;

    public LottoAnswer(Long id, String lottoAnswer) {
        this.id = id;
        this.lottoAnswer = lottoAnswer;
    }
}
