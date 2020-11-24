package mvc;

import java.awt.event.*;
import javax.swing.*;

public class controller implements ActionListener{

	private Model model;
	private View view;

	public controller(Model m,View v){
	model = m;
	view = v;
	view.setControlador(this); 
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		switch (event.getActionCommand()) {
		case interfaceView.OPEN:
			model.setFileName(view.getFileName());
			view.setText(model.read());
			break;
		case interfaceView.ENCRYPT:
			model.setContenido(view.getText());
			view.setText(model.Encrypt());
			break;
		case interfaceView.DECRYPT:
			model.setContenido(view.getText());
			view.setText(model.Decrypt());
			break;
		case interfaceView.SAVE:
			model.setFileName(view.getFileName());
			model.setContenido(view.getText());
			model.write();
			break;
		default:
			JOptionPane.showMessageDialog(null,"Error");
			break;
		}
	}

	public void arrancar(){ 
		view.setLocationRelativeTo(null);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(650,300);
		view.setVisible(true);
	}
}
