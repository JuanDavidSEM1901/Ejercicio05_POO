public class Restaurante {
    private Cocina cocina; // composicion: Restaurante "tiene una" cocina.
    private Mesero mesero; // composicion: Restaurante "tiene un" Mesero.
    private Caja caja; // composicion: Restaurante "tiene una" caja.
    
    
    public Restaurante() {
        this.cocina = new Cocina();
        this.mesero = new Mesero();
        this.caja = new Caja();
    }

    public void operarRestaurante(){
        cocina.prepararPlato();
        mesero.servir();
        caja.procesarPago();
    }

    
}
