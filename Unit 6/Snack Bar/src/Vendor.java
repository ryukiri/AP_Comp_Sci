/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

/*Austin Quach
 *Period 3
 *1.12.14
 */

public class Vendor
{
  // Fields:
  private int availableStock;
  private int price;
  private int depositedAmount;
  private int change;

  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  public Vendor(int p, int nInS)
  {
      price = p;
      availableStock = nInS;
  }

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None
  public void setStock(int n)
  {
      availableStock = n;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
  public int getStock()
  {
      return availableStock;
  }

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  public void addMoney(int n)
  {
      depositedAmount += n;
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
  public int getDeposit()
  {
      return depositedAmount;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  public boolean makeSale()
  {
      if(availableStock >=1 && depositedAmount >=price){
          availableStock -= 1;
          change = depositedAmount - price;
          depositedAmount = 0;
          return true;
      }else
          change += depositedAmount;
          depositedAmount = 0;
          return false;
  }

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
  public int getChange()
  {
      int x = change;
      change =0;
      return x;
  }
}
