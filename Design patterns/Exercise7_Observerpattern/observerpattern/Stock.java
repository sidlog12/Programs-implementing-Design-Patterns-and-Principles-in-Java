package observerpattern;
import java.util.*;

interface Stock {
void register(Observer observer);
void deregister(Observer observer);
void notifyObservers();
}

class StockMarket implements Stock {
private List<Observer> observers;
private double stockPrice;

public StockMarket() {
    observers = new ArrayList<>();
}

public void register(Observer observer) {
    observers.add(observer);
}

public void deregister(Observer observer) {
    observers.remove(observer);
}

public void notifyObservers() {
    for (Observer observer : observers) {
        observer.update(stockPrice);
    }
}

public void setStockPrice(double stockPrice) {
    this.stockPrice = stockPrice;
    notifyObservers();
}


}
