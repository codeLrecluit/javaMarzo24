package com;

public abstract class Calculadora {
	
		
		String marca;
		String color;
		
		public Calculadora() {
			
		}
		public Calculadora(String marca, String color) {
			super();
			this.marca = marca;
			this.color = color;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Calculadora [marca=" + marca + ", color=" + color + "]";
		}
		
		public abstract void operaciones();//metodo abstracto, (que es lo que hace
		
		
	
}
