#include <iostream>

using namespace std;

int convert()
{
    double orig;
    double converted;
    int currency;
    cout << "Enter the original amount (USD): ";
    cin >> orig;
    cout << "Enter the currency to convert to (1 = peso, 2 = rupee, 3 = pound, 4 = euro): ";
    cin >> currency;

    switch(currency) {
        case 1 :
            converted = orig * 22.4;
            break;
        case 2:
            converted = orig * 75.69;
            break;
        case 3:
            converted = orig * 0.8;
            break;
        case 4:
            converted = orig * 0.89;
            break;
        default:
            cout << "Invalid value" << endl;

    }
    cout << "The converted value is: " << converted << endl;
    return 1;
}

int main()
{
    char cont = 'y';
    while(cont == 'y'){
        convert();
        cout << endl;
        cout << "Would you like to continue? Enter y or n: ";
        cin >> cont;
    }
    return 0;
}
