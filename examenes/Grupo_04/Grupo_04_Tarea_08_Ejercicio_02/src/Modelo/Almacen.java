package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Almacen {
    private ArrayList<Producto> productos;
    private final int MAX_PRODUCTOS = 11;

    public Almacen() {
        
        productos = new ArrayList<>();
        
    }

    // 0 = No se pudo registrar (límite alcanzado o producto ya existe), 1 = Producto registrado correctamente
    public int registrarProducto(String codigo, String nombre) {
        if (productos.size() >= MAX_PRODUCTOS) {
            return 0; 
        }
        if (buscarProducto(codigo) != null) {
            return -1;  
        }
        productos.add(new Producto(codigo, nombre));
        return 1; 
    }

    // 0 = Producto no encontrado, 1 = Producto editado correctamente
    public int editarProducto(String codigo, String nuevoNombre) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            producto.setNombre(nuevoNombre);
            return 1; 
        }
        return 0; 
    }

    // 0 = Producto no encontrado, 1 = Producto eliminado correctamente
    public int eliminarProducto(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            productos.remove(producto);
            return 1;  
        }
        return 0;  
    }

    // -1 = Stock insuficiente, 0 = Producto no encontrado, 1 = Movimiento registrado correctamente
    public int registrarMovimiento(String codigo, int cantidad, String motivo) {
    Producto producto = buscarProducto(codigo);
    if (producto == null) {
        return 0;  
    }
    if (producto.getStock() + cantidad < 0) {
        return -1;  
    }
    producto.actualizarStock(cantidad);
     
    return 1;  
}

    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
public void guardarEnArchivo(String ARCHIVO) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
        for (Producto p : productos) {
            bw.write(p.getCodigo() + ";" + p.getNombre() + ";" + p.getStock());
            bw.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar en el archivo: " + e.getMessage());
    }
}

public void cargarDesdeArchivo(String ARCHIVO) {
    try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            if (datos.length == 3) {
                String codigo = datos[0];
                String nombre = datos[1];
                int stock = Integer.parseInt(datos[2]);
                productos.add(new Producto(codigo, nombre, stock));
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "No se pudo cargar el archivo: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Formato de stock incorrecto en el archivo: " + e.getMessage());
    }
}
}