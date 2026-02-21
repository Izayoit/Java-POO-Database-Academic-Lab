
package modelo;


public class almacen {
    private int codigoAlmacen;
    private String nombreAlmacen;
    private Empleado objempleado01,objempleado02,objempleado03,objempleado04;
    public almacen() {
        objempleado01 = new Empleado();
        objempleado02 = new Empleado();
        objempleado03 = new Empleado();
        objempleado04 = new Empleado();
        
  
    }
     

    public almacen(int codigoAlmacen, String nombreAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
        this.nombreAlmacen = nombreAlmacen;
         objempleado01 = new Empleado();
        objempleado02 = new Empleado();
        objempleado03 = new Empleado();
        objempleado04 = new Empleado();
    }

    public almacen(Empleado objempleado01, Empleado objempleado02, Empleado objempleado03, Empleado objempleado04) {
        this.objempleado01 = objempleado01;
        this.objempleado02 = objempleado02;
        this.objempleado03 = objempleado03;
        this.objempleado04 = objempleado04;
    }

    public Empleado getObjempleado01() {
        return objempleado01;
    }

    public void setObjempleado01(Empleado objempleado01) {
        this.objempleado01 = objempleado01;
    }

    public Empleado getObjempleado02() {
        return objempleado02;
    }

    public void setObjempleado02(Empleado objempleado02) {
        this.objempleado02 = objempleado02;
    }

    public Empleado getObjempleado03() {
        return objempleado03;
    }

    public void setObjempleado03(Empleado objempleado03) {
        this.objempleado03 = objempleado03;
    }

    public Empleado getObjempleado04() {
        return objempleado04;
    }

    public void setObjempleado04(Empleado objempleado04) {
        this.objempleado04 = objempleado04;
    }

    

    

    
    

   
    
    

    public int getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigo(int codigoalmacen) {
        this.codigoAlmacen = codigoalmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

   
    
    
    
    
    
}
