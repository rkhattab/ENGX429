package CashRegister;

/**
 *
 * @author Reem Khattab
 */

public class CashRegisterDemo {
    public static void main(String[] args) {
        int numberOfItems = 0; 
        double totalCashAmount = 0;
        
        CashRegister register1 = new CashRegister(numberOfItems, totalCashAmount); 
        CashRegister register2 = new CashRegister(numberOfItems, totalCashAmount);
        
        System.out.println("The total number of registers are: " + register1.getRegisterCount());
        System.out.println("Currently all registers are empty -- see amount: " + register2.getTotalCash());
        System.out.println("========================================");
        //first register
        System.out.println("Customer checking out at register 1: ");
        register1.checkout(12, 32.79); 
        System.out.println("Register 1 Items: " + register1.getItems());
        System.out.println("Register 1 Cash: " + register1.getTotalCash());
        System.out.println("Register 1 Average Price Per Item: " + register1.getAveragePricePerItem());
        //second register 
        System.out.println("========================================");
        System.out.println("Customer checking out at register 2: ");
        register2.checkout(6, 55.97); 
        System.out.println("Register 2 Items: " + register2.getItems());
        System.out.println("Register 2 Cash: " + register2.getTotalCash());
        System.out.println("Register 2 Average Price Per Item: " + register2.getAveragePricePerItem());
        //totals for all registers 
        System.out.println("========================================");
        System.out.println("Stats for all registers: ");
        System.out.println("Total Items for all registers: " + register1.getAllItems());
        System.out.println("Total Cash for all registers: " + register1.getAllTotalCash());
        System.out.println("Total Number of Active Registers: " + register1.getRegisterCount());
        System.out.println("========================================");
        System.out.println("Cashing out registers...");
        register1.cashout();
        register2.cashout();
        System.out.println("Total Cash for Register 1: " + register1.getTotalCash());
        System.out.println("Total Cash for Register 2: " + register2.getTotalCash());
    }
}
