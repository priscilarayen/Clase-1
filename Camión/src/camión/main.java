package camión;


public class main {

  
    public static void main(String[] args) {
        camion unCamion = new camion();
        
        unCamion.setMarca("Bedford");
        unCamion.setModelo("MSD");
        unCamion.setAnio(1939);
        unCamion.setRevisionTecnica(true);
        
        
        System.out.println(unCamion.getMarca());
        System.out.println(unCamion.getModelo());
        System.out.println(unCamion.getAnio());
        System.out.println(unCamion.getRevisionTecnica());
        
        System.out.println(unCamion);
    }
    
}
