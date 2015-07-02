#include<stdio.h>
#include<string.h>
int main(){

	int len;
	char arr[100] = "CAR";
	len = strlen(arr);
	int count = len*2;

	// Put Null Character in the end
	arr[count]='\0';

	// Find ASCII and put it in the array
	int k;
	while(count!=0){
		k = arr[len-1];
		while(k!=0){
			arr[count-1]=k%10+48;
			k=k/10;
			count--;
		}
		len--;
	}
	printf("%s\n",arr);
	return 0;
}