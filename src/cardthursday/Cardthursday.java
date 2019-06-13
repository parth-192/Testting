/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardthursday;

/**
 *
 * @author pgptl
 */
public class Cardthursday {
        //encapsulation works because all data types are private
    
        //to avoid coupling we have used enum
        //inheritance used to avoid repeating code
        //delegation is use to make a intermediate class
        //cohesion is used here to create a well focused class
        //interface used in class to interface instead of implementation
    
       public enum Suit{RED,YELLOW,GREEN,BLUE};
    private Suit s;
    public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW_TWO, DRAW_FOUR, WILDCARD};
    private Value v;
    
    public Cardthursday(Suit su , Value va)
    {
        this.s = su;
        this.v = va;
    }
    
    public Suit getS()
    {
        return s;
    }
    
    public Value getv()
    {
        return v;
    }
    
    public void setS(Suit s)
    {
        this.s = s;
    }
    
    public void setV(Value v)
    {
        this.v = v;
    }
    
    
    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
        
   // }
    
}
