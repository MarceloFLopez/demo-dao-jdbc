package db;

public class DbIntegrityExecpetion extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DbIntegrityExecpetion(String msg) {
		super(msg);
	}
}
