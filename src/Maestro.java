
public class Maestro extends Persona{
	
	private int id;
	private String correo;
	private String departamento;
	private double salario;
	
	public Maestro(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int id, String correo,
			String departamento, double salario) {
		super(nombre, apellidoPaterno, apellidoMaterno, edad);
		this.id = id;
		this.correo = correo;
		this.departamento = departamento;
		this.salario = salario;
	}//Maestro

	public int getId() {
		return id;
	}//getId

	public void setId(int id) {
		this.id = id;
	}//setId

	public String getCorreo() {
		return correo;
	}//getCorreo

	public void setCorreo(String correo) {
		this.correo = correo;
	}//setCorreo

	public String getDepartamento() {
		return departamento;
	}//getDepartamento

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}//setDepartamento

	public double getSalario() {
		return salario;
	}//getSalario

	public void setSalario(double salario) {
		this.salario = salario;
	}//setSalario

	@Override
	public String toString() {
		return "Maestro [id=" + id + ", correo=" + correo + ", departamento=" + departamento + ", salario=" + salario
				+ "]";
	}//toString
	
	
}//Maestro
