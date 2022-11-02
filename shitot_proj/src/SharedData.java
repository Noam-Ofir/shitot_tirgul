/**
 * 
 * @author classroom
 *
 */
public class SharedData 
{
    /** array is the input array */ 
	/**
	 * 
	 */
	private int [] array;
	/** winArray is a boolean array */
	private boolean [] winArray;
	/** flag boolean is the flag for success or failure array */
	private boolean flag;
	/** b is the shared value */
	private final int b;
	
	/** shared data constructor inputs the requested array and selected number
	 * @param array  input array
	 * @param b selected value to find
	 */ 
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/** getWinArray method returns the winning array
	 * @return 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** setWinArray sets the winning array as the input array
	 * @param winArray input winning array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** getArray method returns the input array
	 * @return
	 */
	public int[] getArray() 
	{
		return array;
	}

	/** getB method returns the selected number (b)
	 * @return
	 */
	public int getB() 
	{
		return b;
	}

	/** getFlag method returns the winning flag
	 * @return
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** set flag method sets the flag of the class (boolean value)
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
