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
public class GameHand {
     private int size=60;
    Cardthursday[] deck = new Cardthursday[size];//array of object
    public void generate()
    {
        //foreach loop
        int counter=0;
        for(Cardthursday.Suit s : Cardthursday.Suit.values())
        {
            for(Cardthursday.Value v : Cardthursday.Value.values())
            {
                //CardThursday c1 = new CardThursday(s,v);
                deck[counter] = new Cardthursday(s,v);
                counter++;
            }
        }
    }
}
