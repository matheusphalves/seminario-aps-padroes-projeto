package observer.exemplo;

public class Main {

    public static void main(String[] args) {
        //CANAIS
        Canal canal1 = new Canal("APS");
        Canal canal2 = new Canal("LPF");
        Canal canal3 = new Canal("LPI");

        //USUARIOS
        Usuario nirton = new Usuario("Nilton", canal1);
        Usuario matheus = new Usuario("Matheus", canal2);
        Usuario birilo = new Usuario("Birilo", canal2);

        canal1.sendVideo("Diagramas de classe");
        canal2.sendVideo("Funções de alta ordem");
        canal3.sendVideo("Estrutura de repetição");


    }

}