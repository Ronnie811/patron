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
class OtraCocina {
    private OtroPizzaBuilder pizzaBuilder;
 

 
    public void construirPizza() {
       pizzaBuilder.crearNuevaPizza();
       //notar que no se necesita llamar a cada build.
    }
}
