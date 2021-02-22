package kf5012;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarksSystemGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarksSystemGUI frame = new MarksSystemGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MarksSystemGUI() {
		setTitle("Marks Recording System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 823);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFileMenu = new JMenu("File");
		menuBar.add(mnFileMenu);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mnFileMenu.add(mntmLoad);
		
		JMenu mnHelpMenu = new JMenu("Help");
		menuBar.add(mnHelpMenu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel southPannel = new JPanel();
		contentPane.add(southPannel, BorderLayout.SOUTH);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddStudent.setForeground(Color.BLACK);
		btnAddStudent.setBackground(Color.PINK);
		southPannel.add(btnAddStudent);
		
		JButton btnChangeMark = new JButton("Change Mark");
		btnChangeMark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangeMark.setBackground(Color.PINK);
		southPannel.add(btnChangeMark);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteStudent.setBackground(Color.PINK);
		southPannel.add(btnDeleteStudent);
		
		JPanel northPannel = new JPanel();
		contentPane.add(northPannel, BorderLayout.NORTH);
		
		JLabel lblMarksList = new JLabel("List of Marks");
		lblMarksList.setFont(new Font("Tahoma", Font.PLAIN, 30));
		northPannel.add(lblMarksList);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student Name", "Mark"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(452);
		table.getColumnModel().getColumn(1).setPreferredWidth(165);
		scrollPane.setViewportView(table);
	}

}
