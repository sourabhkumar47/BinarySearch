#include <iostream>
using namespace std;

int main() {
  // int n;
  // cin >> n;

  for (int i = 0; i < 3; i++) {
    if (i == 0 || i == 2) {
      for (int j = 0; j < 5; j++) {
        cout << "* ";
      }
      cout << endl;
    } else {
      cout << "* ";
      for (int a = 0; a < 3; a++) {
        cout << "  ";
      }
      cout << "* ";

      cout << endl;
    }
  }

  // for (int i = 0; i < n; i++) {
  //   for (int j = 0; j < n; j++) {
  //     cout << "* ";
  //   }
  //   cout << " " << endl;
  // }
}