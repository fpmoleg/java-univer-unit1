package ua.univer.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyForm {

	private JFrame frame;
	private JTextField txtSubject;
	private JTextField txtProfessor;
	private JLabel lblNumberOfLabs;
	private JTextField txtNumberLabs;
	private JLabel lblNumberOfLabsDone;
	private JTextField txtNumberLabsDone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyForm window = new MyForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSubject.setBounds(49, 47, 66, 16);
		frame.getContentPane().add(lblSubject);
		
		txtSubject = new JTextField();
		txtSubject.setBounds(219, 43, 200, 25);
		frame.getContentPane().add(txtSubject);
		txtSubject.setColumns(10);
		
		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setFont(new Font("Dialog", Font.BOLD, 13));
		lblProfessor.setBounds(49, 75, 78, 16);
		frame.getContentPane().add(lblProfessor);
		
		txtProfessor = new JTextField();
		txtProfessor.setBounds(219, 71, 200, 25);
		frame.getContentPane().add(txtProfessor);
		txtProfessor.setColumns(10);
		
		lblNumberOfLabs = new JLabel("Number of labs:");
		lblSubject.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNumberOfLabs.setBounds(49, 103, 119, 16);
		frame.getContentPane().add(lblNumberOfLabs);
		
		txtNumberLabs = new JTextField();
		txtNumberLabs.setBounds(219, 99, 200, 25);
		frame.getContentPane().add(txtNumberLabs);
		txtNumberLabs.setColumns(10);
		
		lblNumberOfLabsDone = new JLabel("Number of labs done:");
		lblNumberOfLabsDone.setBounds(49, 136, 164, 15);
		frame.getContentPane().add(lblNumberOfLabsDone);
		
		txtNumberLabsDone = new JTextField();
		txtNumberLabsDone.setBounds(219, 131, 200, 25);
		frame.getContentPane().add(txtNumberLabsDone);
		txtNumberLabsDone.setColumns(10);
		
		JButton btnApplyChanges = new JButton("Apply");
		btnApplyChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnApplyChanges.setBounds(49, 187, 100, 25);
		frame.getContentPane().add(btnApplyChanges);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(161, 187, 94, 25);
		frame.getContentPane().add(btnCancel);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(305, 187, 114, 25);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(305, 224, 114, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(305, 261, 114, 25);
		frame.getContentPane().add(btnCreate);
		
		JButton btnPrevious = new JButton("<<");
		btnPrevious.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrevious.setBounds(49, 261, 70, 25);
		frame.getContentPane().add(btnPrevious);
		
		JButton btnNext = new JButton(">>");
		btnNext.setFont(new Font("Dialog", Font.BOLD, 13));
		btnNext.setBounds(185, 261, 70, 25);
		frame.getContentPane().add(btnNext);
	}
}
