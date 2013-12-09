package sptc;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;

/**
 * This class creates the JPanel associated with the KTEA2 evaluaion and frame. Extends JPanel.
 * @author Aaron
 *
 */
public class Ktea2panel extends JPanel {
	private JTextField txtlwrec;
	private JTextField txtrc;
	private JTextField txtreading;
	private JTextField txtrwrflu;
	private JTextField txtdf;
	private JTextField txtrf;
	private JTextField txtlc;
	private JTextField txtoe;
	private JTextField txtol;
	private JTextField txtaf;
	private JTextField txtnf;
	private JTextField txtof;
	private JTextField txtwe;
	private JTextField txtmca;
	private JTextField txtmc;
	private JTextField txtmath;
	private JTextField txtca;
	private JTextField txtspelling;
	private JTextField txtwl;
	
	/**
	 * Constructor. Calls the setuppanel method.
	 */
	public Ktea2panel() {
		setuppanel();
	}

	/**
	 * This method contains all the required information for the KTEA2 panel.
	 */
	private void setuppanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblKtea = new JLabel("KTEA2");
		lblKtea.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblKtea = new GridBagConstraints();
		gbc_lblKtea.insets = new Insets(0, 0, 5, 5);
		gbc_lblKtea.gridx = 1;
		gbc_lblKtea.gridy = 0;
		add(lblKtea, gbc_lblKtea);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblCategory = new GridBagConstraints();
		gbc_lblCategory.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategory.gridx = 0;
		gbc_lblCategory.gridy = 1;
		add(lblCategory, gbc_lblCategory);
		
		JLabel lblStandardScore = new JLabel("Standard Score");
		lblStandardScore.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblStandardScore = new GridBagConstraints();
		gbc_lblStandardScore.insets = new Insets(0, 0, 5, 5);
		gbc_lblStandardScore.gridx = 2;
		gbc_lblStandardScore.gridy = 1;
		add(lblStandardScore, gbc_lblStandardScore);
		
		JLabel lblLetterwordRecognition = new JLabel("Letter/Word Recognition");
		lblLetterwordRecognition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblLetterwordRecognition = new GridBagConstraints();
		gbc_lblLetterwordRecognition.insets = new Insets(0, 0, 5, 5);
		gbc_lblLetterwordRecognition.gridx = 0;
		gbc_lblLetterwordRecognition.gridy = 2;
		add(lblLetterwordRecognition, gbc_lblLetterwordRecognition);
		
		txtlwrec = new JTextField();
		GridBagConstraints gbc_txtlwrec = new GridBagConstraints();
		gbc_txtlwrec.insets = new Insets(0, 0, 5, 5);
		gbc_txtlwrec.anchor = GridBagConstraints.NORTH;
		gbc_txtlwrec.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtlwrec.gridx = 2;
		gbc_txtlwrec.gridy = 2;
		add(txtlwrec, gbc_txtlwrec);
		txtlwrec.setColumns(10);
		
		JLabel lblReadingComprehension = new JLabel("Reading Comprehension");
		lblReadingComprehension.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblReadingComprehension = new GridBagConstraints();
		gbc_lblReadingComprehension.insets = new Insets(0, 0, 5, 5);
		gbc_lblReadingComprehension.gridx = 0;
		gbc_lblReadingComprehension.gridy = 3;
		add(lblReadingComprehension, gbc_lblReadingComprehension);
		
		txtrc = new JTextField();
		GridBagConstraints gbc_txtrc = new GridBagConstraints();
		gbc_txtrc.insets = new Insets(0, 0, 5, 5);
		gbc_txtrc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrc.gridx = 2;
		gbc_txtrc.gridy = 3;
		add(txtrc, gbc_txtrc);
		txtrc.setColumns(10);
		
		JLabel lblReading = new JLabel("Reading");
		lblReading.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblReading = new GridBagConstraints();
		gbc_lblReading.insets = new Insets(0, 0, 5, 5);
		gbc_lblReading.gridx = 0;
		gbc_lblReading.gridy = 4;
		add(lblReading, gbc_lblReading);
		
