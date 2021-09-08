package com.main.demo;

import java.util.List;

public class MarketJSON {



    List<PlushData> plushDataList;
    List<TradeData> tradeDataList;

    public List<PlushData> getPlushDataList() {
        return plushDataList;
    }

    public void setPlushDataList(List<PlushData> plushDataList) {
        this.plushDataList = plushDataList;
    }

    public List<TradeData> getTradeDataList() {
        return tradeDataList;
    }

    public void setTradeDataList(List<TradeData> tradeDataList) {
        this.tradeDataList = tradeDataList;
    }


    @Override
    public String toString() {
        return "MarketJSON{" +
                "plushDataList=" + plushDataList +
                ", tradeDataList=" + tradeDataList +
                '}';
    }
}
