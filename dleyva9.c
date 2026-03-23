// Danya Leyva
// lab-02

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
    srand(time(NULL));
    int i = 0;
    int guess = 0;

    int answer = rand() % 20 + 1;
    // random number 1-20

    printf("Guess a number between 1 and 20:\n");
    scanf("%d", &guess);

    while (guess < 1 || guess > 20)
    {
        printf("You input a number that is out of range (1-20) re-enter a valid number.\n");
        scanf("%d", &guess);
    }

    if (guess == answer)
    {
        for (i = 0; i < guess; i++)
        {
            printf("You won and guessed the number correctly!\n");
        }
    }
    else
    {
        if (guess < answer)
        {
            printf("You lost and your guess is lower than my number which was %d.\n", answer);
        }
        else
        {
            printf("You lost and your guess is higher than my number which was %d.\n", answer);
        }
    }

    return EXIT_SUCCESS;
}
