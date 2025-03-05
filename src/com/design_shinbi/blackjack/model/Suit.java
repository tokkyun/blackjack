package com.design_shinbi.blackjack.model;

/**
 * トランプのマークの列挙
 */
public enum Suit {
	
	SPADE("スペード"),
    HEART("ハート"),
    DIAMOND("ダイヤ"),
    CLUB("クラブ");
 
    private String name;
    
    /**
     * コンストラクター
     * @param name　トランプのマーク
     */
    private Suit(String name) {
        this.name = name;
    }
	/**
	 * トランプのマークを取得する
	 * @return　トランプのマーク
	 */
    
    public String getName() {
        return this.name;
    }
}
