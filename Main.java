//----------> Main

class Main{
	
	public static void main(String args[]){
		TComputologo Stephania = new TComputologo("Gatito Enojado");
		TDeportista Andrik = new TDeportista("Andrik");
		
		System.out.println(Stephania.getNombre() + 
		" corre a una velocidad de: " + 
		Stephania.velocidadcCorrer() + " km/h");
		
		System.out.println(Andrik.getNombre() + 
		" corre a una velocidad de: " + 
		Andrik.velocidadcCorrer() + " km/h");
	}//FIN METODO main

}//FIN CLASE Main
