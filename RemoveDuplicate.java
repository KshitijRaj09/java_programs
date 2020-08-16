import java.util.*;
class RemoveDuplicate{
public void RemDuplicate(int a[],int n){
	int j=0;
	for(int i=0;i<n-1;i++){
		if(a[i]!=a[i+1])
			a[j++]=a[i];
	}
	a[j]=a[n-1];
	for(int i=0;i<=j;i++){
		System.out.println(a[i]+" ");
	}
}
	public static void main(String ar[]){
		int arr[]={12,65,12,65,20,12,20,17,17,28,85};
		Arrays.sort(arr);
		int len=arr.length;
		RemoveDuplicate rd= new RemoveDuplicate();
		rd.RemDuplicate(arr,len);
	}
}