import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplementation implements AtmOperations{

    ATM atm = new ATM();
    Map<Double,String> miniStatement  = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available balance " + atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {


        if(withdrawAmount<=atm.getBalance()){
            miniStatement.put(withdrawAmount,"Amount Withdrawn");
        System.out.println(" please collect you cash "+ withdrawAmount);
        atm.setBalance(atm.getBalance() - withdrawAmount);
        viewBalance();

        }else{

            System.out.println("You don't have enough money");
            System.out.println("your balance is " + atm.getBalance());
        }


    }

    @Override
    public void depositAmount(double depositAmount) {
        miniStatement.put(depositAmount,"Amount deposited");
        System.out.println(depositAmount + " Deposited successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void viewMinStatement() {
        for(Map.Entry<Double,String>m:miniStatement.entrySet()){
            System.out.println(m.getKey() + " " +  m.getValue());
        }

    }
}
