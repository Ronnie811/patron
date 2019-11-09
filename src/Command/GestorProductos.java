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
public class GestorProductos {

	public void validarProducto(Producto producto) {

		if (producto.getPrecio()< 100) {

			System.out.println("producto valido");
		} else {

			System.out.println("producto invalido");
		}
	}

	public void imprimirProducto(Producto producto) {
		
		System.out.println(producto.getNombre());
		System.out.println(producto.getId());
		System.out.println(producto.getPrecio());
	}
	
	public void enviarPorCorreo(Producto producto) {
		
		System.out.println(producto.getNombre() +"enviado por correo") ;
	}
}  