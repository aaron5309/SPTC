package sptc;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

/**
 * Contains all the GUI panel information for teh DAS2 evaluation. Is called from the Das2frame class.
 * @author Aaron
 *
 */
public class Das2panel extends JPanel {

	protected static Das2frame das2fr;
	//verbal section
	protected int dasworddeftscore;
	
	protected int dasverbsimtscore;
	
	protected int dasverbalsscore;
	
	//nonverbal reasoning
	protected int dasmattscore;
	
	protected int dassquentscore;
	
	protected int dasnonverbalsscore;
	
	//spatial
	protected int dasrecdestscore;
	
	protected int daspatcontscore;
	
	protected int dasspatialsscore;
	
	//GCA
	protected int dasgcasscore;
	
	
	protected Das2 das2scores;
	private JTextField txtwd;
	private JTextField txtvs;
	private JTextField txtmat;
	private JTextField txtsqr;
	private JTextField txtrd;
	private JTextField txtpc;
	private JTextField txtverbal;
	private JTextField txtnr;
	private JTextField txtspatial;
	private JTextField txtgca;
	
	/**
	 * Panel constructor. Calls setuppanel method which contains panel information.
	 */
	public Das2panel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 140, 127, 135, 0, 0};
		gridBagLayout.rowHeights = new int[]{48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("DAS2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCategory = new GridBagConstraints();
		gbc_lblCategory.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategory.gridx = 1;
		gbc_lblCategory.gridy = 1;
		add(lblCategory, gbc_lblCategory);
		
		JLabel lblTscore = new JLabel("TScore");
		lblTscore.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTscore = new GridBagConstraints();
		gbc_lblTscore.insets = new Insets(0, 0, 5, 5);
		gbc_lblTscore.gridx = 3;
		gbc_lblTscore.gridy = 1;
		add(lblTscore, gbc_lblTscore);
		
		JLabel lblWord = new JLabel("Word Definitions");
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblWord = new GridBagConstraints();
		gbc_lblWord.insets = new Insets(0, 0, 5, 5);
		gbc_lblWord.gridx = 1;
		gbc_lblWord.gridy = 2;
		add(lblWord, gbc_lblWord);
		
		txtwd = new JTextField();
		txtwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtwd = new GridBagConstraints();
		gbc_txtwd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtwd.insets = new Insets(0, 0, 5, 5);
		gbc_txtwd.gridx = 3;
		gbc_txtwd.gridy = 2;
		add(txtwd, gbc_txtwd);
		txtwd.setColumns(10);
		
		JLabel lblVerbalSimilarities = new JLabel("Verbal Similarities");
		lblVerbalSimilarities.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblVerbalSimilarities = new GridBagConstraints();
		gbc_lblVerbalSimilarities.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerbalSimilarities.gridx = 1;
		gbc_lblVerbalSimilarities.gridy = 3;
		add(lblVerbalSimilarities, gbc_lblVerbalSimilarities);
		
		txtvs = new JTextField();
		txtvs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtvs = new GridBagConstraints();
		gbc_txtvs.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtvs.insets = new Insets(0, 0, 5, 5);
		gbc_txtvs.gridx = 3;
		gbc_txtvs.gridy = 3;
		add(txtvs, gbc_txtvs);
		txtvs.setColumns(10);
		
		JLabel lblVerbal = new JLabel("Verbal");
		lblVerbal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblVerbal = new GridBagConstraints();
		gbc_lblVerbal.insets = new Insets(0, 0, 5, 5);
		gbc_lblVerbal.gridx = 1;
		gbc_lblVerbal.gridy = 4;
		add(lblVerbal, gbc_lblVerbal);
		
		JLabel lblStandardScore = new JLabel("Standard Score");
		GridBagConstraints gbc_lblStandardScore = new GridBagConstraints();
		gbc_lblStandardScore.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandardScore.gridx = 2;
		gbc_lblStandardScore.gridy = 4;
		add(lblStandardScore, gbc_lblStandardScore);
		
		txtverbal = new JTextField();
		txtverbal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtverbal = new GridBagConstraints();
		gbc_txtverbal.insets = new Insets(0, 0, 5, 5);
		gbc_txtverbal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtverbal.gridx = 3;
		gbc_txtverbal.gridy = 4;
		add(txtverbal, gbc_txtverbal);
		txtverbal.setColumns(10);
		
		JLabel lblMatrices = new JLabel("Matrices");
		lblMatrices.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMatrices = new GridBagConstraints();
		gbc_lblMatrices.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatrices.gridx = 1;
		gbc_lblMatrices.gridy = 5;
		add(lblMatrices, gbc_lblMatrices);
		
		txtmat = new JTextField();
		txtmat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtmat = new GridBagConstraints();
		gbc_txtmat.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtmat.insets = new Insets(0, 0, 5, 5);
		gbc_txtmat.gridx = 3;
		gbc_txtmat.gridy = 5;
		add(txtmat, gbc_txtmat);
		txtmat.setColumns(10);
		
		JLabel lblSequential = new JLabel("Seq/Quant Reasoning");
		lblSequential.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSequential = new GridBagConstraints();
		gbc_lblSequential.insets = new Insets(0, 0, 5, 5);
		gbc_lblSequential.gridx = 1;
		gbc_lblSequential.gridy = 6;
		add(lblSequential, gbc_lblSequential);
		
		txtsqr = new JTextField();
		txtsqr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtsqr = new GridBagConstraints();
		gbc_txtsqr.insets = new Insets(0, 0, 5, 5);
		gbc_txtsqr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtsqr.gridx = 3;
		gbc_txtsqr.gridy = 6;
		add(txtsqr, gbc_txtsqr);
		txtsqr.setColumns(10);
		
		JLabel lblNonverbalReasoning = new JLabel("Nonverbal Reasoning");
		lblNonverbalReasoning.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNonverbalReasoning = new GridBagConstraints();
		gbc_lblNonverbalReasoning.insets = new Insets(0, 0, 5, 5);
		gbc_lblNonverbalReasoning.gridx = 1;
		gbc_lblNonverbalReasoning.gridy = 7;
		add(lblNonverbalReasoning, gbc_lblNonverbalReasoning);
		
		JLabel lblStandardScore_1 = new JLabel("Standard Score");
		GridBagConstraints gbc_lblStandardScore_1 = new GridBagConstraints();
		gbc_lblStandardScore_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandardScore_1.gridx = 2;
		gbc_lblStandardScore_1.gridy = 7;
		add(lblStandardScore_1, gbc_lblStandardScore_1);
		
		txtnr = new JTextField();
		txtnr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtnr = new GridBagConstraints();
		gbc_txtnr.insets = new Insets(0, 0, 5, 5);
		gbc_txtnr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtnr.gridx = 3;
		gbc_txtnr.gridy = 7;
		add(txtnr, gbc_txtnr);
		txtnr.setColumns(10);
		
		JLabel lblRecallOfDesign = new JLabel("Recall of Design");
		lblRecallOfDesign.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblRecallOfDesign = new GridBagConstraints();
		gbc_lblRecallOfDesign.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecallOfDesign.gridx = 1;
		gbc_lblRecallOfDesign.gridy = 8;
		add(lblRecallOfDesign, gbc_lblRecallOfDesign);
		
		txtrd = new JTextField();
		txtrd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtrd = new GridBagConstraints();
		gbc_txtrd.insets = new Insets(0, 0, 5, 5);
		gbc_txtrd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrd.gridx = 3;
		gbc_txtrd.gridy = 8;
		add(txtrd, gbc_txtrd);
		txtrd.setColumns(10);
		
		JLabel lblPatternConstruction = new JLabel("Pattern Construction");
		lblPatternConstruction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPatternConstruction = new GridBagConstraints();
		gbc_lblPatternConstruction.insets = new Insets(0, 0, 5, 5);
		gbc_lblPatternConstruction.gridx = 1;
		gbc_lblPatternConstruction.gridy = 9;
		add(lblPatternConstruction, gbc_lblPatternConstruction);
		
		txtpc = new JTextField();
		txtpc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtpc = new GridBagConstraints();
		gbc_txtpc.insets = new Insets(0, 0, 5, 5);
		gbc_txtpc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpc.gridx = 3;
		gbc_txtpc.gridy = 9;
		add(txtpc, gbc_txtpc);
		txtpc.setColumns(10);
		
		JLabel lblSpatial = new JLabel("Spatial");
		lblSpatial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSpatial = new GridBagConstraints();
		gbc_lblSpatial.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpatial.gridx = 1;
		gbc_lblSpatial.gridy = 10;
		add(lblSpatial, gbc_lblSpatial);
		
		JLabel lblStandardScore_2 = new JLabel("Standard Score");
		GridBagConstraints gbc_lblStandardScore_2 = new GridBagConstraints();
		gbc_lblStandardScore_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandardScore_2.gridx = 2;
		gbc_lblStandardScore_2.gridy = 10;
		add(lblStandardScore_2, gbc_lblStandardScore_2);
		
		txtspatial = new JTextField();
		txtspatial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtspatial = new GridBagConstraints();
		gbc_txtspatial.insets = new Insets(0, 0, 5, 5);
		gbc_txtspatial.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtspatial.gridx = 3;
		gbc_txtspatial.gridy = 10;
		add(txtspatial, gbc_txtspatial);
		txtspatial.setColumns(10);
		
		JLabel lblGca = new JLabel("GCA");
		lblGca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblGca = new GridBagConstraints();
		gbc_lblGca.insets = new Insets(0, 0, 5, 5);
		gbc_lblGca.gridx = 1;
		gbc_lblGca.gridy = 11;
		add(lblGca, gbc_lblGca);
		
		JLabel lblStandardScore_3 = new JLabel("Standard Score");
		GridBagConstraints gbc_lblStandardScore_3 = new GridBagConstraints();
		gbc_lblStandardScore_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandardScore_3.gridx = 2;
		gbc_lblStandardScore_3.gridy = 11;
		add(lblStandardScore_3, gbc_lblStandardScore_3);
		
		txtgca = new JTextField();
		txtgca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_txtgca = new GridBagConstraints();
		gbc_txtgca.insets = new Insets(0, 0, 5, 5);
		gbc_txtgca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtgca.gridx = 3;
		gbc_txtgca.gridy = 11;
		add(txtgca, gbc_txtgca);
		txtgca.setColumns(10);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnContinue = new GridBagConstraints();
		gbc_btnContinue.insets = new Insets(0, 0, 0, 5);
		gbc_btnContinue.gridx = 3;
		gbc_btnContinue.gridy = 12;
		add(btnContinue, gbc_btnContinue);
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dasworddeftscore = Integer.parseInt(txtwd.getText());
				dasverbsimtscore = Integer.parseInt(txtvs.getText());
				dasverbalsscore = Integer.parseInt(txtverbal.getText());
				dasmattscore = Integer.parseInt(txtmat.getText());
				dassquentscore = Integer.parseInt(txtsqr.getText());
				dasnonverbalsscore = Integer.parseInt(txtnr.getText());
				dasrecdestscore = Integer.parseInt(txtrd.getText());
				daspatcontscore = Integer.parseInt(txtpc.getText());
				dasspatialsscore = Integer.parseInt(txtspatial.getText());
				dasgcasscore = Integer.parseInt(txtgca.getText());
				das2scores = new Das2(dasworddeftscore, dasverbsimtscore, dasverbalsscore, dasmattscore, 
						dassquentscore, dasnonverbalsscore,	dasrecdestscore, daspatcontscore,
						dasspatialsscore, dasgcasscore);
				
			}
		});
		
		setuppanel();
		
	}
	
	/**
	 * Contains all the information to setup the GUI panel. Also contains an anonymous inner class connected
	 * to the button which parses the user's input into integers and creates a DAS2 object.
	 */
	private void setuppanel(){
		
	}
}
