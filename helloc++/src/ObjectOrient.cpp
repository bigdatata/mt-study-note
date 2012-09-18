/*
 * ObjectOrient.cpp
 *
 *  Created on: 2012-9-8
 *      Author: uestc-tao
 */
#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;
enum Breed {
	golden, cairn, dandie, shetland, doberman, lab
};
/**
 * struct inherit
 */
struct Mammal {
public:
	Mammal() :
			itsAge(2), itsWeight(5) {
	}
	;
	~Mammal() {
	}
	;
	virtual void speak() {
		cout << "\n mammal sound!";
	}
	void sleep() {
		cout << "\n Shhh,I'm sleeping";
	}
	int getItsAge() const {
		return itsAge;
	}

	void setItsAge(int itsAge) {
		this->itsAge = itsAge;
	}

	int getItsWeight() const {
		return itsWeight;
	}

	void setItsWeight(int itsWeight) {
		this->itsWeight = itsWeight;
	}
protected:
	int itsAge;
	int itsWeight;
};

struct Dog: public Mammal {
public:
	void wagTail() {
		cout << "\nTail wagging";
	}
	void speak() {
		cout << "\n dog spark";
	}
};

struct Test {
	Test(int) {
	}
	Test() {
	}
	void fun() {
	}
};
//
//int main() {
////	Test a(1);
////	a.fun();
////	Test b();//method declare
////	b.fun();
//
////	Mammal* fido=new Dog();
////	fido->speak();
////	fido->wagTail();
//}

