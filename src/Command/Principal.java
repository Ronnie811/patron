package Command;

public class Principal {

	public static void main(String[] args) {
		
		
		SuperTarea st= new SuperTarea();
		
		st.addTarea(new ValidarProducto());
		st.addTarea(new TareaEnvioCorreo());
		
		GestorTareas gt= new GestorTareas();
		Producto p= new Producto(1,"tablet ",80);
		
		gt.ejecutar(st, p);

	}

}