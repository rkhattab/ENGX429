package CashRegister;

/**
 *
 * @author Reem Khattab
 */

public class CashRegister {
    
    private int numberOfItems; 
    private double totalCashAmount; 
    private static int countOfRegisters; 
    private static int countOfAllItems; 
    private static double countOfAllRegisterCash; 
    
    public CashRegister(int numberOfItems, double totalCashAmount)
    {
        this.numberOfItems = numberOfItems; 
        this.totalCashAmount = totalCashAmount; 
        countOfRegisters++; 
    }
    
    public void checkout(double totalCashAmount) {
   
        this.totalCashAmount = totalCashAmount; 
        this.numberOfItems = 1; 
        countOfAllItems = countOfAllItems++; 
        countOfAllRegisterCash = countOfAllRegisterCash  + totalCashAmount; 
    }
     
    public void checkout(int numberOfItems, double totalCashAmount) {
   
        this.totalCashAmount = totalCashAmount; 
        this.numberOfItems = numberOfItems; 
        countOfAllItems = countOfAllItems + numberOfItems; 
        countOfAllRegisterCash = countOfAllRegisterCash  + totalCashAmount; 
    }
    
    public void cashout(){
        this.totalCashAmount = 0; 
        this.numberOfItems = 0; 
    }
    
    public int getItems(){
        return numberOfItems; 
    }
    
    public double getTotalCash(){
        return totalCashAmount; 
    }
    
    public double getAveragePricePerItem() {
        return totalCashAmount / numberOfItems; 
    }
    
    public static int getRegisterCount() {
        return countOfRegisters; 
    }
    
    public static int getAllItems() {
        return countOfAllItems; 
    }
    
    public static double getAllTotalCash() {
        return countOfAllRegisterCash;
    }
}
