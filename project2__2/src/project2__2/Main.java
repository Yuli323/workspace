package project2__2;

public class Main {

    public static void main(String[] args) {
        DeckOfCard deckOfCard ;
        deckOfCard = new DeckOfCard();
        
        //第一次
        deckOfCard.shuffle(true);
        deckOfCard.dealCard(3,false);
        System.out.println("------");
        
        //第二次
        deckOfCard.shuffle(true);
        deckOfCard.dealCard(2,false);
        System.out.println("------");
        
        //第三次
        deckOfCard.shuffle(false);
        deckOfCard.dealCard(3,true);
        System.out.println("------");
        
        //第四次
        deckOfCard.shuffle(true);
        deckOfCard.dealCard(2,false);
        System.out.println("------");
    }
}
