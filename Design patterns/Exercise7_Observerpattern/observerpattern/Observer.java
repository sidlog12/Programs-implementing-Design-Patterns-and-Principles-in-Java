package observerpattern;

interface Observer {
	 void update(double stockPrice);
}

class MobileApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock price updated to " + stockPrice);
    }
}

class WebApp implements Observer {
    public void update(double stockPrice) {
        System.out.println("Web App: Stock price updated to " + stockPrice);
    	}
	}