		txtreading = new JTextField();
		GridBagConstraints gbc_txtreading = new GridBagConstraints();
		gbc_txtreading.insets = new Insets(0, 0, 5, 5);
		gbc_txtreading.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtreading.gridx = 2;
		gbc_txtreading.gridy = 4;
		add(txtreading, gbc_txtreading);
		txtreading.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Word Recognition Fluency");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		add(lblNewLabel, gbc_lblNewLabel);
		
		txtrwrflu = new JTextField();
		GridBagConstraints gbc_txtrwrflu = new GridBagConstraints();
		gbc_txtrwrflu.insets = new Insets(0, 0, 5, 5);
		gbc_txtrwrflu.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrwrflu.gridx = 2;
		gbc_txtrwrflu.gridy = 5;
		add(txtrwrflu, gbc_txtrwrflu);
		txtrwrflu.setColumns(10);
		
		JLabel lblDecodingFluency = new JLabel("Decoding Fluency");
		lblDecodingFluency.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDecodingFluency = new GridBagConstraints();
		gbc_lblDecodingFluency.insets = new Insets(0, 0, 5, 5);
		gbc_lblDecodingFluency.gridx = 0;
		gbc_lblDecodingFluency.gridy = 6;
		add(lblDecodingFluency, gbc_lblDecodingFluency);
		
		txtdf = new JTextField();
		GridBagConstraints gbc_txtdf = new GridBagConstraints();
		gbc_txtdf.insets = new Insets(0, 0, 5, 5);
		gbc_txtdf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtdf.gridx = 2;
		gbc_txtdf.gridy = 6;
		add(txtdf, gbc_txtdf);
		txtdf.setColumns(10);
		
		JLabel lblReadingFluency = new JLabel("Reading Fluency");
		lblReadingFluency.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblReadingFluency = new GridBagConstraints();
		gbc_lblReadingFluency.insets = new Insets(0, 0, 5, 5);
		gbc_lblReadingFluency.gridx = 0;
		gbc_lblReadingFluency.gridy = 7;
		add(lblReadingFluency, gbc_lblReadingFluency);
		
		txtrf = new JTextField();
		GridBagConstraints gbc_txtrf = new GridBagConstraints();
		gbc_txtrf.insets = new Insets(0, 0, 5, 5);
		gbc_txtrf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrf.gridx = 2;
		gbc_txtrf.gridy = 7;
		add(txtrf, gbc_txtrf);
		txtrf.setColumns(10);
		
		JLabel lblListeningComprehension = new JLabel("Listening Comprehension");
		lblListeningComprehension.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblListeningComprehension = new GridBagConstraints();
		gbc_lblListeningComprehension.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeningComprehension.gridx = 0;
		gbc_lblListeningComprehension.gridy = 8;
		add(lblListeningComprehension, gbc_lblListeningComprehension);
		
		txtlc = new JTextField();
		GridBagConstraints gbc_txtlc = new GridBagConstraints();
		gbc_txtlc.insets = new Insets(0, 0, 5, 5);
		gbc_txtlc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtlc.gridx = 2;
		gbc_txtlc.gridy = 8;
		add(txtlc, gbc_txtlc);
		txtlc.setColumns(10);
		
		JLabel lblOralExpression = new JLabel("Oral Expression");
		lblOralExpression.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblOralExpression = new GridBagConstraints();
		gbc_lblOralExpression.insets = new Insets(0, 0, 5, 5);
		gbc_lblOralExpression.gridx = 0;
		gbc_lblOralExpression.gridy = 9;
		add(lblOralExpression, gbc_lblOralExpression);
		
		txtoe = new JTextField();
		GridBagConstraints gbc_txtoe = new GridBagConstraints();
		gbc_txtoe.insets = new Insets(0, 0, 5, 5);
		gbc_txtoe.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtoe.gridx = 2;
		gbc_txtoe.gridy = 9;
		add(txtoe, gbc_txtoe);
		txtoe.setColumns(10);
		
		JLabel lblOralLanguage = new JLabel("Oral Language");
		lblOralLanguage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblOralLanguage = new GridBagConstraints();
		gbc_lblOralLanguage.insets = new Insets(0, 0, 5, 5);
		gbc_lblOralLanguage.gridx = 0;
		gbc_lblOralLanguage.gridy = 10;
		add(lblOralLanguage, gbc_lblOralLanguage);
		
