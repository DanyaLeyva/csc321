// Danya Leyva
// Midterm #2
// April 23rd, 2026

#include <stdio.h>

void nameLoop(int num);

int main(void)
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    nameLoop(number);

    return 0;
}

void nameLoop(int num)
{
    int i;

    for (i = 0; i < 5; i++)
    {
        printf("Danya%d\n", num);
    }
}
