import java.util.Scanner;

class Array{
           public static void scanArray(int a[]) {
		Scanner sc=new Scanner(System.in);
	 	   for(int i=0;i<a.length;++i)
			  a[i]=sc.nextInt();
			//System.out.println(a[size]);
	   }

	   static void  printArray(int arr[]){
	            System.out.println("array is - ");
		  for(int i=0;i<arr.length;++i)
			  System.out.print(arr[i]+" ");
	   
	   }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();

		int a[]=new int[size];

		scanArray(a);
		printArray(a);


	}

}
