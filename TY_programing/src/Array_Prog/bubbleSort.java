package Array_Prog;

public class bubbleSort {
	public static void main(String[] args) {
		int arr[]={10,20,15,6,8};
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
