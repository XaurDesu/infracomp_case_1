public class Main {

    public static void main(String[] args) {

        Proceso procesoI = new Proceso(0,0);
        procesoI.start();
        //crea todos los procesos de nivel 1
        for (int i = 1; i <= 3; i++) {
            Proceso proces = new Proceso(1,i);
            proces.start();
        }
        /*
        //crea todos los procesos de nivel 2
        for (int i = 1; i <= 3; i++) {
            Proceso proces = new Proceso(2,i);
            proces.start();
        }
        */
        //crea todos los procesos de nivel 3
        /*for (int i = 1; i <= 3; i++) {
            Proceso proces = new Proceso(3,i);
            proces.start();
        }*/
        /* depronto debe ir algo aca de espera para que no se cree de una vez
        y asi mientras espera a que todos los procesos lleguen al ultimo buzon
        Proceso procesoF = new Proceso(4,4);
        procesoF.start();*/

    }

}
