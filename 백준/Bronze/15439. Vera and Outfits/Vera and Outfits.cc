#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, answer;
    cin >> n;

    answer = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) continue;
            answer++;
        }
    }
    cout << answer << "\n";
}