#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, x, m;
    cin >> n;
    vector<int> vec(n);
    for (int &e : vec) {
        cin >> e;
    }
    sort(vec.begin(), vec.end());
    cin >> m;
    for (int i = 0; i < m; ++i) {
        cin >> x;
        cout << lower_bound(vec.begin(), vec.end(), x) - vec.begin() << " ";
    }
    return 0;
}
