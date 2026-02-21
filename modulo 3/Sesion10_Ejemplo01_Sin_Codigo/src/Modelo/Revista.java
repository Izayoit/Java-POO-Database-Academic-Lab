package Modelo;

public class Revista extends Publicacion{
    private int Num_publicacion;

    public Revista(int Num_publicacion, String editor, String fecha_publicacion, int numero_paginas) {
        super(editor, fecha_publicacion, numero_paginas);
        this.Num_publicacion = Num_publicacion;
    }
    
    @Override
    public Object[] getRegistro(){
return new Object[]{getEditor(),getFecha_publicacion(),getNum_publicacion(),Num_publicacion  };

}
 public static String[] getCabezera(){
 return new String[]{"editor","fec. publicacion","Nume. paginas","num. circulacion"};
 
 }

    public int getNum_publicacion() {
        return Num_publicacion;
    }

    public void setNum_publicacion(int Num_publicacion) {
        this.Num_publicacion = Num_publicacion;
    }
    
    
}
