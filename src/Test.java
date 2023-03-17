public class Test {

    public static void main(String[] args) {

        Card C1 = new Card("James",false);
        System.out.println( C1.getName());
        System.out.println(C1.isExpired());
        System.out.println(C1.changeName("Bob"));



        GiftCard G1 = new GiftCard("Jim",false,"Macy");
        System.out.println(G1.getName());
        System.out.println(G1.isExpired());
        System.out.println(G1.changeName("Hom"));
        System.out.println(G1.isValidStore("Macy"));

        MetroCard M1 = new MetroCard("Mojer",false,50.75);
        System.out.println(M1.getName());
        System.out.println(M1.isExpired());
        System.out.println(M1.changeName("Bob"));
        System.out.println(M1.payFare());



    }



}
