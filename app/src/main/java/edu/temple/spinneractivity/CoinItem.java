package edu.temple.spinneractivity;

public class CoinItem {
    private String xCoinName;
    private int xCoinImg;

    public CoinItem(String coinName, int coinImg){
        xCoinImg = coinImg;
        xCoinName = coinName;
    }

    public String getCoinName(){return xCoinName;}
    public int getCoinImg(){return xCoinImg;}
}
