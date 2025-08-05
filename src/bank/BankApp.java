


package bank;

public class BankApp {
     int accountNo = 161911;
    String name;
    float initialBalance = 0;
    int pin = 161911;
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
}
