/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

/**
 *
 * @author kruger
 */
class PicantePizzaBuilder extends PizzaBuilder{
    public PicantePizzaBuilder(){super.pizza = new Pizza();}
    public void buildMasa()   { pizza.setMasa("cocido"); }
    public void buildSalsa()   { pizza.setSalsa("picante"); }
    public void buildRelleno() { pizza.setRelleno("pimienta+salchichón"); }
}
