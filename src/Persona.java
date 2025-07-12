
public abstract class Persona {
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;
	
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}//Persona

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}//getApellidoPaterno

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}//setApellidoPaterno

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}//getApellidoMaterno

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}//setApellidoMaterno

	public int getEdad() {
		return edad;
	}//getEdad

	public void setEdad(int edad) {
		this.edad = edad;
	}//setEdad

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", edad=" + edad + "]";
	}//toString

}//Persona
