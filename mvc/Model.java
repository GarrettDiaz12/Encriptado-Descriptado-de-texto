package mvc;

import java.io.*;

public class Model{

	private String CampoText;
	private String NameFile;
	final char s = (char) 3;
	final char d = (char) 1;

	public void setContenido(String texto) {CampoText = texto;}

	public String getCon(){return CampoText;}

	public void setFileName(String name) {NameFile = name;}

	public String Encrypt(){
		String ctext = "";
		for (String line : CampoText.split("\n")) {
			StringBuilder chain = new StringBuilder();
			for (char w : line.toCharArray()) {
				if (Character.isLetter(w))
					w += s;
				chain.append(w);
			}
			
			StringBuilder shift_chain = new StringBuilder();
			String shifttext = chain.reverse().toString();
			int h = shifttext.length()/2;
			for (char c : shifttext.substring(h, shifttext.length()).toCharArray()) {
				if (Character.isLetter(c))
					c -= d;
				shift_chain.append(c);
			}
			ctext = ctext + shifttext.substring(0, h) + shift_chain.toString() + "\n";
		}
		CampoText = ctext;
		return ctext;
	}

	public String Decrypt(){
	String text = "";
	for ( String ctext : CampoText.split ("\n")){
	int h = ctext.length()/2;
	StringBuilder shift_cadena = new StringBuilder(ctext.substring(0 ,h));
	for ( char ce : ctext.substring(h, ctext.length()).toCharArray()){
			if ( Character.isLetter(ce))
			ce += d ;
			shift_cadena.append(ce);
			}
	
			String shifttext = shift_cadena.reverse().toString();
			StringBuilder chain = new StringBuilder();
			for ( char x : shifttext.toCharArray()){
			if ( Character.isLetter(x -3))
			x -= s;
			chain . append(x);
			}
			text = text + chain . toString () + "\n";
			}
	
			CampoText = text;
			return text;
			}

	public String read(){
		String cad;
		String content = "";
		File file = new File(NameFile);
		try {
			if (file.exists()) {
				BufferedReader b = new BufferedReader(new FileReader(file));
				while ((cad = b.readLine()) != null)
					content = content + cad + "\n";
				b.close();
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println(" Error opening file .");
		} catch (IOException ioException) {
			System.err.println(" Error reading file .");
		}
		CampoText = content;
		return content;
	}

	public void write(){
		try {
			File archivo = new File("file");
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));;
			bw.write(CampoText);
			bw.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println(" Error opening file .");
		} catch (IOException ioException) {
			System.err.println(" Error reading file .");
		}
	}

}
