class EvenOdd{
	public static void main(String args[]){
		int a[] = {2,4,6,3,5,7};
		for(int i=0;i<6;i++){
			if(a[i]%2==0){
				System.out.println(a[i]+" "+"is a even number");
			}else{
				System.out.println(a[i]+" "+"is a odd number");
			}
		}
	}
}