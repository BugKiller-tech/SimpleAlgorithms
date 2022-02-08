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

    stockGrabber.unregister(stockObserver1);
    
      
    stockGrabber.setIBMPrice(197.00);
    stockGrabber.setAAPLPrice(677.60);
    stockGrabber.setGOOGPrice(676.40);

    Runnable getIBM = new GetTheStock(stockGrabber, 2, "IMB", 197.00);
    Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
    Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 200.00);

    new Thread(getIBM).start();
    new Thread(getAAPL).start();
    new Thread(getGOOG).start();
    
    
  }
  
}
