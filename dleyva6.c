#include <stdio.h>

int main(){
	int xi = 5, yi = 2;
	double xd = 5, yd = 2;

	printf("INTERGER EVALUATION\n");
	
	printf("Expression 1: x + y * x / y - x\n");
	printf("Step: y*x = %d\n", yi *  xi);
	printf("Step: (y*x)/y = %d", (yi * xi )/ yi);
	printf("Result = %d\n\n", xi + (yi * xi)/ yi - xi );

	printf("Expression 2: - x / y + y * x\n");
        printf("Step: -x/y = %d\n", -xi / yi);
        printf("Step: (y*x)/y = %d", (yi * xi )/ yi);
        printf("Result = %d\n\n", xi + (yi * xi)/ yi - xi );
       
	printf("Expression 3: x + y*x/y\n");
        printf("Result: %d\n\n" , xi + yi * xi / yi);

	printf("DOUBLE EVALUATION\n");

	printf("Expression 1: %.2f\n", xd + yd * xd / yd - xd);
	printf("Expression 2: %.2f\n", - xd / yd + yd * xd);
	printf("Expression 3: %.2f\n", xd + yd * xd /yd);

	return 0;
}
