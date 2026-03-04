
//Danya Leyva
//CSC321
//Lab #5

#include <stdio.h>

int main(void) {
    int myInt = 10;
    float myFloat = 3.14f;
    char myChar = 'A';
    double myDouble = 2.71828;

    printf("\n---- Variable Values and Addresses ----\n");
    printf("myInt value: %d, address: %p\n", myInt, (void*)&myInt);
    printf("myFloat value: %f, address: %p\n", myFloat, (void*)&myFloat);
    printf("myChar value: %c, address: %p\n", myChar, (void*)&myChar);
    printf("myDouble value: %lf, address: %p\n", myDouble, (void*)&myDouble);

    printf("\n---- Scope Demonstration ----\n");
    if (myInt > 5) {
        int scopeVar = 100;
        printf("scopeVar inside if block: %d\n", scopeVar);
    }

   // printf("scopeVar outside if block: %d\n", scopeVar);

    printf("\n---- Array and Contiguous Memory ----\n");
    int arr[10] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i = 0; i < 10; i++) {
        printf("arr[%d] value: %d, address: %p\n", i, arr[i], (void*)&arr[i]);
    }

    return 0;
}


	 
	

