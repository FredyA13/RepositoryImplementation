import java.util.ArrayList;

public class MaestroRepositoryImpl implements MaestroRepository{
	
	ArrayList <Maestro> maestros = new ArrayList<>();

	@Override
	public void guardar(Maestro maestro) {
		maestros.add(maestro);
	}//guardar

	@Override
	public void mostrarTodos() {
		
		for(Maestro maestro : maestros) {
			System.out.println(maestro);
		}//for
		
	}//mostrarTodos
	
	
}//MaestroRepositoryImpl
