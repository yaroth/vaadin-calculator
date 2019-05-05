package ch.bfh.bti7081;

public interface CalculatorViewInterface {

    void setDisplay(double value);

    interface CalculatorViewListenerInt {
        void buttonClick(char operation);
    }

    void addListener(CalculatorViewListenerInt listener);
}