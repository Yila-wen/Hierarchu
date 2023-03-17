public class Card {

    private String name;
    private boolean expired;


    public Card(String name, boolean expired){
        this.name = name;
        this.expired = expired;
    }


    public String changeName(String x){
        name = x;
        return name;
    }


    public String getName() {
        return name;
    }

    public boolean isExpired() {
        return expired;
    }
}
