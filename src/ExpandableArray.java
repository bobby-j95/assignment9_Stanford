import java.lang.reflect.Array;

//Created By: Robert Johns
/**
 * This class provides methods for working with an array that expands to include
 * any positive index value supplied by the caller.
 */
public class ExpandableArray {
	Object[] array;
	/**
	* Creates a new expandable array with no elements.
	*/
	public ExpandableArray() {
		//array = new Object();
		array = 0;
	}

	/**
	* Sets the element at the given index position to the specified.
	* value. If the internal array is not large enough to contain that
	* element, the implementation expands the array to make room.
	*/

	public void set(int index, Object value) {
		Object[] temp = new Object[index];
		int i = 0;
		for (Object x : array) {
			if (x != null) {
				temp[i] = x;
			} else {
				temp[i] = null;
			}
		}
		temp[index] = value;
		array = temp;
	}

	/**
	* Returns the element at the specified index position, or null if
	* no such element exists. Note that this method never throws an
	* out-of-bounds exception; if the index is outside the bounds of
	* the array, the return value is simply null.
	*/

	public Object get(int index) {
		if (array.length < index) {
			return null;
		} else if (array[index].equals(null)){
			return null;
		} else {
			return array[index];
		}
	}
}