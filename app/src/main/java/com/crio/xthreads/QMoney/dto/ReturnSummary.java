package com.crio.xthreads.QMoney.dto;

public class ReturnSummary {
    private final String symbol;
    private final double totalReturn;
    private final double annualizedReturn;

    public ReturnSummary(String symbol, double totalReturn, double annualizedReturn) {
        this.symbol = symbol;
        this.totalReturn = totalReturn;
        this.annualizedReturn = annualizedReturn;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getTotalReturn() {
        return totalReturn;
    }

    public double getAnnualizedReturn() {
        return annualizedReturn;
    }

    @Override
    public String toString() {
        String totalReturnPercentage = String.format("%.2f%%", totalReturn);
        String annualizedReturnPercentage = String.format("%.2f%%", annualizedReturn);

        return "symbol: " + symbol + "| Total Return: " + totalReturnPercentage + "| Annualized Return:" + annualizedReturnPercentage ;
    }

    
}