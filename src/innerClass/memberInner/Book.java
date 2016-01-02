/**
 * Project: OCAOCP
 * File: Book.java
 * Date: Dec 26, 2015
 * Time: 1:08:19 PM
 */

package innerClass.memberInner;

/**
 * @author Alexander Zhong, A00972836
 *
 */

public class Book {
	private int pageNumber = 5;
	private class BookReader {
		private int pageNumber = 5;
		public int getPage(){
			//final int pageNumber = 50;
			return pageNumber;
			//return Book.this.pageNumber;
		}
	}

}
