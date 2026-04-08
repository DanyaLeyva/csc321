//Danya Leyva
//Lab 11
#include <stdio.h>
#include <math.h>

double hypoOfRight(double base, double height)
{
    double length;

    length = sqrt((base * base) + (height * height));
    return length;
}

int main(void)
{
    double base, height;
    double result;

    printf("Enter the base of a triangle: ");
    scanf("%lf", &base);

    printf("Enter the height of a triangle: ");
    scanf("%lf", &height);

    result = hypoOfRight(base, height);

    printf("The hypotenuse of the triangle is: %.2lf\n", result);

    return 0;
}
