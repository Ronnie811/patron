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
public class ValidarProducto implements TareaProducto{

	@Override
	public void ejecutar(Producto producto) {
	if (producto.getPrecio()<100) {
		
		System.out.println("producto valido");
	}else {
		
		System.out.println("producto invalido");
	}
		
	}

}