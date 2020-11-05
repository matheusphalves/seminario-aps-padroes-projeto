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
            System.out.println(">"+ this.usuario + " você tem uma nova notificação!");
            System.out.println(this.canal.getName() + " enviou um video: " + this.canal.getState());
            System.out.println();
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return this.usuario;
        }
}