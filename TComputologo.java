//----------> TComputologo

class TComputologo extends TPersonaPolimorfica{
	
	TComputologo(String nombre){
		super(nombre);
	}

	@Override
	public double velocidadcCorrer(){
		return 4;
	}
	
}//FIN CLASE TComputologo
