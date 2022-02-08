package observer_pattern;

public class StockObserver implements Observer {

  private double imbPrice;
  private double aaplPrice;
  private double googPrice;

  private static int observerIDTracker = 0;

  private int observerID;

  private Subject stockGrabber;

  public StockObserver(Subject stockGrabber) {
    this.stockGrabber = stockGrabber;
    this.observerID = ++observerIDTracker;

    System.out.println("New observer " + this.observerID);

    stockGrabber.register(this);
  }

  @Override
  public void update(double ibmPrice, double aaplPrice, double googPrice) {
    // TODO Auto-generated method stub
    this.imbPrice = ibmPrice;
    this.aaplPrice = aaplPrice;
    this.googPrice = googPrice;

    printThePrices();
  }


  public void printThePrices() {
    System.out.println(observerID + "\nIBM: " + imbPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice);
  }
  
  
}
