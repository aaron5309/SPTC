package sptc;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

import org.docx4j.openpackaging.exceptions.Docx4JException;

/**
 * This class is designed to handle all requirements for the DAS2 (Differential Abilities Scales version 2.0)
 *  psychological test. Includes variable control, database storage, and template manipulation.
 * 
 * @author Aaron
 *
 */
public class Das2 extends GenTest {

	private Student current = DocHandler.getStudent();
	private String filename = DocHandler.getStudentFile();
	private String das2template = System.getProperty("user.dir") + "/templates/das.docx";
	protected JFrame nextframe;
	
	//verbal section
		protected int dasworddeftscore;
		protected double dasworddefpercentile;
		protected String dasworddefclass;
		protected int dasverbsimtscore;
		protected double dasverbsimpercentile;
		protected String dasverbsimclass;
		protected int dasverbalsscore;
		protected double dasverbalpercentile;
		protected String dasverbalclass;
		//nonverbal reasoning
		protected int dasmattscore;
		protected double dasmatpercentile;
		protected String dasmatclass;
		protected int dassquentscore;
		protected double dassquenpercentile;
		protected String dassquenclass;
		protected int dasnonverbalsscore;
		protected double dasnonverbalpercentile;
		protected String dasnonverbalclass;
		//spatial
		protected int dasrecdestscore;
		protected double dasrecdespercentile;
		protected String dasrecdesclass;
		protected int daspatcontscore;
		protected double daspatconpercentile;
		protected String daspatconclass;
		protected int dasspatialsscore;
		protected double dasspatialpercentile;
		protected String dasspatialclass;
		//GCA
		protected int dasgcasscore;
		protected double dasgcapercentile;
		protected String dasgcaclass;
	
	/**
	 * No-arg constructor.
	 */
	public Das2(){
		
	}
	/**
	 * Constructor for DAS2 from the information provided through the DAS2 JPanel.
	 * Designed to take the inserted scores and create both the associated percentiles and classifications.
	 * Then calls the document handler from gentest to add the DAS2 template to the current student document.
	 * @param a		Word Definition T score
	 * @param b		Verbal Similarities T score
	 * @param b1	Verbal Composite score
	 * @param c		Matrices T score
	 * @param d		Sequential and Quantitative Reasoning T score
	 * @param d1	Non-verbal Composite score
	 * @param e		Recall of Design T score
	 * @param f		Pattern Construction T score
	 * @param g		Spatial Composite Score
	 * @param h		General Conceptual Ability score
	 */
	public Das2(int a, int b, int b1, int c, int d, int d1, int e, int f, int g, int h){
		dasworddeftscore = a;
		dasverbsimtscore = b;
		dasverbalsscore = b1;
		dasmattscore = c;
		dassquentscore = d;
		dasnonverbalsscore = d1;
		dasrecdestscore = e;
		daspatcontscore = f;
		dasspatialsscore = g;
		dasgcasscore = h;
		//create percentiles
		dasworddefpercentile = tscoretopercentile(dasworddeftscore);
		dasverbsimpercentile = tscoretopercentile(dasverbsimtscore);
		dasverbalpercentile = standardscorepercentile(dasverbalsscore);
		dasmatpercentile = tscoretopercentile(dasmattscore);
		dassquenpercentile = tscoretopercentile(dassquentscore);
		dasnonverbalpercentile = standardscorepercentile(dasnonverbalsscore);
		dasrecdespercentile = tscoretopercentile(dasrecdestscore);
		daspatconpercentile = tscoretopercentile(daspatcontscore);
		dasspatialpercentile = standardscorepercentile(dasspatialsscore);
		dasgcapercentile = standardscorepercentile(dasgcasscore);
		//get classifications
		dasworddefclass = classification(dasworddefpercentile);
		dasverbsimclass = classification(dasverbsimpercentile);
		dasverbalclass = classification(dasverbalpercentile);
		dasmatclass = classification(dasmatpercentile);
		dassquenclass = classification(dassquenpercentile);
		dasnonverbalclass = classification(dasnonverbalpercentile);
		dasrecdesclass = classification(dasrecdespercentile);
		daspatconclass = classification(daspatconpercentile);
		dasspatialclass = classification(dasspatialpercentile);
		dasgcaclass = classification(dasgcapercentile);
	
		try {
			DocHandler.modDoc(current, filename, das2template);
		} catch (FileNotFoundException e1) {
			System.out.println("File Not Found");
			e1.printStackTrace();
		} catch (Docx4JException e1) {
			System.out.println("Docx4J problem");
			e1.printStackTrace();
		}
		nexttest();
	}
	
	/**
	 * Moves from the DAS2 to the next selected test.
	 */
	private void nexttest(){
		if (TestListPanel.ktea2yn = true){
		nextframe = new Ktea2frame();
		Das2panel.das2fr.setVisible(false);
		}
		/*else if (wiscyn = true){
		nextframe = new Wiscframe();
		Das2panel.das2fr.setVisible(false);
		}
		else if (basc2yn = true){
		nextframe = new Basc2frame();
		Das2panel.das2fr.setVisible(false);
		}
		else {
		
		}*/
		
	}
	
	
}
