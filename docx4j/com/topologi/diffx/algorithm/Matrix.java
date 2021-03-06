package com.topologi.diffx.algorithm;

/* ============================================================================
 * ARTISTIC LICENCE
 * 
 * Preamble
 * 
 * The intent of this document is to state the conditions under which a Package
 * may be copied, such that the Copyright Holder maintains some semblance of 
 * artistic control over the development of the package, while giving the users
 * of the package the right to use and distribute the Package in a more-or-less
 * customary fashion, plus the right to make reasonable modifications.
 *
 * Definitions:
 *  - "Package" refers to the collection of files distributed by the Copyright 
 *    Holder, and derivatives of that collection of files created through 
 *    textual modification.
 *  - "Standard Version" refers to such a Package if it has not been modified, 
 *    or has been modified in accordance with the wishes of the Copyright 
 *    Holder.
 *  - "Copyright Holder" is whoever is named in the copyright or copyrights 
 *    for the package.
 *  - "You" is you, if you're thinking about copying or distributing this 
 *    Package.
 *  - "Reasonable copying fee" is whatever you can justify on the basis of 
 *    media cost, duplication charges, time of people involved, and so on. 
 *    (You will not be required to justify it to the Copyright Holder, but only 
 *    to the computing community at large as a market that must bear the fee.)
 *  - "Freely Available" means that no fee is charged for the item itself, 
 *    though there may be fees involved in handling the item. It also means 
 *    that recipients of the item may redistribute it under the same conditions
 *    they received it.
 *
 * 1. You may make and give away verbatim copies of the source form of the 
 *    Standard Version of this Package without restriction, provided that you 
 *    duplicate all of the original copyright notices and associated 
 *    disclaimers.
 *
 * 2. You may apply bug fixes, portability fixes and other modifications 
 *    derived from the Public Domain or from the Copyright Holder. A Package 
 *    modified in such a way shall still be considered the Standard Version.
 *
 * 3. You may otherwise modify your copy of this Package in any way, provided 
 *    that you insert a prominent notice in each changed file stating how and 
 *    when you changed that file, and provided that you do at least ONE of the 
 *    following:
 * 
 *    a) place your modifications in the Public Domain or otherwise make them 
 *       Freely Available, such as by posting said modifications to Usenet or 
 *       an equivalent medium, or placing the modifications on a major archive 
 *       site such as ftp.uu.net, or by allowing the Copyright Holder to 
 *       include your modifications in the Standard Version of the Package.
 * 
 *    b) use the modified Package only within your corporation or organization.
 *
 *    c) rename any non-standard executables so the names do not conflict with 
 *       standard executables, which must also be provided, and provide a 
 *       separate manual page for each non-standard executable that clearly 
 *       documents how it differs from the Standard Version.
 * 
 *    d) make other distribution arrangements with the Copyright Holder.
 *
 * 4. You may distribute the programs of this Package in object code or 
 *    executable form, provided that you do at least ONE of the following:
 * 
 *    a) distribute a Standard Version of the executables and library files, 
 *       together with instructions (in the manual page or equivalent) on where
 *       to get the Standard Version.
 *
 *    b) accompany the distribution with the machine-readable source of the 
 *       Package with your modifications.
 * 
 *    c) accompany any non-standard executables with their corresponding 
 *       Standard Version executables, giving the non-standard executables 
 *       non-standard names, and clearly documenting the differences in manual 
 *       pages (or equivalent), together with instructions on where to get 
 *       the Standard Version.
 *
 *    d) make other distribution arrangements with the Copyright Holder.
 *
 * 5. You may charge a reasonable copying fee for any distribution of this 
 *    Package. You may charge any fee you choose for support of this Package. 
 *    You may not charge a fee for this Package itself. However, you may 
 *    distribute this Package in aggregate with other (possibly commercial) 
 *    programs as part of a larger (possibly commercial) software distribution 
 *    provided that you do not advertise this Package as a product of your own.
 *
 * 6. The scripts and library files supplied as input to or produced as output 
 *    from the programs of this Package do not automatically fall under the 
 *    copyright of this Package, but belong to whomever generated them, and may
 *    be sold commercially, and may be aggregated with this Package.
 *
 * 7. C or perl subroutines supplied by you and linked into this Package shall 
 *    not be considered part of this Package.
 *
 * 8. The name of the Copyright Holder may not be used to endorse or promote 
 *    products derived from this software without specific prior written 
 *    permission.
 * 
 * 9. THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED 
 *    WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF 
 *    MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * ============================================================================
 */

/**
 * A matrix for the computation of the Diff-X path.
 * 
 * <p>This interface is intended to provide methods for initialising and accessing
 * the values of the matrix regardless of the storage method used.
 * 
 * <p>Implementations could use binary matrices, I/O objects, etc...
 * 
 * @author Christophe Lauret (Allette Systems)
 * @version 7 April 2005
 */
interface Matrix {

  /**
   * Create a matrix of the given width and height.
   * 
   * @param width  The number of columns.
   * @param height The number of rows.
   */
  void setup(int width, int height);

// default access -----------------------------------------------------------------------

  /**
   * Sets the value of the matrix at the given position. 
   * 
   * @param i The column index.
   * @param j The row index.
   * 
   * @param x The value to set.
   */
  void set(int i, int j, int x);

  /**
   * Returns the value at the given position. 
   * 
   * @param i The column index.
   * @param j The row index.
   * 
   * @return The value at the given position.
   */
  int get(int i, int j);

// to fill up the matrix ----------------------------------------------------------------

  /**
   * Increment the path.
   * 
   * <p>value(i, j) := value(i+1, j+1) + n
   * 
   * @param i The column index.
   * @param j The row index.

   * @param n The increment number.  
   */
  void incrementPathBy(int i, int j, int n);

  /**
   * Increment by the maximum path.
   * 
   * <p>value(i, j) := max( value(i+1, j) , value(i, j+1) ) 
   * 
   * @param i The column index.
   * @param j The row index.
   */
  void incrementByMaxPath(int i, int j);

// to determine the path ----------------------------------------------------------------

  /**
   * Returns <code>true</code> we should move on the X direction. 
   * 
   * <p>if value(i+1, j) > value(i, j+1)
   * 
   * @param i The column index.
   * @param j The row index.
   * 
   * @return <code>true</code> to move to i+1;
   *         <code>false</code> otherwise.
   */
  boolean isGreaterX(int i, int j);

  /**
   * Returns <code>true</code> we should move on the X direction. 
   * 
   * <p>if value(i+1, j) &lt; value(i, j+1)
   * 
   * @param i The column index.
   * @param j The row index.
   * 
   * @return <code>true</code> to move to j+1;
   *         <code>false</code> otherwise.
   */
  boolean isGreaterY(int i, int j);

  /**
   * Returns <code>true</code> we moving on the X direction is
   * equivalent to moving on the Y direction. 
   * 
   * <p>if value(i+1, j) == value(i, j+1)
   * 
   * @param i The column index.
   * @param j The row index.
   * 
   * @return <code>true</code> if it is the same;
   *         <code>false</code> otherwise.
   */
  boolean isSameXY(int i, int j);

  /**
   * Releases all the resources used only by this matrix object.
   * 
   * <p>This class is not usable, until after invoking this method, unless
   * it is setup again. 
   */
  void release();

}
