import java.util.Arrays;

public class Sequence 
{
	private int[] values;
	
	public Sequence(int size) 
	{ 
		values = new int[size]; 
	}
	
	public void set(int i, int n) 
	{ 
		values[i] = n; 
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sequence other = (Sequence) obj;
        if (!Arrays.equals(values, other.values))
            return false;
        return true;
    }
}

