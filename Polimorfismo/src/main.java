
public class main {
 
	public static void main(String[] args) {
			
			Gato gato = new Gato();    	 //ESTANCIA
			Cachorro cachorro = new Cachorro();
			
			//gato.falar();   //SUBI ESCREVI
			//cachorro.falar();
			Animal animal = new Cachorro();
			
			animal = gato;
			
			
			if(animal instanceof Cachorro) { 	//SE CACHORRO FOR IGUAL INSTANCIA O NOME E IGUAL  //ISSO E POLIMORFISMO
			
				System.out.println("Cachorro");	
				
			}else if(animal instanceof Gato) {
				
				System.out.println("Gato");
			}
			
			System.out.println();
			
			falar(gato);
			falar(cachorro);
			
			
			
		}
	
	private static  void falar(Animal a){		//METODO 'FALAR'   //STATIC CHAMAR DIREITO
		 a.falar();
	}
}
