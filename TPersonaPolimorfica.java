//----------> TPersonaPolimorfica

abstract class TPersonaPolimorfica{
	
	private String nombre;
	
	TPersonaPolimorfica(String nombre){
		setNombre(nombre);
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public abstract double velocidadcCorrer();
	
}//FIN CLASE TPersonaPolimorfica
