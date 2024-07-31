package com.lotto.web.domain;

import java.util.List;

public class LottoRank {

    private static final int INITIAL_NUMBER = 0;

    private final int count;

    public LottoRank(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    private int countLottoNumber(List<Integer> lottoNumber, List<Integer> lottoAnswer) {
        int count = INITIAL_NUMBER;
        for (int number : lottoNumber) {
            count = checkCount(lottoAnswer, number, count);
        }
        return count;
    }

    private int checkCount(List<Integer> lottoAnswer, int number, int count){
        if(lottoAnswer.contains(number)){
            count++;
        }
        return count;
    }
}
