/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author kruger
 */
public class TareaImprimirProducto  implements TareaProducto{

	@Override
	public void ejecutar(Producto producto) {
		System.out.println(producto.getNombre());
		System.out.println(producto.getId());
		System.out.println(producto.getPrecio());
		
		
	}

}