package com.design_shinbi.blackjack.model;

import java.util.ArrayList;
import java.util.List;

//↓　APIの説明文の挿入　/** +エンターキーで自動的に三行記入される。（ジャバドック）

/**
 * 1枚1オブジェクトのカードクラス
 */
public class Card {

	private Suit suit;
    private int number;
    
    /**
     * コンストラクター
     * @param suit　トランプのマーク
     * @param number　トランプの数字（ただし　A:1, J: 11, Q:12, K:13）
     */
 
    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }
    /**
     * トランプのマークを取得する
     * @return　トランプのマーク
     */
    public Suit getSuit() {
        return suit;
    }
    /**
     * トランプの数字を取得する
     * @return　トランプの数字
     */
    public int getNumber() {
        return number;
    }
    /**
     * トランプの数字（マークを取得する）
     * @param number　トランプの数字
     * @return　トランプの数字（１～10、JQK）
     */
    public static String getNumberString(int number) {
        String string = null;
 
        if(number == 1) {
            string = "A";
        }
        else if(number == 11) {
            string = "J";
        }
        else if(number == 12) {
            string = "Q";
        }
        else if(number == 13) {
            string = "K";
        }
        else if(number >= 2 && number <= 10) {
            string = Integer.toString(number);
        }
 
        return string;
    }
    /**
     * 取得したトランプのマークと数字を表示する。
     */
    public String toString() {
        String string = String.format(
            "[%s%s]", this.suit.getName(), getNumberString(this.number)
        );
        return string;
    }
    /**
     * すべてのトランプカードの数字とマークを取得する
     * @return　すべてのトランプのカード
     */
    public static List<Card> getAllCards() {
        List<Card> list = new ArrayList<Card>();
       
        for(Suit suit : Suit.values()) {
            for(int number = 1; number <= 13; number++) {
                Card card = new Card(suit, number);
                list.add(card);
            }
        }
 
        return list;
    }
}

