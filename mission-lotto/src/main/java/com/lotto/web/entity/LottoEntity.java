package com.lotto.web.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "LottoTicket")
public class LottoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String lottoNumber;
    @Column
    private boolean win;

    public LottoEntity(User user, String lottoNumber, boolean win) {
        this.user = user;
        this.lottoNumber = lottoNumber;
        this.win = win;
    }

    public LottoEntity() {
    }

    public String getLottoNumber(){
        return lottoNumber;
    }

    public boolean getWin(){
        return win;
    }
}
