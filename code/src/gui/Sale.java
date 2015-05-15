package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JList;

import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JCheckBox;

import java.awt.Scrollbar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Sale extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Sale frame = new Sale();
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
	public Sale() {
		setResizable(false);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent k) {
				
			}
		});
		setTitle("Sale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 300, 344);
		contentPane.add(panel);
		panel.setLayout(null);
		
		searchField = new JTextField();
		searchField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			@Override
			public void keyPressed(KeyEvent k) {
				if (k.getKeyCode()==KeyEvent.VK_ENTER){
					//IMPORTANT 
				
		        }
			}
		});
		searchField.setBounds(10, 39, 193, 23);
		panel.add(searchField);
		searchField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent k) {
				
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(searchField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(new JFrame(), "You must input the name of the item in order to be displayed. ", "Error",
					        JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
		btnSearch.setBounds(206, 38, 84, 24);
		panel.add(btnSearch);
		
		JLabel lblSearchProduct = new JLabel("Search product");
		lblSearchProduct.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSearchProduct.setBounds(10, 11, 156, 23);
		panel.add(lblSearchProduct);
		
		List itemList = new List();
		itemList.setBounds(10, 68, 280, 196);
		panel.add(itemList);
		
		itemList.add("Acidophilus bifidus kompl.caps. N30");
		itemList.add("Acta Visio caps. N30");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		itemList.add("Alyvuogių lapų ekstraktas Swanson 500mg caps. N60");
		
		TextField quantityField = new TextField();
		quantityField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent k) {
				if (k.getKeyCode()==KeyEvent.VK_ENTER){
					//IMPORTANT 
				
		        }
			}
		});
		quantityField.setBounds(82, 322, 105, 22);
		panel.add(quantityField);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantity.setBounds(10, 322, 71, 22);
		panel.add(lblQuantity);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(itemList.getSelectedItems().length==0)
				{
					JOptionPane.showMessageDialog(new JFrame(), "No item were selected. ", "Error",
					        JOptionPane.ERROR_MESSAGE);
				
				}
				else
				if(quantityField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(new JFrame(), "You must input the quantity of the selected item before adding it to the sale. ", "Error",
					        JOptionPane.ERROR_MESSAGE);
				
				}
				
				
			}
		});
		btnAdd.setBounds(185, 321, 89, 23);
		panel.add(btnAdd);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(10, 266, 71, 22);
		panel.add(lblStock);
		
		JLabel lblPriceunit = new JLabel("Price/Unit:");
		lblPriceunit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPriceunit.setBounds(10, 290, 84, 22);
		panel.add(lblPriceunit);
		
		JLabel lblStock_1 = new JLabel("Stock");
		lblStock_1.setBounds(97, 272, 46, 14);
		panel.add(lblStock_1);
		
		JLabel lblPriceunit_1 = new JLabel("Price/Unit");
		lblPriceunit_1.setBounds(97, 296, 69, 14);
		panel.add(lblPriceunit_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(316, 11, 300, 344);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSale = new JLabel("Sale");
		lblSale.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSale.setBounds(10, 11, 156, 23);
		panel_1.add(lblSale);
		
		List saleList = new List();
		saleList.setBounds(10, 40, 280, 220);
		panel_1.add(saleList);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(saleList.getSelectedItems().length==0)
				{
					JOptionPane.showMessageDialog(new JFrame(), "No item were selected. ", "Error",
					        JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
		btnDelete.setBounds(201, 265, 89, 23);
		panel_1.add(btnDelete);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBounds(123, 321, 89, 23);
		panel_1.add(btnFinish);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sale.this.setVisible(false);
			
			}
		});
		btnCancel.setBounds(211, 321, 89, 23);
		panel_1.add(btnCancel);
		
		JLabel lblTotalPrice = new JLabel("Total price:");
		lblTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalPrice.setBounds(10, 266, 89, 22);
		panel_1.add(lblTotalPrice);
		
		JLabel lblPrice = new JLabel("price");
		lblPrice.setBounds(91, 272, 46, 14);
		panel_1.add(lblPrice);
		
		JCheckBox chckbxPaid = new JCheckBox("Paid");
		chckbxPaid.setBounds(226, 295, 64, 23);
		panel_1.add(chckbxPaid);
		}
	}

