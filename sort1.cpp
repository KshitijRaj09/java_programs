#include<algorithm>
#include<iostream>
using namespace std;
class RemoveDuplicate{
public :
	void RemDuplicate(int a[],int n){
	int j=0;
	for(int i=0;i<n-1;i++){
		if(a[i]!=a[i+1])
			a[j++]=a[i];
	}
	a[j]=a[n-1];
	for(int i=0;i<=j;i++){
		cout<<a[i]<<" ";
	}}
};
	int main(){
		int arr[]={12,65,12,65,20,12,20,17,17,28,85};
		sort(arr,arr+11);
		int len=sizeof(arr)/sizeof(arr[0]);
		//int len=arr.length;
		RemoveDuplicate rd;
		rd.RemDuplicate(arr,len);
}
