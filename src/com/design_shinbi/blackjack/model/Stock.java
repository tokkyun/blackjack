package com.design_shinbi.blackjack.model;

import java.util.Collections;
import java.util.List;
/**
 * トランプの山札のクラス
 */
public class Stock {
    private List<Card> cards;
    
    /**
     * コンストラクター
     */
    public Stock() {
        initialize();
    }
    /**
     * 山札のカードをシャッフルする
     */
    public void initialize() {
        List<Card> list = Card.getAllCards();
        Collections.shuffle(list);
        this.cards = list;
    }
    /**
     * 山札の合計枚数を取得する
     * @return
     */
    public int getNumberOfCards() {
        return this.cards.size();
    }
    /**
     * 山札から1枚カードを取得する。山札から１枚カードを取り除く
     * @return　取得したカード
     */
    public Card pickCard() {
        Card card = this.cards.get(0);
        this.cards.remove(0);
        return card;
    }
}