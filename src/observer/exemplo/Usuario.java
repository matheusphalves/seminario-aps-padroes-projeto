package observer.exemplo;

import observer.ObserverInterface;
import observer.SubjectInterface;

public class Usuario implements ObserverInterface {

	
		private String usuario;
		private Canal canal;
		
		
		public Usuario(String name, Canal canal) {
			this.usuario = name;
			canal.addObserver(this);
		}
		
		
		@Override
		public void update(SubjectInterface canal) {	
			this.canal = (Canal) canal;
			System.out.println(this.canal.getName() + this.canal.getState());	
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.usuario;
		}	
}
