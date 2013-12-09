package sptc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.AltChunkType;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;


/**
 * This class is designed to hold all the methods needed to create, modify, and save the document created
 * for this student. This object uses many of the methods from the Docx4j library.
 * 
 * @author Aaron
 *
 */
public class DocHandler{

	private static Student cs = new Student();
	private static String filename;
	private static String studinfodoc = System.getProperty("user.dir") + "/templates/studentinfo.docx";
	
	/**
	 * Creates a docx docmument named lastname, firstname for the provided student information. This document
	 * then gets passed to the moddoc method.
	 * @param current		Current student information.
	 * @throws Docx4JException	required exception from docx4j library.
	 * @throws FileNotFoundException	Exception possible for creating file.
	 */
	public static void createDoc(Student current) throws Docx4JException, FileNotFoundException{
		cs = current;
		WordprocessingMLPackage newdoc = WordprocessingMLPackage.createPackage();
		MainDocumentPart mainpart = newdoc.getMainDocumentPart();
		
		filename = System.getProperty("user.dir") + "/" + cs.getLastname() + ", " + cs.getFirstname() + ".docx";
		newdoc.save(new java.io.File(filename) );
		System.out.println("Saved " + filename);
		
		modDoc(cs, filename, studinfodoc);
	}
	
	/**
	 * Modifies the current student's document based on the passed information from the current evaluation.
	 * @param cs			Current Student information
	 * @param outfile		Current Student's file name
	 * @param newinfo		Current evaluation template that is to be added to the current student file.
	 * @throws Docx4JException	Exception required for the docx4j library.
	 * @throws FileNotFoundException	Required exception incase the file information provided is incorrect.
	 */
	public static void modDoc(Student cs, String outfile, String newinfo) throws Docx4JException, FileNotFoundException{
		
		WordprocessingMLPackage maindoc = WordprocessingMLPackage.load(new File(outfile));
		MainDocumentPart mainpart = maindoc.getMainDocumentPart();
		mainpart.addAltChunk(AltChunkType.WordprocessingML, new FileInputStream(newinfo) );
		maindoc.save(new java.io.File(outfile));
		System.out.println("updated" + outfile);
	}
	
	/**
	 * Get method to return the current student
	 * @return	Current Student object
	 */
	public static Student getStudent(){
		return cs;
	}
	
	/**
	 * Get method for current student's filename (String)
	 * @return Current student's filename (String)
	 */
	public static String getStudentFile(){
		return filename;
	}
}
