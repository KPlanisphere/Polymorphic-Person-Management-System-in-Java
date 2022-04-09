//----------> TDeportista

class TDeportista extends TPersonaPolimorfica{
	
	TDeportista(String nombre){
		super(nombre);
	}

	@Override
	public double velocidadcCorrer(){
		return 12;
	}
	
}//FIN CLASE TDeportista
