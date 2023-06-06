#include <iostream>

using namespace std;

bool P(int x) {
    return x % 2 == 0; 
}

int main() {

    int x = 4;
    int y = 5;

    bool proposicion1 = P(x) && P(y); 
    bool proposicion2 = P(x) || P(y); 
    bool proposicion3 = !P(x) || P(y); 


    bool cuantificacion1 = false;
    for (int i = 0; i < 10; i++) {
        if (P(i)) {
            cuantificacion1 = true;
            break;
        }
    }
    
    bool cuantificacion2 = true;
    for (int i = 0; i < 10; i++) {
        if (!P(i)) {
            cuantificacion2 = false;
            break;
        }
    }

    cout << boolalpha;
    cout << proposicion1 << endl; 
    cout << proposicion2 << endl; 
    cout << proposicion3 << endl; 
    cout << cuantificacion1 << endl; 
    cout << cuantificacion2 << endl; 

    return 0;
}


