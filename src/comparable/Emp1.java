package comparable;

public class Emp1 implements Comparable<Emp1>
{
	String ename;
	int id;
	Emp1(String ename,int id)
	{
		this.id=id;
		this.ename=ename;
	}
	public int compareTo(Emp1 e) 
	{
		
			return ename.compareTo(e.ename);
	}

}
