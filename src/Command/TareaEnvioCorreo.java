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
public class TareaEnvioCorreo implements TareaProducto  {

	@Override
	public void ejecutar(Producto producto) {
		System.out.println(producto.getNombre() +"enviado por correo") ;
		
	}

}
