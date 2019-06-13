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
public class GamePlayer {
      public static void main(String[]args)
    {
        GameHand ch= new GameHand();
        ch.generate();//Calling
        for(Cardthursday c: ch.deck)
        {
            System.out.println(c.getS() + " " + c.getv());
        }
    }
}
