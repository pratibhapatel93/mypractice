class swaparray {

         static void swaparray(int a[]){
		 for (int i=0;i<a.length;++i)
	        {
		System.out.print(a[i]+" ");	 
		}
	 }		 
		 
   

	public static void main(String args[]){
	  
	      int a[]= new int[5];
	      a[0]=10;
	     //System.out.println(swaparray(a[i]));
	      a[1]=10;
	      a[2]=10;
	      a[3]=10;
	      a[4]=10;
	      swaparray(a);
	}
}
