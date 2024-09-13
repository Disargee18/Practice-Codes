#include <stdio.h>

main()
{
    int num1, num2, sum, diff, prod, quo;

    printf("Enter first number: ");
    scanf("%d", &num1);
    
    printf("Enter second number: ");
    scanf("%d", &num2);

    //process

    sum = num1 + num2;
    diff = num1 - num2;
    prod = num1 * num2;
    quo = num1 / num2;

    //printing

    printf("The sum of %d + %d = %d", num1, num2,sum);
    printf("\nThe diff of %d - %d = %d", num1, num2,diff);
    printf("\nThe prod of %d * %d = %d", num1, num2,prod);
    printf("\nThe quo of %d / %d = %d", num1, num2,quo);
}
