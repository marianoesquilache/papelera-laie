package clases;

public class Producto {

    private int id;
    private String codProducto;
    private String categoria;
    private String nombre;
    private float precio1;
    private float precio2;
    private float precio3;
    private float precio4;

    public Producto(int id, String codProducto, String categoria, String nombre,
            float precio1, float precio2, float precio3, float precio4) {
        this.id = id;
        this.codProducto = codProducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.precio4 = precio4;

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio1() {
        return precio1;
    }

    public void setPrecio1(float precio1) {
        this.precio1 = precio1;
    }

    public float getPrecio2() {
        return precio2;
    }

    public void setPrecio2(float precio2) {
        this.precio2 = precio2;
    }

    public float getPrecio3() {
        return precio3;
    }

    public void setPrecio3(float precio3) {
        this.precio3 = precio3;
    }

    public float getPrecio4() {
        return precio4;
    }

    public void setPrecio4(float precio4) {
        this.precio4 = precio4;
    }
}
