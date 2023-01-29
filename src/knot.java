import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.Choice;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;

public class knot extends JFrame implements ActionListener {

	private JPanel contentPane;
	private int winwidth = 1800;
	private int winheight = 800;
	private int width = winwidth;
	private int height = winheight;
	private JPanel parent;
	private JTabbedPane panel1;
	private JPanel panel1a;
	private JPanel panel1b;
	private JPanel panel1c;
	private JPanel panel1d;
	private JPanel panel1e;
	private JTabbedPane panel2;
	private JPanel panel2a;
	private JTabbedPane panel3;
	private JPanel panel3a;
	private JPanel panel3b;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel subpane1;
	private JPanel subpane2;
	private JLabel title;
	private int Buy[];
	
	private JButton product1;
	private JButton product2;
	private JButton product3;
	private JButton delete;
	private JButton total;
	private ButtonGroup productgroup;
	
	JPanel mainPanel = new JPanel();
	private JButton btnNewButton;
	private SpringLayout sl_panel1a;
	private JRadioButton put;
	private JRadioButton out;
	private ButtonGroup membergroup;
	
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_20;
	private JButton btnNewButton_21;
	private JButton btnNewButton_22;
	private JButton btnNewButton_23;
	private JButton btnNewButton_24;
	private JButton btnNewButton_25;
	private JButton btnNewButton_26;
	private JButton btnNewButton_27;
	private JButton btnNewButton_28;
	private JButton btnNewButton_29;
	private JButton btnNewButton_30;
	private JButton btnNewButton_31;
	private JButton btnNewButton_32;
	private JButton btnNewButton_33;
	private JButton btnNewButton_34;
	private JButton btnNewButton_35;
	private JButton btnNewButton_36;
	private JButton btnNewButton_37;
	private JButton btnNewButton_38;
	private JButton btnNewButton_39;
	private JButton btnNewButton_40;
	private JButton btnNewButton_41;
	private JButton btnNewButton_42;
	private JButton btnNewButton_43;
	private JButton btnNewButton_44;
	private JButton btnNewButton_45;
	private JButton btnNewButton_46;
	private JButton btnNewButton_47;
	private JButton btnNewButton_48;
	private JButton btnNewButton_49;
	private JButton btnNewButton_50;
	private GraphicsDevice gDevice;
	
	private JLabel num[];
	private JTextArea text;
	private JScrollPane scroll;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					knot frame = new knot();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void buildPanel()
	{	
		if(winheight < 700)
		{
			double k = 700 - height;
			k=(k/1000)-0.05;
			System.out.print(k);
			height = (int) Math.round(height*(1-k));
		}
		title = new JLabel("Restaurants ");
		title.setForeground(new Color(153, 0, 0));
		title.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		mainPanel.setLayout(new BorderLayout());
		getContentPane().add(mainPanel);
		
		itemTabPanel1();
		itemTabPanel2();
		itemTabPanel3();

		JTabbedPane tabPane = new JTabbedPane();
		tabPane.setBorder(new TitledBorder(new CompoundBorder(new LineBorder(new Color(160, 160, 160)), new EmptyBorder(2, 2, 2, 2)), "Restaurants ", TitledBorder.TRAILING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		tabPane.addTab("FOODS",panel1);
		tabPane.addTab("WATER", panel2);
		tabPane.addTab("DESSERTS", panel3);
		
		mainPanel.add(tabPane, BorderLayout.CENTER);
		
		//Text
		subpane1 = new JPanel();
		subpane2 = new JPanel();
		panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		subpane2.setLayout(new BorderLayout());
		
		delete = new JButton("Delete Previous");
		delete.addActionListener(this);
		
		text = new JTextArea();
		scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        
        subpane1.add(delete);
        subpane2.add(scroll, BorderLayout.CENTER);
        
        
        panel4.add(subpane1, BorderLayout.SOUTH);
		panel4.add(subpane2, BorderLayout.CENTER);
		
		//total
		panel5 = new JPanel();
		membergroup = new ButtonGroup();
		panel5.setBackground(Color.black);
		
		total = new JButton("total");
		total.setForeground(new Color(204, 0, 0));
		total.setBackground(new Color(204, 204, 204));
		put = new JRadioButton("ADD");
		put.setFont(new Font("Tahoma", Font.PLAIN, 12));
		put.setForeground(new Color(204, 0, 0));
		put.setBackground(Color.BLACK);
		out = new JRadioButton("Delete");
		out.setFont(new Font("Tahoma", Font.PLAIN, 12));
		out.setForeground(new Color(204, 0, 0));
		out.setBackground(new Color(0, 0, 0));
		
		put.setActionCommand("put");
		out.setActionCommand("Not put");
		
		total.addActionListener(this);
		put.addActionListener(this);
		out.addActionListener(this);
		
		membergroup.add(put);
		membergroup.add(out);
		
		panel5.add(put);
		panel5.add(out);
		panel5.add(total);
		
		put.doClick();
	}
	private void itemTabPanel3() {
		panel3 = new JTabbedPane();
		itemTabPanel3a();
		itemTabPanel3b();
		panel3.addTab("page 1",panel3a);
		panel3.addTab("page 2",panel3b);
	}
	private void itemTabPanel3b() {
		panel3a = new JPanel();
		panel3a.setLayout(null);
		
		btnNewButton_37 = new JButton("37");
		btnNewButton_37.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\dessert\\37.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_37.setIcon(av1);
		btnNewButton_37.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_37.addActionListener(this);
		JLabel lblNewLabel_19 = new JLabel("Thai Iced Dessert");
		lblNewLabel_19.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_19);
		JLabel lblNewLabel_20 = new JLabel("39 Bath");
		lblNewLabel_20.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_20);
		num[37] = new JLabel("Number : "+Buy[37]);
		num[37].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[37]);
		panel3a.add(btnNewButton_37);
		
