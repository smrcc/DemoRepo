package comparable;

public class Emp implements Comparable
{
	String ename;
	int id;
Emp(String ename,int id)
{
	this.id=id;
	this.ename=ename;
}

public int compareTo(Object o) {
	Emp e=(Emp)o;
	if(id==e.id)
	return 0;
	else if(id>e.id)
		return 1;
	else
		return -1;
}
}
