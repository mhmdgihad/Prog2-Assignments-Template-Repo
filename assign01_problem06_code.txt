//mohamed gehad sayed
//20206307
#include <iostream>
using namespace std;
int main() {
	int n1;
	cin >> n1;
	while (n1 >= 10)
		n1 /= 10;
	if (n1 % 2 == 0)
		cout << "EVEN";
	else
		cout << "ODD";
	return 0;
}
