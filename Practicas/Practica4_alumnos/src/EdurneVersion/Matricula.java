package EdurneVersion;

public class Matricula {
	private int idAlumno; 
	private int codAsig;
	
	/**
	 * Constructor
	 * @param idAlumno
	 * @param codAsig
	 */
	public Matricula(int idAlumno, int codAsig) {
		this.idAlumno = idAlumno;
		this.codAsig = codAsig;
	}

	/**
	 * Getter del NIP del alumno.
	 * @return
	 */
	public int getIdAlumno() {
		return idAlumno;
	}

	/**
	 * Setter del nip del alumno.
	 * @param idAlumno
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	/**
	 * Getter del código de asignatura.
	 * @return
	 */
	public int getCodAsig() {
		return codAsig;
	}

	/**
	 * Setter del código de asignatura.
	 * @param codAsig
	 */
	public void setCodAsig(int codAsig) {
		this.codAsig = codAsig;
	}

	@Override
	/**
	 * Método que sobrescribe el toString().
	 */
	public String toString() {
		return "Matricula [idAlumno=" + idAlumno + ", codAsig=" + codAsig + "]";
	}
}
