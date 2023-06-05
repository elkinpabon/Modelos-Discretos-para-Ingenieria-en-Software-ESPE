#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

int main() {

    unordered_map <string, vector <string >>redSemantica;

    redSemantica["perro"] = {"animal", "mascota"};
    redSemantica["gato"] = {"animal", "mascota"};
    redSemantica["animal"] = {"ser vivo"};
    redSemantica["mascota"] = {"animal domesticado"};

    string nodo = "perro";
    if (redSemantica.find(nodo) != redSemantica.end()) {
        cout << "Relaciones de " << nodo << ": ";
        for (const string & relacion : redSemantica[nodo]) {
            cout << relacion << " ";
        }
        cout << endl;
    }
    return 0;
}


