#include <iostream>
#include <list>
using namespace std;
list<int> list1;
void find_factor(int sum,int n)
{
	//�ݹ����
	if(n<=0||sum<=0)
		return;
	//����ҵ�����
	if(sum==n)
	{
		list1.reverse();
		for(list<int>::iterator iter=list1.begin();iter!=list1.end();iter++)
			cout<<*iter<<"+";
		cout<<n<<endl;
		list1.reverse();
	}
	list1.push_front(n);
	find_factor(sum-n,n-1);//n��������
	list1.pop_front();
	find_factor(sum,n-1);//n����������
}

int main(void)
{
	int sum,n;
	cin>>sum>>n;
	cout<<"���п��ܵ����У����£�"<<endl;
	find_factor(sum,n);
	return 0;
}