		txtol = new JTextField();
		GridBagConstraints gbc_txtol = new GridBagConstraints();
		gbc_txtol.insets = new Insets(0, 0, 5, 5);
		gbc_txtol.anchor = GridBagConstraints.NORTH;
		gbc_txtol.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtol.gridx = 2;
		gbc_txtol.gridy = 10;
		add(txtol, gbc_txtol);
		txtol.setColumns(10);
		
		JLabel lblAssociationalFluency = new JLabel("Associational Fluency");
		lblAssociationalFluency.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAssociationalFluency = new GridBagConstraints();
		gbc_lblAssociationalFluency.insets = new Insets(0, 0, 5, 5);
		gbc_lblAssociationalFluency.gridx = 0;
		gbc_lblAssociationalFluency.gridy = 11;
		add(lblAssociationalFluency, gbc_lblAssociationalFluency);
		
		txtaf = new JTextField();
		GridBagConstraints gbc_txtaf = new GridBagConstraints();
		gbc_txtaf.insets = new Insets(0, 0, 5, 5);
		gbc_txtaf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtaf.gridx = 2;
		gbc_txtaf.gridy = 11;
		add(txtaf, gbc_txtaf);
		txtaf.setColumns(10);
		
		JLabel lblNamingFacility = new JLabel("Naming Facility");
		lblNamingFacility.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNamingFacility = new GridBagConstraints();
		gbc_lblNamingFacility.insets = new Insets(0, 0, 5, 5);
		gbc_lblNamingFacility.gridx = 0;
		gbc_lblNamingFacility.gridy = 12;
		add(lblNamingFacility, gbc_lblNamingFacility);
		
		txtnf = new JTextField();
		GridBagConstraints gbc_txtnf = new GridBagConstraints();
		gbc_txtnf.insets = new Insets(0, 0, 5, 5);
		gbc_txtnf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtnf.gridx = 2;
		gbc_txtnf.gridy = 12;
		add(txtnf, gbc_txtnf);
		txtnf.setColumns(10);
		
		JLabel lblOralFluency = new JLabel("Oral Fluency");
		lblOralFluency.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblOralFluency = new GridBagConstraints();
		gbc_lblOralFluency.insets = new Insets(0, 0, 5, 5);
		gbc_lblOralFluency.gridx = 0;
		gbc_lblOralFluency.gridy = 13;
		add(lblOralFluency, gbc_lblOralFluency);
		
		txtof = new JTextField();
		GridBagConstraints gbc_txtof = new GridBagConstraints();
		gbc_txtof.insets = new Insets(0, 0, 5, 5);
		gbc_txtof.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtof.gridx = 2;
		gbc_txtof.gridy = 13;
		add(txtof, gbc_txtof);
		txtof.setColumns(10);
		
		JLabel lblWrittenExpression = new JLabel("Written Expression");
		lblWrittenExpression.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblWrittenExpression = new GridBagConstraints();
		gbc_lblWrittenExpression.insets = new Insets(0, 0, 5, 5);
		gbc_lblWrittenExpression.gridx = 0;
		gbc_lblWrittenExpression.gridy = 14;
		add(lblWrittenExpression, gbc_lblWrittenExpression);
		
		txtwe = new JTextField();
		GridBagConstraints gbc_txtwe = new GridBagConstraints();
		gbc_txtwe.insets = new Insets(0, 0, 5, 5);
		gbc_txtwe.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtwe.gridx = 2;
		gbc_txtwe.gridy = 14;
		add(txtwe, gbc_txtwe);
		txtwe.setColumns(10);
		
		JLabel lblSpelling = new JLabel("Spelling");
		lblSpelling.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblSpelling = new GridBagConstraints();
		gbc_lblSpelling.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpelling.gridx = 0;
		gbc_lblSpelling.gridy = 15;
		add(lblSpelling, gbc_lblSpelling);
		
