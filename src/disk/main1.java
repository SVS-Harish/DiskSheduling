package disk;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class main1 {

	private JFrame frame;
	private JTextField head;
	private JTextField num;
	private JTextField start;
	private JTextField end;
	private JTextField res;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main1 window = new main1();
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
	public main1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 582, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("FCFS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fcfs F = new fcfs();
				int hd,st,ed,n,k=0;
				hd=Integer.parseInt(head.getText());
				st=Integer.parseInt(start.getText());
				ed=Integer.parseInt(end.getText());
				n=Integer.parseInt(num.getText());
				k=F.result(hd,n,st,ed);
				res.setText(String.valueOf(k));
				
	//			G.data = F.graph(n);
				
			}
		});
		btnNewButton.setBounds(43, 32, 122, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSstf = new JButton("SSTF");
		btnSstf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sstf SS = new sstf();
				int hd,st,ed,n,k=0;
				hd=Integer.parseInt(head.getText());
				st=Integer.parseInt(start.getText());
				ed=Integer.parseInt(end.getText());
				n=Integer.parseInt(num.getText());
				k=SS.result(hd,n,st,ed);
				res.setText(String.valueOf(k));

				
			}
		});
		btnSstf.setBounds(215, 32, 122, 35);
		frame.getContentPane().add(btnSstf);
		
		JButton btnLook = new JButton("LOOK");
		btnLook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				look L = new look();
				int hd,st,ed,n,k=0;
				hd=Integer.parseInt(head.getText());
				st=Integer.parseInt(start.getText());
				ed=Integer.parseInt(end.getText());
				n=Integer.parseInt(num.getText());
				k=L.output(hd,n,st,ed);
				res.setText(String.valueOf(k));
				
			}
		});
		btnLook.setBounds(401, 32, 122, 35);
		frame.getContentPane().add(btnLook);
		
		JButton btnScan = new JButton("SCAN");
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				scan Sn = new scan();
				int hd,st,ed,n,k=0;
				hd=Integer.parseInt(head.getText());
				st=Integer.parseInt(start.getText());
				ed=Integer.parseInt(end.getText());
				n=Integer.parseInt(num.getText());
				k=Sn.output(hd,n,st,ed);
				res.setText(String.valueOf(k));	
				
			}
		});
		btnScan.setBounds(43, 277, 122, 35);
		frame.getContentPane().add(btnScan);
		
		JButton btnCscan = new JButton("CSCAN");
		btnCscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cscan CS = new cscan();
				int hd,st,ed,n,k=0;
				hd=Integer.parseInt(head.getText());
				st=Integer.parseInt(start.getText());
				ed=Integer.parseInt(end.getText());
				n=Integer.parseInt(num.getText());
				k=CS.output(hd,n,st,ed);
				res.setText(String.valueOf(k));	
				
			}
		});
		btnCscan.setBounds(215, 277, 122, 35);
		frame.getContentPane().add(btnCscan);
		
		JButton btnClook = new JButton("CLOOK");
		btnClook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clook CL = new clook();
				int hd,st,ed,n,k=0;
				hd=Integer.parseInt(head.getText());
				st=Integer.parseInt(start.getText());
				ed=Integer.parseInt(end.getText());
				n=Integer.parseInt(num.getText());
				k=CL.result(hd,n,st,ed);
				res.setText(String.valueOf(k));	
				
				
			}
		});
		btnClook.setBounds(401, 277, 122, 35);
		frame.getContentPane().add(btnClook);
		
		head = new JTextField();
		head.setBounds(43, 126, 122, 28);
		frame.getContentPane().add(head);
		head.setColumns(10);
		
		num = new JTextField();
		num.setColumns(10);
		num.setBounds(215, 126, 122, 28);
		frame.getContentPane().add(num);
		
		start = new JTextField();
		start.setColumns(10);
		start.setBounds(43, 208, 122, 28);
		frame.getContentPane().add(start);
		
		end = new JTextField();
		end.setColumns(10);
		end.setBounds(215, 208, 122, 28);
		frame.getContentPane().add(end);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(401, 162, 122, 28);
		frame.getContentPane().add(res);
		
		JLabel lblNewLabel = new JLabel("Head");
		lblNewLabel.setBounds(43, 94, 122, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNew = new JLabel("Num Sectors");
		lblNew.setBounds(215, 94, 122, 21);
		frame.getContentPane().add(lblNew);
		
		JLabel lblNewLabel_1 = new JLabel(" Lower Bound");
		lblNewLabel_1.setBounds(43, 176, 122, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Upper Bound");
		lblNewLabel_2.setBounds(215, 176, 122, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Seek Time");
		lblNewLabel_3.setBounds(401, 112, 122, 28);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
