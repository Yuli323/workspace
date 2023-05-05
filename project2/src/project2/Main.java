package project2;

import java.security.SecureRandom;

public class Main {
    
public static void main (String[] args) {
    String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    String[] suits = { "♧", "♢", "♡", "♤" };
    String[] deckOfCardFace = new String[52];
    String[] deckOfCardSuit = new String[52];
    int Count = 0;
    
    for(int i = 0; i < deckOfCardFace.length; i++) {
        deckOfCardFace[i] = faces [i %13];
        deckOfCardSuit[i] =  suits[i/13];
    }
    
    //shuffle
        shuffle (deckOfCardFace,deckOfCardSuit);
        Count = dealcard(deckOfCardFace, deckOfCardSuit, Count, 3);
        
        shuffle(deckOfCardFace, deckOfCardSuit);
        Count = dealcard(deckOfCardFace, deckOfCardSuit, Count,2);
        
        shuffle(deckOfCardFace, deckOfCardSuit);
        Count = dealcard(deckOfCardFace, deckOfCardSuit, Count, 4);
        
        shuffle(deckOfCardFace,deckOfCardSuit);
        Count = dealcard(deckOfCardFace, deckOfCardSuit, Count, 2);
}

    public static void shuffle (String[] deckOfCardFace,String[] deckOfCardSuit){
          SecureRandom randomNumbers = new SecureRandom();
        for(int i = 0; i < deckOfCardFace.length; i++) {
            int randNum = randomNumbers.nextInt(52);
            String tempFace = deckOfCardFace[randNum];
            String tempSuit = deckOfCardSuit[randNum];
            
            deckOfCardFace[randNum]= deckOfCardFace[i]; 
            deckOfCardSuit[randNum]= deckOfCardSuit[i]; 
            
            deckOfCardFace[i]= tempFace;
            deckOfCardSuit[i]= tempSuit; 
       }
    }   
    //dealcard
    public static int dealcard (String[] deckOfCardFace,String[] deckOfCardSuit,int Count,int randNum) {
    for(int i = 0; i < randNum; i++) {
        String face = deckOfCardFace[Count];
        String suit = deckOfCardSuit[Count];
        Count++;
        System.out.println(face + "_" + suit);
        }
       System.out.println("------");
       return Count ;
    }
}


