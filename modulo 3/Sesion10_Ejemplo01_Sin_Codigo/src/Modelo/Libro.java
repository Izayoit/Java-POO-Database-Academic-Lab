package Modelo;

public class Libro extends Publicacion {
    
private String autor;
private String isbn;

    public Libro(String editor, String fecha_publicacion, int numero_paginas,String autor, String isbn) {
        super(editor, fecha_publicacion, numero_paginas);
        this.autor = autor;
        this.isbn = isbn;
    }
@Override
    public Object[] getRegistro(){
    return new Object[]{getEditor(), getFecha_publicacion(),getNumero_paginas(),autor,isbn};
}
public static String[] getcabezera(){
return new String[]{
"editor","fec. publicacion","Nume. paginas","auto","isbn"
};
}
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   

    
    
    
}
