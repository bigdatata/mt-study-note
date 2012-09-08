/*
 ============================================================================
 Name        : c.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
//	int b=3;
//	int arr[]={6,7,8,9,10};
//	int *ptr=arr;
//	*(ptr++)+=123;
//	int i=0;
//	for(;i<5;i++){
//		printf("%d ",arr[i]);
//	}
//	printf("\n");
//	printf("%d %d",*ptr,*(++ptr));

//	unsigned int a=0xFFFFFFF7;
//	unsigned char i=(unsigned char)a;
//	char* b=(char*)&a;
//	printf("%d\n",sizeof(long double));
//	printf("%d\n",sizeof(long));
//	printf("%d\n",sizeof(double));
//	printf("%d\n",sizeof(float));
//	printf("%d\n",sizeof(short int));
//	printf("%d\n",sizeof(int));
//	printf("%d\n",sizeof(char));
//	printf("%d\n",sizeof(wchar_t));
//	enum number{m1,m2,m3,m4};
//	enum number mval;
//	printf("%d\n",sizeof(enum number));
//
//	printf("%08x, %08x",i,*b);
	int x=0,y=0;
	int max=RAND_MAX;
	int maxSqua=max*max;
	int rgnC=0;
	int loop=1000;
	while(loop-->0){
		x=rand();
		y=rand();
		if(x*x+y*y<maxSqua){
			rgnC++;
		}
	}
	printf("%d",rgnC);
	return EXIT_SUCCESS;

}
