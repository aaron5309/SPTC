package sptc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

/**
 * This class creates the require JPanel for the test list GUI frame. Extends JPanel 
 * and implements ItmeListener
 * @author Aaron
 *
 */
public class TestListPanel extends JPanel implements ItemListener{

	protected JCheckBox chckbxDAS2;
	protected JCheckBox chckbxKtea2;
	protected JCheckBox chckbxWisc;
	protected JCheckBox chckbxBASC2;
	protected static boolean das2yn = false;
	protected static boolean ktea2yn = false;
	protected static boolean wiscyn = false;
	protected static boolean basc2yn = false;
	protected boolean isCurrent = false;
	protected JFrame nextframe;
	
	/**
	 * Constructor method. Calls setuppanel.
	 */
	public TestListPanel(){

		setuppanel();
	}
	
	/**
	 * This method contains all the required information for the test list GUI JPanel.
	 */
	private void setuppanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 81, 39, 131, 39, 0, 0};
		gridBagLayout.rowHeights = new int[]{37, 35, 35, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTestList = new JLabel("Test List");
		lblTestList.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblTestList = new GridBagConstraints();
		gbc_lblTestList.anchor = GridBagConstraints.NORTH;
		gbc_lblTestList.insets = new Insets(0, 0, 5, 5);
		gbc_lblTestList.gridx = 3;
		gbc_lblTestList.gridy = 0;
		add(lblTestList, gbc_lblTestList);
		
		chckbxDAS2 = new JCheckBox("DAS2");
		chckbxDAS2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_chckbxDAS2 = new GridBagConstraints();
		gbc_chckbxDAS2.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxDAS2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDAS2.gridx = 1;
		gbc_chckbxDAS2.gridy = 1;
		add(chckbxDAS2, gbc_chckbxDAS2);
		chckbxDAS2.addItemListener(this);
		
		chckbxKtea2 = new JCheckBox("KTEA2");
		chckbxKtea2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_chckbxKtea2 = new GridBagConstraints();
		gbc_chckbxKtea2.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxKtea2.gridx = 5;
		gbc_chckbxKtea2.gridy = 1;
		add(chckbxKtea2, gbc_chckbxKtea2);
		chckbxKtea2.addItemListener(this);
		
		chckbxWisc = new JCheckBox("WISC");
		chckbxWisc.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_chckbxWisc = new GridBagConstraints();
		gbc_chckbxWisc.anchor = GridBagConstraints.NORTHWEST;
		gbc_chckbxWisc.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWisc.gridx = 1;
		gbc_chckbxWisc.gridy = 2;
		add(chckbxWisc, gbc_chckbxWisc);
		chckbxWisc.addItemListener(this);
		
		chckbxBASC2 = new JCheckBox("BASC2");
		chckbxBASC2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_chckbxBASC2 = new GridBagConstraints();
		gbc_chckbxBASC2.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxBASC2.gridx = 5;
		gbc_chckbxBASC2.gridy = 2;
		add(chckbxBASC2, gbc_chckbxBASC2);
		chckbxBASC2.addItemListener(this);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnContinue = new GridBagConstraints();
		gbc_btnContinue.gridx = 5;
		gbc_btnContinue.gridy = 7;
		add(btnContinue, gbc_btnContinue);
		btnContinue.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (das2yn = true){
					nextframe = new Das2frame();
					HistoryPanel.testframe.setVisible(false);
				}
				else if (ktea2yn = true){
					nextframe = new Ktea2frame();
					HistoryPanel.testframe.setVisible(false);
				}
				/*else if (wiscyn = true){
					nextframe = new Wiscframe();
					HistoryPanel.testframe.setVisible(false);
				}
				else if (basc2yn = true){
					nextframe = new Basc2frame();
					HistoryPanel.testframe.setVisible(false);
				}
				*/else {
					
				}
			}
			
		});
	}
	
	/**
	 * Sets the boolean options to true for the evaluations selected by the user.
	 */
	public void itemStateChanged(ItemEvent e){
		if (e.getItemSelectable() == chckbxDAS2){
			das2yn = true;
		}
		if (e.getItemSelectable() == chckbxKtea2){
			ktea2yn = true;
		}
		if (e.getItemSelectable() == chckbxWisc){
			wiscyn = true;
		}
		if (e.getItemSelectable() == chckbxBASC2){
			basc2yn = true;
		}
	}
	
}
