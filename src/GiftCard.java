public class GiftCard extends Card{

    private String type;

    public GiftCard(String name,boolean expired,String type){
        super(name, expired);
        this.type = type;
    }


    public boolean isValidStore(String type){
        if (this.type.equals(type)){return true;}
        else return false;
    }


    public String getType() {
        return type;
    }
}