		btnNewButton_38 = new JButton("38");
		btnNewButton_38.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\38.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_38.setIcon(av1);
		btnNewButton_38.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_38.addActionListener(this);
		JLabel lblNewLabel_18 = new JLabel("Cheesecake");
		lblNewLabel_18.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_18);
		JLabel lblNewLabel_17 = new JLabel("89 Bath");
		lblNewLabel_17.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_17);
		num[38] = new JLabel("Number : "+Buy[38]);
		num[38].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[38]);
		panel3a.add(btnNewButton_38);
		
		btnNewButton_39 = new JButton("39");
		btnNewButton_39.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\39.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_39.setIcon(av1);
		btnNewButton_39.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_39.addActionListener(this);
		JLabel lblNewLabel_15 = new JLabel("Donus");
		lblNewLabel_15.setBounds((int) (width*0.78), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_15);
		JLabel lblNewLabel_16 = new JLabel("39 Bath");
		lblNewLabel_16.setBounds((int) (width*0.87), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_16);
		num[39] = new JLabel("Number : "+Buy[39]);
		num[39].setBounds((int) (width*0.925), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[39]);
		panel3a.add(btnNewButton_39);
		
		btnNewButton_40 = new JButton("40");
		btnNewButton_40.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\40.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_40.setIcon(av1);
		btnNewButton_40.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_40.addActionListener(this);
		JLabel lblNewLabel_14 = new JLabel("Matcha Daifuku");
		lblNewLabel_14.setBounds((int) (width*0.36), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_14);
		JLabel lblNewLabel_13 = new JLabel("79 Bath");
		lblNewLabel_13.setBounds((int) (width*0.45), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_13);
		num[40] = new JLabel("Number : "+Buy[40]);
		num[40].setBounds((int) (width*0.505), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[40]);
		panel3a.add(btnNewButton_40);
		
		btnNewButton_41 = new JButton("41");
		btnNewButton_41.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\41.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_41.setIcon(av1);
		btnNewButton_41.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_41.addActionListener(this);
		JLabel lblNewLabel_12 = new JLabel("Daifuku");
		lblNewLabel_12.setBounds((int) (width*0.57), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_12);
		JLabel lblNewLabel_11 = new JLabel("79 Bath");
		lblNewLabel_11.setBounds((int) (width*0.66), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_11);
		num[41] = new JLabel("Number : "+Buy[41]);
		num[41].setBounds((int) (width*0.715), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[41]);
		panel3a.add(btnNewButton_41);
		
		btnNewButton_42 = new JButton("42");
		btnNewButton_42.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\42.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_42.setIcon(av1);
		btnNewButton_42.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_42.addActionListener(this);
		JLabel lblNewLabel_10 = new JLabel("Brownie");
		lblNewLabel_10.setBounds((int) (width*0.78), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_10);
		JLabel lblNewLabel_9 = new JLabel("59 Bath");
		lblNewLabel_9.setBounds((int) (width*0.87), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_9);
		num[42] = new JLabel("Number : "+Buy[42]);
		num[42].setBounds((int) (width*0.925), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[42]);
		panel3a.add(btnNewButton_42);
		
		btnNewButton_43 = new JButton("43");
		btnNewButton_43.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\43.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_43.setIcon(av1);
		btnNewButton_43.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_43.addActionListener(this);
		JLabel lblNewLabel_7 = new JLabel("Sweet waterchestnuts");
		lblNewLabel_7.setBounds((int) (width*0.36), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_7);
		JLabel lblNewLabel_8 = new JLabel("39 Bath");
		lblNewLabel_8.setBounds((int) (width*0.45), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_8);
		num[43] = new JLabel("Number : "+Buy[43]);
		num[43].setBounds((int) (width*0.505), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[43]);
		panel3a.add(btnNewButton_43);
		
		btnNewButton_44 = new JButton("44");
		btnNewButton_44.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\46.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_44.setIcon(av1);
		btnNewButton_44.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_44.addActionListener(this);
		JLabel lblNewLabel_5 = new JLabel("Deletable imttation fruits");
		lblNewLabel_5.setBounds((int) (width*0.57), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("39 Bath");
		lblNewLabel_6.setBounds((int) (width*0.66), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_6);
		num[44] = new JLabel("Number : "+Buy[44]);
		num[44].setBounds((int) (width*0.715), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[44]);
		panel3a.add(btnNewButton_44);
		
		btnNewButton_45 = new JButton("45");
		btnNewButton_45.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\45.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_45.setIcon(av1);
		btnNewButton_45.setBounds((int)Math.round(width*0.77), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_45.addActionListener(this);
		JLabel lblNewLabel_3 = new JLabel("Pancake");
		lblNewLabel_3.setBounds((int) (width*0.78), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("69 Bath");
		lblNewLabel_4.setBounds((int) (width*0.87), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_4);
		num[45] = new JLabel("Number : "+Buy[45]);
		num[45].setBounds((int) (width*0.925), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[45]);
		panel3a.add(btnNewButton_45);
		
		btnNewButton_46 = new JButton("46");
		btnNewButton_46.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\44.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_46.setIcon(av1);
		btnNewButton_46.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_46.addActionListener(this);
		JLabel lblNewLabel_1 = new JLabel("Moon cake");
		lblNewLabel_1.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel3a.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("69 Bath");
		lblNewLabel_2.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(lblNewLabel_2);
		num[46] = new JLabel("Number : "+Buy[46]);
		num[46].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel3a.add(num[46]);
		panel3a.add(btnNewButton_46);
	}
	private void itemTabPanel3a() {
		panel3b = new JPanel();
		panel3b.setLayout(null);
		
		btnNewButton_47 = new JButton("47");
		btnNewButton_47.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\dessert\\47.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_47.setIcon(av1);
		btnNewButton_47.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_47.addActionListener(this);
		JLabel lblNewLabel_7 = new JLabel("Ice cream");
		lblNewLabel_7.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel3b.add(lblNewLabel_7);
		JLabel lblNewLabel_8 = new JLabel("49 Bath");
		lblNewLabel_8.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(lblNewLabel_8);
		num[47] = new JLabel("Number : "+Buy[47]);
		num[47].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(num[47]);
		panel3b.add(btnNewButton_47);
		
		btnNewButton_48 = new JButton("48");
		btnNewButton_48.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\48.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_48.setIcon(av1);
		btnNewButton_48.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_48.addActionListener(this);
		JLabel lblNewLabel_5 = new JLabel("Chinese bun");
		lblNewLabel_5.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel3b.add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("30 Bath");
		lblNewLabel_6.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(lblNewLabel_6);
		num[48] = new JLabel("Number : "+Buy[48]);
		num[48].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(num[48]);
		panel3b.add(btnNewButton_48);
		
		btnNewButton_49 = new JButton("49");
		btnNewButton_49.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\49.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_49.setIcon(av1);
		btnNewButton_49.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_49.addActionListener(this);
		JLabel lblNewLabel_3 = new JLabel("Dumpling");
		lblNewLabel_3.setBounds((int) (width*0.78), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel3b.add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("45 Bath");
		lblNewLabel_4.setBounds((int) (width*0.87), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(lblNewLabel_4);
		num[49] = new JLabel("Number : "+Buy[49]);
		num[49].setBounds((int) (width*0.925), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(num[49]);
		panel3b.add(btnNewButton_49);
		
		btnNewButton_50 = new JButton("50");
		btnNewButton_50.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\dessert\\50.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_50.setIcon(av1);
		btnNewButton_50.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_50.addActionListener(this);
		JLabel lblNewLabel_1 = new JLabel("Croissant");
		lblNewLabel_1.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel3b.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("55 Bath");
		lblNewLabel_2.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(lblNewLabel_2);
		num[50] = new JLabel("Number : "+Buy[50]);
		num[50].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel3b.add(num[50]);
		panel3b.add(btnNewButton_50);
	}
	private void itemTabPanel2() {
		panel2 = new JTabbedPane();
		itemTabPanel2a();
		panel2.addTab("page 1",panel2a);
	}
	private void itemTabPanel2a() {
		panel2a = new JPanel();
		panel2a.setLayout(null);
		
		btnNewButton_27 = new JButton("27");
		btnNewButton_27.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\drink\\27.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_27.setIcon(av1);
		btnNewButton_27.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_27.addActionListener(this);
		JLabel lblNewLabel_19 = new JLabel("Pepsi 600 ML.");
		lblNewLabel_19.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_19);
		JLabel lblNewLabel_20 = new JLabel("20 Bath");
		lblNewLabel_20.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_20);
		num[27] = new JLabel("Number : "+Buy[27]);
		num[27].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[27]);
		panel2a.add(btnNewButton_27);
		
		btnNewButton_28 = new JButton("28");
		btnNewButton_28.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\28.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_28.setIcon(av1);
		btnNewButton_28.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_28.addActionListener(this);
		JLabel lblNewLabel_18 = new JLabel("Pepsi 1.95 L.");
		lblNewLabel_18.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_18);
		JLabel lblNewLabel_17 = new JLabel("40 Bath");
		lblNewLabel_17.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_17);
		num[28] = new JLabel("Number : "+Buy[28]);
		num[28].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[28]);
		panel2a.add(btnNewButton_28);
		
		btnNewButton_29 = new JButton("29");
		btnNewButton_29.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\29.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_29.setIcon(av1);
		btnNewButton_29.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_29.addActionListener(this);
		JLabel lblNewLabel_16 = new JLabel("Orange Juice");
		lblNewLabel_16.setBounds((int) (width*0.78), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_16);
		JLabel lblNewLabel_15 = new JLabel("20");
		lblNewLabel_15.setBounds((int) (width*0.87), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_15);
		num[29] = new JLabel("Number : "+Buy[29]);
		num[29].setBounds((int) (width*0.925), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[29]);
		panel2a.add(btnNewButton_29);
		
		btnNewButton_30 = new JButton("30");
		btnNewButton_30.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\30.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_30.setIcon(av1);
		btnNewButton_30.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_30.addActionListener(this);
		JLabel lblNewLabel_14 = new JLabel("Thai Tea");
		lblNewLabel_14.setBounds((int) (width*0.36), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_14);
		JLabel lblNewLabel_13 = new JLabel("45 Bath");
		lblNewLabel_13.setBounds((int) (width*0.45), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_13);
		num[30] = new JLabel("Number : "+Buy[30]);
		num[30].setBounds((int) (width*0.505), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[30]);
		panel2a.add(btnNewButton_30);
		
		btnNewButton_31 = new JButton("31");
		btnNewButton_31.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\31.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_31.setIcon(av1);
		btnNewButton_31.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_31.addActionListener(this);
		JLabel lblNewLabel_12 = new JLabel("Crystal 600 ML.");
		lblNewLabel_12.setBounds((int) (width*0.57), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_12);
		JLabel lblNewLabel_11 = new JLabel("15 Bath");
		lblNewLabel_11.setBounds((int) (width*0.66), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_11);
		num[31] = new JLabel("Number : "+Buy[31]);
		num[31].setBounds((int) (width*0.715), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[31]);
		panel2a.add(btnNewButton_31);
		
		btnNewButton_32 = new JButton("32");
		btnNewButton_32.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\32.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_32.setIcon(av1);
		btnNewButton_32.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_32.addActionListener(this);
		JLabel lblNewLabel_10 = new JLabel("Bubble Milk Tea");
		lblNewLabel_10.setBounds((int) (width*0.78), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_10);
		JLabel lblNewLabel_9 = new JLabel("50 Bath");
		lblNewLabel_9.setBounds((int) (width*0.87), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_9);
		num[32] = new JLabel("Number : "+Buy[32]);
		num[32].setBounds((int) (width*0.925), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[32]);
		panel2a.add(btnNewButton_32);
		
		btnNewButton_33 = new JButton("33");
		btnNewButton_33.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\33.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_33.setIcon(av1);
		btnNewButton_33.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_33.addActionListener(this);
		JLabel lblNewLabel_7 = new JLabel("Green Tea");
		lblNewLabel_7.setBounds((int) (width*0.36), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_7);
		JLabel lblNewLabel_8 = new JLabel("45 Bath");
		lblNewLabel_8.setBounds((int) (width*0.45), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_8);
		num[33] = new JLabel("Number : "+Buy[33]);
		num[33].setBounds((int) (width*0.505), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[33]);
		panel2a.add(btnNewButton_33);
		
		btnNewButton_34 = new JButton("34");
		btnNewButton_34.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\34.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_34.setIcon(av1);
		btnNewButton_34.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_34.addActionListener(this);
		JLabel lblNewLabel_5 = new JLabel("Coca Cola 600 ML.");
		lblNewLabel_5.setBounds((int) (width*0.57), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("20 Bath");
		lblNewLabel_6.setBounds((int) (width*0.66), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_6);
		num[34] = new JLabel("Number : "+Buy[34]);
		num[34].setBounds((int) (width*0.715), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[34]);
		panel2a.add(btnNewButton_34);
		
		btnNewButton_35 = new JButton("35");
		btnNewButton_35.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\35.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_35.setIcon(av1);
		btnNewButton_35.setBounds((int)Math.round(width*0.77), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_35.addActionListener(this);
		JLabel lblNewLabel_3 = new JLabel("Coca Cola 1.5 L.");
		lblNewLabel_3.setBounds((int) (width*0.78), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("40 bath");
		lblNewLabel_4.setBounds((int) (width*0.87), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_4);
		num[35] = new JLabel("Number : "+Buy[35]);
		num[35].setBounds((int) (width*0.925), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[35]);
		panel2a.add(btnNewButton_35);
		
		btnNewButton_36 = new JButton("36");
		btnNewButton_36.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\drink\\36.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_36.setIcon(av1);
		btnNewButton_36.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_36.addActionListener(this);
		JLabel lblNewLabel_1 = new JLabel("Tea");
		lblNewLabel_1.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel2a.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("20 Bath");
		lblNewLabel_2.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(lblNewLabel_2);
		num[36] = new JLabel("Number : "+Buy[36]);
		num[36].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel2a.add(num[36]);
		panel2a.add(btnNewButton_36);
		
	}
	private void itemTabPanel1() {
		panel1 = new JTabbedPane();
		panel1.setBackground(new Color(255, 255, 255));
		itemTabPanel1a();
		itemTabPanel1b();
		itemTabPanel1c();
		itemTabPanel1d();
		panel1.addTab("page 1",panel1a);
		
		panel1.addTab("page 2",panel1b);
		panel1.addTab("one Dish",panel1c);
		panel1.addTab("Rice",panel1d);
	}

	private void itemTabPanel1d() {
		panel1d = new JPanel();
		panel1d.setLayout(null);
		
		btnNewButton_24 = new JButton("24");
		btnNewButton_24.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\main\\23.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_24.setIcon(av1);
		btnNewButton_24.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_24.addActionListener(this);
		JLabel lblNewLabel_18 = new JLabel("cooked rice");
		lblNewLabel_18.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1d.add(lblNewLabel_18);
		JLabel lblNewLabel_19 = new JLabel("15 Bath");
		lblNewLabel_19.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1d.add(lblNewLabel_19);
		num[24] = new JLabel("Number : "+Buy[24]);
		num[24].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1d.add(num[24]);
		panel1d.add(btnNewButton_24);
		
		btnNewButton_25 = new JButton("25");
		btnNewButton_25.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\25.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_25.setIcon(av1);
		btnNewButton_25.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_25.addActionListener(this);
		JLabel lblNewLabel_16 = new JLabel("Sticky rice");
		lblNewLabel_16.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1d.add(lblNewLabel_16);
		JLabel lblNewLabel_17 = new JLabel("15 Bath");
		lblNewLabel_17.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1d.add(lblNewLabel_17);
		num[25] = new JLabel("Number : "+Buy[25]);
		num[25].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1d.add(num[25]);
		panel1d.add(btnNewButton_25);
		
		btnNewButton_26 = new JButton("26");
		btnNewButton_26.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\26.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_26.setIcon(av1);
		btnNewButton_26.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_26.addActionListener(this);
		JLabel lblNewLabel = new JLabel("Fried rice");
		lblNewLabel.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel1d.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("30 Bath");
		lblNewLabel_1.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1d.add(lblNewLabel_1);
		num[26] = new JLabel("Number : "+Buy[26]);
		num[26].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1d.add(num[26]);
		panel1d.add(btnNewButton_26);
	}

	private void itemTabPanel1b() {
		panel1b = new JPanel();
		panel1b.setLayout(null);
		
		btnNewButton_11 = new JButton("11");
		btnNewButton_11.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\main\\11.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_11.setIcon(av1);
		btnNewButton_11.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_11.addActionListener(this);
		JLabel lblNewLabel_18 = new JLabel("Papaya Salad");
		lblNewLabel_18.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_18);
		JLabel lblNewLabel_19 = new JLabel("55 Bath");
		lblNewLabel_19.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_19);
		num[11] = new JLabel("Number : "+Buy[11]);
		num[11].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[11]);
		panel1b.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("12");
		btnNewButton_12.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\12.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_12.setIcon(av1);
		btnNewButton_12.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_12.addActionListener(this);
		JLabel lblNewLabel_16 = new JLabel("Stir-fried pock Thigh with Red Curry");
		lblNewLabel_16.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_16);
		JLabel lblNewLabel_17 = new JLabel("50 Bath");
		lblNewLabel_17.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_17);
		num[12] = new JLabel("Number : "+Buy[12]);
		num[12].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[12]);
		panel1b.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("13");
		btnNewButton_13.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\13.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_13.setIcon(av1);
		btnNewButton_13.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_13.addActionListener(this);
		JLabel lblNewLabel_14 = new JLabel("Green Curry With Chicken");
		lblNewLabel_14.setBounds((int) (width*0.78), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_14);
		JLabel lblNewLabel_15 = new JLabel("80 Bath");
		lblNewLabel_15.setBounds((int) (width*0.87), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_15);
		num[13] = new JLabel("Number : "+Buy[13]);
		num[13].setBounds((int) (width*0.925), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[13]);
		panel1b.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("14");
		btnNewButton_14.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\14.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_14.setIcon(av1);
		btnNewButton_14.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_14.addActionListener(this);
		JLabel lblNewLabel_12 = new JLabel("fried prawn balls");
		lblNewLabel_12.setBounds((int) (width*0.36), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_12);
		JLabel lblNewLabel_13 = new JLabel("79 Bath");
		lblNewLabel_13.setBounds((int) (width*0.45), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_13);
		num[14] = new JLabel("Number : "+Buy[14]);
		num[14].setBounds((int) (width*0.505), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[14]);
		panel1b.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("15");
		btnNewButton_15.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\15.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_15.setIcon(av1);
		btnNewButton_15.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_15.addActionListener(this);
		JLabel lblNewLabel_10 = new JLabel("Shrimp potted with vermicelli");
		lblNewLabel_10.setBounds((int) (width*0.57), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_10);
		JLabel lblNewLabel_11 = new JLabel("79 Bath");
		lblNewLabel_11.setBounds((int) (width*0.66), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_11);
		num[15] = new JLabel("Number : "+Buy[15]);
		num[15].setBounds((int) (width*0.715), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[15]);
		panel1b.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("16");
		btnNewButton_16.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\16.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_16.setIcon(av1);
		btnNewButton_16.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_16.addActionListener(this);
		JLabel lblNewLabel_8 = new JLabel("Steak chicken");
		lblNewLabel_8.setBounds((int) (width*0.78), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("89 Bath");
		lblNewLabel_9.setBounds((int) (width*0.87), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_9);
		num[16] = new JLabel("Number : "+Buy[16]);
		num[16].setBounds((int) (width*0.925), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[16]);
		panel1b.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("17");
		btnNewButton_17.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\17.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_17.setIcon(av1);
		btnNewButton_17.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_17.addActionListener(this);
		JLabel lblNewLabel_6 = new JLabel("Fried Seafood with Curry Powder");
		lblNewLabel_6.setBounds((int) (width*0.36), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_6);
		JLabel lblNewLabel_7 = new JLabel("      150 Bath");
		lblNewLabel_7.setBounds((int) (width*0.45), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_7);
		num[17] = new JLabel("Number : "+Buy[17]);
		num[17].setBounds((int) (width*0.505), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[17]);
		panel1b.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("18");
		btnNewButton_18.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\18.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_18.setIcon(av1);
		btnNewButton_18.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_18.addActionListener(this);
		JLabel lblNewLabel_4 = new JLabel("steak fish");
		lblNewLabel_4.setBounds((int) (width*0.57), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("89 Bath");
		lblNewLabel_5.setBounds((int) (width*0.66), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_5);
		num[18] = new JLabel("Number : "+Buy[18]);
		num[18].setBounds((int) (width*0.715), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[18]);
		panel1b.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("19");
		btnNewButton_19.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\19.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_19.setIcon(av1);
		btnNewButton_19.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_19.addActionListener(this);
		JLabel lblNewLabel = new JLabel("Omelet");
		lblNewLabel.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel1b.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("65 Bath");
		lblNewLabel_1.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(lblNewLabel_1);
		num[19] = new JLabel("Number : "+Buy[19]);
		num[19].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1b.add(num[19]);
		panel1b.add(btnNewButton_19);
	}
	private void itemTabPanel1c() {
		panel1c = new JPanel();
		panel1c.setLayout(null);
		
		btnNewButton_20 = new JButton("20");
		btnNewButton_20.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\main\\20.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_20.setIcon(av1);
		btnNewButton_20.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_20.addActionListener(this);
		JLabel lblNewLabel_18 = new JLabel("Pork fried rice");
		lblNewLabel_18.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1c.add(lblNewLabel_18);
		JLabel lblNewLabel_19 = new JLabel("59 Bath");
		lblNewLabel_19.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(lblNewLabel_19);
		num[20] = new JLabel("Number : "+Buy[20]);
		num[20].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(num[20]);
		panel1c.add(btnNewButton_20);
		
		btnNewButton_21 = new JButton("21");
		btnNewButton_21.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\21.png");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_21.setIcon(av1);
		btnNewButton_21.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_21.addActionListener(this);
		JLabel lblNewLabel_16 = new JLabel(" fried Chicken with Basil");
		lblNewLabel_16.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1c.add(lblNewLabel_16);
		JLabel lblNewLabel_17 = new JLabel("59 Bath");
		lblNewLabel_17.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(lblNewLabel_17);
		num[21] = new JLabel("Number : "+Buy[21]);
		num[21].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(num[21]);
		panel1c.add(btnNewButton_21);
		
		btnNewButton_22 = new JButton("22");
		btnNewButton_22.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\22.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_22.setIcon(av1);
		btnNewButton_22.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_22.addActionListener(this);
		JLabel lblNewLabel_14 = new JLabel("Chicken fried rice");
		lblNewLabel_14.setBounds((int) (width*0.78), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1c.add(lblNewLabel_14);
		JLabel lblNewLabel_15 = new JLabel("59 Bath");
		lblNewLabel_15.setBounds((int) (width*0.87), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(lblNewLabel_15);
		num[22] = new JLabel("Number : "+Buy[22]);
		num[22].setBounds((int) (width*0.925), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(num[22]);
		panel1c.add(btnNewButton_22);
		
		btnNewButton_23 = new JButton("23");
		btnNewButton_23.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\24.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_23.setIcon(av1);
		btnNewButton_23.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_23.addActionListener(this);
		JLabel lblNewLabel = new JLabel("Stir- fried Pork with Basil");
		lblNewLabel.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel1c.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("59 Bath");
		lblNewLabel_1.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(lblNewLabel_1);
		num[23] = new JLabel("Number : "+Buy[23]);
		num[23].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1c.add(num[23]);
		panel1c.add(btnNewButton_23);
	}
	private void itemTabPanel1a() {
		panel1a = new JPanel();
		panel1a.setLayout(null);
		
		btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBackground(Color.WHITE);
		ImageIcon av = new ImageIcon("java project\\main\\1.jpg");
		Image a = av.getImage();
		ImageIcon av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_1.setIcon(av1);
		btnNewButton_1.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_1.addActionListener(this);
		JLabel lblNewLabel_18 = new JLabel("Oyster Omelet");
		lblNewLabel_18.setBounds((int) (width*0.36), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_18);
		JLabel lblNewLabel_19 = new JLabel("85 Bath");
		lblNewLabel_19.setBounds((int) (width*0.45), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_19);
		num[1] = new JLabel("Number : "+Buy[1]);
		num[1].setBounds((int) (width*0.505), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[1]);
		panel1a.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\2.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_2.setIcon(av1);
		btnNewButton_2.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_2.addActionListener(this);
		JLabel lblNewLabel_16 = new JLabel("Sukiyaki");
		lblNewLabel_16.setBounds((int) (width*0.57), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_16);
		JLabel lblNewLabel_17 = new JLabel("65 Bath");
		lblNewLabel_17.setBounds((int) (width*0.66), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_17);
		num[2] = new JLabel("Number : "+Buy[2]);
		num[2].setBounds((int) (width*0.715), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[2]);
		panel1a.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\3.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_3.setIcon(av1);
		btnNewButton_3.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.025), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_3.addActionListener(this);
		JLabel lblNewLabel_14 = new JLabel("Pad See Ew");
		lblNewLabel_14.setBounds((int) (width*0.78), (int) (height*0.185), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_14);
		JLabel lblNewLabel_15 = new JLabel("60 Bath");
		lblNewLabel_15.setBounds((int) (width*0.87), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_15);
		num[3] = new JLabel("Number : "+Buy[3]);
		num[3].setBounds((int) (width*0.925), (int) (height*0.185), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[3]);
		panel1a.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\4.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_4.setIcon(av1);
		btnNewButton_4.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_4.addActionListener(this);
		JLabel lblNewLabel_12 = new JLabel("Fried chicken with garlic");
		lblNewLabel_12.setBounds((int) (width*0.36), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_12);
		JLabel lblNewLabel_13 = new JLabel("70 Bath");
		lblNewLabel_13.setBounds((int) (width*0.45), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_13);
		num[4] = new JLabel("Number : "+Buy[4]);
		num[4].setBounds((int) (width*0.505), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[4]);
		panel1a.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\5.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_5.setIcon(av1);
		btnNewButton_5.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_5.addActionListener(this);
		JLabel lblNewLabel_10 = new JLabel("Fried pock with garlic");
		lblNewLabel_10.setBounds((int) (width*0.57), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_10);
		JLabel lblNewLabel_11 = new JLabel("75 Bath");
		lblNewLabel_11.setBounds((int) (width*0.66), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_11);
		num[5] = new JLabel("Number : "+Buy[5]);
		num[5].setBounds((int) (width*0.715), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[5]);
		panel1a.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\6.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_6.setIcon(av1);
		btnNewButton_6.setBounds((int) Math.round(width*0.77), (int) Math.round(height*0.28), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_6.addActionListener(this);
		JLabel lblNewLabel_8 = new JLabel("Tom Yum Goong");
		lblNewLabel_8.setBounds((int) (width*0.78), (int) (height*0.44), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("120 Bath");
		lblNewLabel_9.setBounds((int) (width*0.87), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_9);
		num[6] = new JLabel("Number : "+Buy[6]);
		num[6].setBounds((int) (width*0.925), (int) (height*0.44), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[6]);
		panel1a.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\7.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_7.setIcon(av1);
		btnNewButton_7.setBounds((int) Math.round(width*0.35), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_7.addActionListener(this);
		JLabel lblNewLabel_6 = new JLabel("Fried Fish with Fish Sauce");
		lblNewLabel_6.setBounds((int) (width*0.36), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_6);
		JLabel lblNewLabel_7 = new JLabel("180 Bath");
		lblNewLabel_7.setBounds((int) (width*0.45), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_7);
		num[7] = new JLabel("Number : "+Buy[7]);
		num[7].setBounds((int) (width*0.505), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[7]);
		panel1a.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\8.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_8.setIcon(av1);
		btnNewButton_8.setBounds((int) Math.round(width*0.56), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_8.addActionListener(this);
		JLabel lblNewLabel_4 = new JLabel("Fried pork");
		lblNewLabel_4.setBounds((int) (width*0.57), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("60 Bath");
		lblNewLabel_5.setBounds((int) (width*0.66), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_5);
		num[8] = new JLabel("Number : "+Buy[8]);
		num[8].setBounds((int) (width*0.715), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[8]);
		panel1a.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\9.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2), (int) Math.round(height*0.2), Image.SCALE_FAST));
		btnNewButton_9.setIcon(av1);
		btnNewButton_9.setBounds((int)Math.round(width*0.77), (int) Math.round(height*0.54), (int) Math.round(width*0.19), (int) Math.round(height*0.19));
		btnNewButton_9.addActionListener(this);
		JLabel lblNewLabel_2 = new JLabel("Fried Noodle With Pork");
		lblNewLabel_2.setBounds((int) (width*0.78), (int) (height*0.7), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("75 Bath");
		lblNewLabel_3.setBounds((int) (width*0.87), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_3);
		num[9] = new JLabel("Number : "+Buy[9]);
		num[9].setBounds((int) (width*0.925), (int) (height*0.7), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[9]);
		panel1a.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("10");
		btnNewButton_10.setBackground(Color.WHITE);
		av = new ImageIcon("java project\\main\\10.jpg");
		a = av.getImage();
		av1 = new ImageIcon(a.getScaledInstance((int) Math.round(width*0.2975), (int) Math.round (height*0.61), Image.SCALE_FAST));
		btnNewButton_10.setIcon(av1);
		btnNewButton_10.setBounds((int) (width*0.03), (int) (height*0.05), (int) (width*0.2875), (int) (height*0.6));
		btnNewButton_10.addActionListener(this);
		JLabel lblNewLabel = new JLabel("Pad Thai");
		lblNewLabel.setBounds((int) (width*0.04), (int) (height*0.63), (int) (width*0.1), (int) (height*0.1));
		panel1a.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("60 Bath");
		lblNewLabel_1.setBounds((int) (width*0.2), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(lblNewLabel_1);
		num[10] = new JLabel("Number : "+Buy[10]);
		num[10].setBounds((int) (width*0.28), (int) (height*0.63), (int) (width*0.05), (int) (height*0.1));
		panel1a.add(num[10]);
		panel1a.add(btnNewButton_10);
		
	}
	public void setallbuy() {
		for(int i = 0;i<=50;i++)
		{
			Buy[i] = 0;
		}
	}
	public knot() {
		Buy = new int[51];
		num = new JLabel[51];
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getScreenSize();
		setallbuy();
		getContentPane().setBackground(Color.BLACK);
		setTitle("Restaurant OOP");

		buildPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		getContentPane().add(panel5, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void getScreenSize() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        width = gd.getDisplayMode().getWidth();
        height = gd.getDisplayMode().getHeight();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "total")
		{					
			System.out.println(1);
		}
		else if(!(e.getActionCommand() == "put")&&!(e.getActionCommand() == "Not put"))
		{
			int i =1;
			if(put.isSelected())
			{
				String no  = e.getActionCommand();
				for(i = 1;i<51;i++)
				{
					if(i == Integer.parseInt(no))
					{
						Buy[i] = Buy[i]+1;
						break;
					}
				}
			}
			else if(out.isSelected())
			{
				String no  = e.getActionCommand();
				for(i=1;i<51;i++)
				{
					if(i == Integer.parseInt(no))
					{
						if(Buy[i] >= 1)
						{
							Buy[i] = Buy[i]-1;
						}
						break;
					}
				}
			}
			num[i].setText("Number : "+Buy[i]);
		}
	}
}
