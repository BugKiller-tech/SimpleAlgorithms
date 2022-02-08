package observer_pattern;

public class GrabStocks {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    StockGrabber stockGrabber = new StockGrabber();
    
    StockObserver stockObserver1 = new StockObserver(stockGrabber);
    StockObserver stockObserver2 = new StockObserver(stockGrabber);
    StockObserver stockObserver3 = new StockObserver(stockGrabber);
    
    stockGrabber.setIBMPrice(197.00);
    stockGrabber.setAAPLPrice(677.60);
    stockGrabber.setGOOGPrice(676.40);
    
    stockObserver1.printThePrices();
    stockObserver2.printThePrices();
    stockObserver3.printThePrices();
    
    stockGrabber.setIBMPrice(197.00);
    stockGrabber.setAAPLPrice(677.60);
    stockGrabber.setGOOGPrice(676.40);
    
    stockObserver1.printThePrices();
    stockObserver2.printThePrices();
    stockObserver3.printThePrices();
    
    stockGrabber.setIBMPrice(197.00);
    stockGrabber.setAAPLPrice(677.60);
    stockGrabber.setGOOGPrice(676.40);
    
    stockObserver1.printThePrices();
    stockObserver2.printThePrices();
    stockObserver3.printThePrices();
    
    stockGrabber.setIBMPrice(197.00);
    stockGrabber.setAAPLPrice(677.60);
    stockGrabber.setGOOGPrice(676.40);
    
    stockObserver1.printThePrices();
    stockObserver2.printThePrices();
    stockObserver3.printThePrices();
    
    stockGrabber.setIBMPrice(197.00);
    stockGrabber.setAAPLPrice(677.60);
    stockGrabber.setGOOGPrice(676.40);
    
    stockObserver1.printThePrices();
    stockObserver2.printThePrices();
  }
  
}
