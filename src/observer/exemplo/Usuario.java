package observer.exemplo;
import java.util.ArrayList;

import observer.ObserverInterface;
import observer.SubjectInterface;

public class Usuario implements ObserverInterface {

	
		private String usuario;
		private ArrayList<Canal> canais;
		
		
		public Usuario(String name) {
			this.usuario = name;
			this.canais = new ArrayList<Canal>();
		}
		
		public void subscribe(Canal canal) {
			if(!this.canais.contains(canal)) {
				canal.addObserver(this);
				this.canais.add(canal);
			}
		}
		
		public void unsubscribe(Canal canal) {
			int index = this.canais.indexOf(canal);
			
			if(index!=-1) {
				this.canais.get(index).removeObserver(this);
				this.canais.remove(index);
			}
		}
		
		@Override
		public void update(SubjectInterface canal) {
			Canal canalUpdate = (Canal) canal;
			if(this.canais.contains(canalUpdate)) {
				System.out.println(canalUpdate.getName() + canalUpdate.getState());
			}		
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.usuario;
		}	
}
