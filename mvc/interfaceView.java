package mvc;

public interface interfaceView {
	void setControlador(controller c); 

	public String getFileName () ;

	public String getText();

	public void setText(String s); 

	static final String OPEN = "Open";
	static final String ENCRYPT = "Encrpyt";
	static final String DECRYPT = "Decrpryt";
	static final String SAVE = "Save";
}