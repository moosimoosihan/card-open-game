package com.example.firstgame;

public class MemoryCard {
    private int imageld;
    private boolean isFaceUp;
    private boolean isMatched;

    public MemoryCard(int imageld, boolean isFaceUp, boolean isMatched){
        this.imageld = imageld;
        this.isFaceUp = isFaceUp;
        this.isMatched = isMatched;
    }
    public int getImageld() {
        return imageld;
    }
    public void setImageld(int imageld){
        this.imageld = imageld;
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void setFaceUp(boolean faceUp){
        isFaceUp = faceUp;
    }
    public  boolean isMatched(){
        return isMatched;
    }
    public void setMatched(boolean matched){
        isMatched = matched;
    }
}
