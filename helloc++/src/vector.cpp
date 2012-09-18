/*
 * vector.cpp
 *
 *  Created on: 2012-9-8
 *      Author: uestc-tao
 */

#include <iostream>
#include <cstdlib>
#include <vector>
#include <string.h>

using namespace std;

class CDemo{
public:
	CDemo():str(NULL){};
	CDemo(const CDemo & de){
		str=new char[sizeof(de.str)+1];
		strcpy(str,de.str);
	}
	~CDemo(){
		if(str){
			cout<<"delete str address is"<<(int *)str<<endl;
			delete str;
		}
	}
	char* str;
private:
};


void print(vector<int>);

template<typename T>
const T* myFind(T *array,T n,T x){
	const T* p=array;
	for(int i=0;i<n;i++){
		if(*p==x){
			return p;
		}
		++p;
	}
	return 0;
}
int main1(){

//	vector<int> array;
//	array.push_back(10);
//	array.push_back(6);
//	array.push_back(5);
//	array.push_back(6);
//	array.push_back(6);
//	array.push_back(6);
//	vector<int>::iterator itor;
//	vector<int>::iterator itor2;
//	itor=array.begin();
//	for(;itor!=array.end();){
//		if(6==*itor){
//			array.erase(itor);
//			continue;
//		}
//		itor++;
//	}
//
//	print(array);

//	CDemo d;
//	d.str=new char[32];
//	strcpy(d.str,"trend micro");
//	vector<CDemo>* a=new vector<CDemo>();
//	a->push_back(d);
//	delete a;
//	vector<int> vec;
//	vec.push_back(34);
//	vec.push_back(23);
//	print(vec);
//	vector<int>::iterator p;
//	p=vec.begin();
//	*p=68;
//	*(p+1)=69;
//	print(vec);
//	vec.pop_back();
//	print(vec);
//	vec.push_back(39);
//	vec.push_back(99);
//	int i=0;
//	while(i<vec.size()){
//		cout<<vec[i++]<<" ";
//	}
//	cout<<endl;
//	vec[0]=100;
//	print(vec);

	return EXIT_SUCCESS;
}

void print(vector<int> v){
	cout<<"\n vector size is:"<<v.size()<<endl;
	vector<int>::iterator p;
	p=v.begin();
	while(p<v.end()){
		cout<<*(p++)<<endl;
	}
}


