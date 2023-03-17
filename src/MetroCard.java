public class MetroCard extends Card{

    private double balance;


    public MetroCard(String name,boolean expired,double bal){
        super(name,expired);
        this.balance = bal;
    }

    public boolean payFare(){
        if (balance - 2.75 >=0){return true;}
        else return false;
    }



    public double getBalance() {
        return balance;
    }
}
