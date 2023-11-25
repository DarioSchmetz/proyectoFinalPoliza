package modelo;

public interface MetodosUsuario {

	// Metodos inherentes al USUARIO en general:

	public void registrarObservacion();

	public void ingresarAlSistema();

	
	
	// Metodos inherentes al usuario ADMINISTRADOR:

	public void modificarPoliza();

	public void darBajaPoliza();

	public void gestionarObservaciones();

	public void registrarPoliza();

	public void registrarClientes();

	
	
	// Metodos inherentes al usuario CLIENTE:

	public void buscarCompañia();

}