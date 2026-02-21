package Modelo;

public abstract class Publicacion {
    private String editor;
    private String fecha_publicacion;
    private int numero_paginas;

    public Publicacion(String editor, String fecha_publicacion, int numero_paginas) {
        this.editor = editor;
        this.fecha_publicacion = fecha_publicacion;
        this.numero_paginas = numero_paginas;
    }
    
    public abstract Object[] getRegistro();
    
    
    
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
    
   
    
}
