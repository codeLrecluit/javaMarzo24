package comm;

public class Bocinas {
	int pulgadas;
	String marca;
	int precio;
	String tipo;
	String proveedor;
	
	



public Bocinas() {
	
}





public Bocinas(int pulgadas, String marca, int precio, String tipo, String proveedor) {
	super();
	this.pulgadas = pulgadas;
	this.marca = marca;
	this.precio = precio;
	this.tipo = tipo;
	this.proveedor = proveedor;
}





public int getPulgadas() {
	return pulgadas;
}





public void setPulgadas(int pulgadas) {
	this.pulgadas = pulgadas;
}





public String getMarca() {
	return marca;
}





public void setMarca(String marca) {
	this.marca = marca;
}





public int getPrecio() {
	return precio;
}





public void setPrecio(int precio) {
	this.precio = precio;
}





public String getTipo() {
	return tipo;
}





public void setTipo(String tipo) {
	this.tipo = tipo;
}





public String getProveedor() {
	return proveedor;
}





public void setProveedor(String proveedor) {
	this.proveedor = proveedor;
}





@Override
public String toString() {
	return "Bocinas [pulgadas=" + pulgadas + ", marca=" 
+ marca + ", precio=" + precio + ", tipo=" + tipo
			+ ", proveedor=" + proveedor + "]";
}


}
