public class Proceso extends Thread
{

    private static Buzon buzonEntrada = new Buzon(3, " ");

    private static Buzon buzonSalida = new Buzon(3, " ");

    private static Buzon unicoBuzonI = new Buzon(3, " ");

    private static Buzon unicoBuzonF = new Buzon(3, " ");

    private String mensaje;

    private int nivel;

    private int numeroDeProceso;

    public Proceso(int pNivel, int pNumeroDeProceso)
    {
        this.nivel = pNivel;
        this.numeroDeProceso = pNumeroDeProceso;

    }

    public void run()
    {
        if(this.darNivel()==0)
        {
            mensaje = "M1";
            unicoBuzonI.setMensaje(mensaje);
        }
        else if(this.darNivel()!=0){
            mensaje = unicoBuzonI.darMensaje();
        }

    }


    public int darNivel()
    {
        return this.nivel;
    }

    public int darNumeroDeProceso()
    {
        return this.numeroDeProceso;
    }






}
