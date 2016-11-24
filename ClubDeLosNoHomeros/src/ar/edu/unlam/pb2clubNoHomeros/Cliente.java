package ar.edu.unlam.pb2clubNoHomeros;

public class Cliente implements Comparable<Cliente>{
	private String nombre;
	private Integer edad;
	
	public Cliente(String n, Integer e){
		this.nombre = n;
		this.edad = e;
	}

	@Override
	public int compareTo(Cliente arg0) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(arg0.nombre);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public Integer getEdad() {
		
		return this.edad;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	
	
	
}