		txtspelling = new JTextField();
		GridBagConstraints gbc_txtspelling = new GridBagConstraints();
		gbc_txtspelling.insets = new Insets(0, 0, 5, 5);
		gbc_txtspelling.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtspelling.gridx = 2;
		gbc_txtspelling.gridy = 15;
		add(txtspelling, gbc_txtspelling);
		txtspelling.setColumns(10);
		
		JLabel lblWrittenLanguage = new JLabel("Written Language");
		lblWrittenLanguage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblWrittenLanguage = new GridBagConstraints();
		gbc_lblWrittenLanguage.insets = new Insets(0, 0, 5, 5);
		gbc_lblWrittenLanguage.gridx = 0;
		gbc_lblWrittenLanguage.gridy = 16;
		add(lblWrittenLanguage, gbc_lblWrittenLanguage);
		
		txtwl = new JTextField();
		GridBagConstraints gbc_txtwl = new GridBagConstraints();
		gbc_txtwl.insets = new Insets(0, 0, 5, 5);
		gbc_txtwl.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtwl.gridx = 2;
		gbc_txtwl.gridy = 16;
		add(txtwl, gbc_txtwl);
		txtwl.setColumns(10);
		
		JLabel lblMathConceptapplication = new JLabel("Math Concept/Application");
		lblMathConceptapplication.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMathConceptapplication = new GridBagConstraints();
		gbc_lblMathConceptapplication.insets = new Insets(0, 0, 5, 5);
		gbc_lblMathConceptapplication.gridx = 0;
		gbc_lblMathConceptapplication.gridy = 17;
		add(lblMathConceptapplication, gbc_lblMathConceptapplication);
		
		txtmca = new JTextField();
		GridBagConstraints gbc_txtmca = new GridBagConstraints();
		gbc_txtmca.insets = new Insets(0, 0, 5, 5);
		gbc_txtmca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtmca.gridx = 2;
		gbc_txtmca.gridy = 17;
		add(txtmca, gbc_txtmca);
		txtmca.setColumns(10);
		
		JLabel lblMathComputation = new JLabel("Math Computation");
		lblMathComputation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMathComputation = new GridBagConstraints();
		gbc_lblMathComputation.insets = new Insets(0, 0, 5, 5);
		gbc_lblMathComputation.gridx = 0;
		gbc_lblMathComputation.gridy = 18;
		add(lblMathComputation, gbc_lblMathComputation);
		
		txtmc = new JTextField();
		GridBagConstraints gbc_txtmc = new GridBagConstraints();
		gbc_txtmc.insets = new Insets(0, 0, 5, 5);
		gbc_txtmc.anchor = GridBagConstraints.NORTH;
		gbc_txtmc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtmc.gridx = 2;
		gbc_txtmc.gridy = 18;
		add(txtmc, gbc_txtmc);
		txtmc.setColumns(10);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMath = new GridBagConstraints();
		gbc_lblMath.insets = new Insets(0, 0, 5, 5);
		gbc_lblMath.gridx = 0;
		gbc_lblMath.gridy = 19;
		add(lblMath, gbc_lblMath);
		
		txtmath = new JTextField();
		GridBagConstraints gbc_txtmath = new GridBagConstraints();
		gbc_txtmath.insets = new Insets(0, 0, 5, 5);
		gbc_txtmath.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtmath.gridx = 2;
		gbc_txtmath.gridy = 19;
		add(txtmath, gbc_txtmath);
		txtmath.setColumns(10);
		
		JLabel lblComprehensiveAcheivement = new JLabel("Comprehensive Acheivement");
		lblComprehensiveAcheivement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblComprehensiveAcheivement = new GridBagConstraints();
		gbc_lblComprehensiveAcheivement.insets = new Insets(0, 0, 0, 5);
		gbc_lblComprehensiveAcheivement.gridx = 0;
		gbc_lblComprehensiveAcheivement.gridy = 20;
		add(lblComprehensiveAcheivement, gbc_lblComprehensiveAcheivement);
		
		txtca = new JTextField();
		GridBagConstraints gbc_txtca = new GridBagConstraints();
		gbc_txtca.insets = new Insets(0, 0, 0, 5);
		gbc_txtca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtca.gridx = 2;
		gbc_txtca.gridy = 20;
		add(txtca, gbc_txtca);
		txtca.setColumns(10);
	}
	
}
