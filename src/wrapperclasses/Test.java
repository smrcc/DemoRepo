package wrapperclasses;

public class Test {

	public static void main(String[] args) {
		
		String str="Hi Sreekanth Hello";
		
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
