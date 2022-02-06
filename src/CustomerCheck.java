import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        double totalPrice = 0.0;
        for(MenuItem item : check) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        if(totalPrices() >= 40) {
            for(MenuItem item : check) {
                if(item.isDailySpecial()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        double finalCost = totalPrices();
        int customers = 0;
        for(MenuItem item : check) {
            if(item.isEntree()) {
                customers++;
            }
        }
        if(customers >= 6) {
            finalCost += (totalPrices() * 0.2);
        }
        if(couponApplies()) {
            finalCost -= (totalPrices() * 0.25);
        }
        return finalCost;
    }
}