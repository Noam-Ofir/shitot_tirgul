/**
 * 
 * @author classroom
 *
 */
public class SharedData 
{
    /** array is the input array */ 
	private int [] array;
	/** winArray is a boolean array */
	private boolean [] winArray;
	/** flag boolean is the flag for success or failure array */
	private boolean flag;
	/** b is the shared value */
	private final int b;
	
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
