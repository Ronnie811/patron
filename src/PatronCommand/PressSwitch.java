/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronCommand;

/**
 *
 * @author kruger
 */
public class PressSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     

      Light lamp = new Light();
      Command switchUp = new FlipUpCommand(lamp);
      Command switchDown = new FlipDownCommand(lamp);

      // See criticism of this model above:
      // The switch itself should not be aware of lamp details (switchUp, switchDown)
      // either directly or indirectly
      Switch mySwitch = new Switch(switchUp, switchDown);

      switch ("ON") {
         case "ON":
            mySwitch.flipUp();
            break;
         case "OFF":
            mySwitch.flipDown();
            break;
         default:
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
      }
    }
    
}
