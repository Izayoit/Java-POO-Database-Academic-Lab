
package modelo;

public class empresa {
   
    private almacen objAlmacen01, ObjAlmacen02 ,ObjAlmacen03;
    

    public empresa() {
        ObjAlmacen03 = new almacen();
        ObjAlmacen02 = new almacen();
        objAlmacen01 = new almacen();

    }

    public empresa(almacen objAlmacen01, almacen ObjAlmacen02, almacen ObjAlmacen03) {
        this.objAlmacen01 = objAlmacen01;
        this.ObjAlmacen02 = ObjAlmacen02;
        this.ObjAlmacen03 = ObjAlmacen03;
        
    }

 

    public almacen getObjAlmacen01() {
        return objAlmacen01;
    }

    public void setObjAlmacen01(almacen objAlmacen01) {
        this.objAlmacen01 = objAlmacen01;
    }

    public almacen getObjAlmacen02() {
        return ObjAlmacen02;
    }

    public void setObjAlmacen02(almacen ObjAlmacen02) {
        this.ObjAlmacen02 = ObjAlmacen02;
    }

    public almacen getObjAlmacen03() {
        return ObjAlmacen03;
    }

    public void setObjAlmacen03(almacen ObjAlmacen03) {
        this.ObjAlmacen03 = ObjAlmacen03;
    }
    
    
    
    
    
}
