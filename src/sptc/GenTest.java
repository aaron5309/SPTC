/** School Psychology Test Creator
 * 
 */
package sptc;

/** An abstract class designed to include methods that all psychological test use.
 * @author Aaron
 * @version 1.0
 */


public abstract class GenTest {
	int numsubtest = 0;
	double percentile = 0;
	
	/** Creates a percentile from a given standard score.
	 * @param score
	 * @return The percentile for the standard score.
	 */
	public double standardscorepercentile(int score){
		if (score >= 147)
			percentile = 99.9;
		if (score == 146)
			percentile = 99.8;
		if (score == 145)
			percentile = 99.7;
		if (score == 144)
			percentile = 99.6;
		if (score == 143)
			percentile = 99.5;
		if (score == 142)
			percentile = 99.4;
		if (score == 141)
			percentile = 99.3;
		if (score == 140)
			percentile = 99.2;
		if (score == 139)
			percentile = 99.1;
		if (score <= 138 && score >= 133)
			percentile = 99;
		if (score <= 132 && score >= 130)
			percentile = 98;
		if (score == 129 || score == 128)
			percentile = 97;
		if (score == 127 || score == 126)
			percentile = 96;
		if (score == 125 || score == 124)
			percentile = 95;
		if (score == 123)
			percentile = 94;
		if (score == 122)
			percentile = 93;
		if (score == 121)
			percentile = 92;
		if (score == 120)
			percentile = 91;
		if (score == 119)
			percentile = 90;
		if (score == 118)
			percentile = 88;
		if (score == 117)
			percentile = 87;
		if (score == 116)
			percentile = 86;
		if (score == 115)
			percentile = 84;
		if (score == 114)
			percentile = 82;
		if (score == 113)
			percentile = 81;
		if (score == 112)
			percentile = 79;
		if (score == 111)
			percentile = 77;
		if (score == 110)
			percentile = 75;
		if (score == 109)
			percentile = 73;
		if (score == 108)
			percentile = 70;
		if (score == 107)
			percentile = 68;
		if (score == 106)
			percentile = 65;
		if (score == 105)
			percentile = 63;
		if (score == 104)
			percentile = 61;
		if (score == 103)
			percentile = 58;
		if (score == 102)
			percentile = 55;
		if (score == 101)
			percentile = 53;
		if (score == 100)
			percentile = 50;
		if (score == 99)
			percentile = 47;
		if (score == 98)
			percentile = 45;
		if (score == 97)
			percentile = 42;
		if (score == 96)
			percentile = 39;
		if (score == 95)
			percentile = 37;
		if (score == 94)
			percentile = 34;
		if (score == 93)
			percentile = 32;
		if (score == 92)
			percentile = 30;
		if (score == 91)
			percentile = 27;
		if (score == 90)
			percentile = 25;
		if (score == 89)
			percentile = 23;
		if (score == 88)
			percentile = 21;
		if (score == 87)
			percentile = 19;
		if (score == 86)
			percentile = 18;
		if (score == 85)
			percentile = 16;
		if (score == 84)
			percentile = 14;
		if (score == 83)
			percentile = 13;
		if (score == 82)
			percentile = 12;
		if (score == 81)
			percentile = 10;
		if (score == 80)
			percentile = 9;
		if (score == 79)
			percentile = 8;
		if (score == 78)
			percentile = 7;
		if (score == 77)
			percentile = 6;
		if (score == 76 || score == 75)
			percentile = 5;
		if (score == 74 || score == 73)
			percentile = 4;
		if (score == 72 || score == 71)
			percentile = 3;
		if (score <= 70 && score >= 68)
			percentile = 2;
		if (score <= 67 && score >= 62)
			percentile = 1;
		if (score == 61)
			percentile = 0.9;
		if (score == 60)
			percentile = 0.8;
		if (score == 59)
			percentile = 0.7;
		if (score == 58)
			percentile = 0.6;
		if (score == 57)
			percentile = 0.5;
		if (score == 56)
			percentile = 0.4;
		if (score == 55)
			percentile = 0.3;
		if (score == 54)
			percentile = 0.2;
		if (score == 53)
			percentile = 0.1;
		if (score == 52)
			percentile = 0.09;
		if (score == 51)
			percentile = 0.08;
		if (score == 50)
			percentile = 0.07;
		if (score == 49)
			percentile = 0.06;
		if (score == 48)
			percentile = 0.05;
		if (score == 47)
			percentile = 0.04;
		if (score == 46)
			percentile = 0.03;
		if (score == 45)
			percentile = 0.02;
		return percentile;
	}
	
	/**
	 * Returns the String classification word(s) associated with the given percentile.
	 * @param percent
	 * @return String classification word.
	 */
	public String classification(double percent){
		return "almost finished";
	}
	
	/**
	 * Takes a T score and returns the associated percentile.
	 * @param score
	 * @return Percentile related to entered T score.
	 */
	public double tscoretopercentile(int score){
		if (score >= 80)
			percentile = 99.9;
		if (score == 79)
			percentile = 99.6;
		if (score == 78)
			percentile = 99.4;
		if (score == 77)
			percentile = 99.3;
		if (score == 76)
			percentile = 99.1;
		if (score <= 75 && score >=72)
			percentile = 99;
		if (score == 70 || score == 71)
			percentile = 98;
		if (score == 69)
			percentile = 97;
		if (score == 68);
			percentile = 96;
		if (score == 67)
			percentile = 96;
		if (score == 66)
			percentile = 95;
		if (score == 65)
			percentile = 94;
		if (score == 64)
			percentile = 92;
		if (score == 63)
			percentile = 91;
		if (score == 62)
			percentile = 88;
		if (score == 61)
			percentile = 87;
		if (score == 60)
			percentile = 84;
		if (score == 59)
			percentile = 81;
		if (score == 58)
			percentile = 79;
		if (score == 57)
			percentile = 77;
		if (score == 56)
			percentile = 73;
		if (score == 55)
			percentile = 70;
		if (score == 54)
			percentile = 66;
		if (score == 53)
			percentile = 63;
		if (score == 52)
			percentile = 58;
		if (score == 51)
			percentile = 55;
		if (score == 50)
			percentile = 50;
		if (score == 49)
			percentile = 47;
		if (score == 48)
			percentile = 42;
		if (score == 47)
			percentile = 39;
		if (score == 46)
			percentile = 34;
		if (score == 45)
			percentile = 30;
		if (score == 44)
			percentile = 27;
		if (score == 43)
			percentile = 25;
		if (score == 42)
			percentile = 21;
		if (score == 41)
			percentile = 19;
		if (score == 40)
			percentile = 16;
		if (score == 39)
			percentile = 14;
		if (score == 38)
			percentile = 12;
		if (score == 37)
			percentile = 10;
		if (score == 36)
			percentile = 8;
		if (score == 35)
			percentile = 7;
		if (score == 34)
			percentile = 5;
		if (score == 32 || score == 33)
			percentile = 4;
		if (score == 31)
			percentile = 3;
		if (score == 30 || score == 29)
			percentile = 2;
		if (score <= 28 && score >= 25)
			percentile = 1;
		if (score == 24)
			percentile = 0.9;
		if (score == 23)
			percentile = 0.8;
		if (score == 22)
			percentile = 0.6;
		if (score <= 20)
			percentile = 0.1;
		return percentile;
	}
	
	
}
