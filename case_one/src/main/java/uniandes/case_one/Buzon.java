public class Buzon {

    private int tamanio = 3;

    private String mensaje;

    public Buzon(int pTamanio, String pMensaje) {
        this.tamanio = pTamanio;
        this.mensaje = pMensaje;
    }

    public int darTamanio() {
        return this.tamanio;
    }

    public String darMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String pMensaje) {
        this.mensaje.concat(pMensaje);
    }
}
