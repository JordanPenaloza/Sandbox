#include <stdio.h>

float convert_celsius(float temp) {
    return (temp * 9/5) + 32;
}

float convert_fahrenheit(float temp) {
    return (temp - 32) * 5/9;
}

int main() {
    float temp;
    float new_temp;
    char choice;

    printf("F or C? ");
    scanf("%c", &choice);
    printf("Temperature? ");
    scanf("%f", &temp);
    switch (choice) {
        case 'F':
            new_temp = convert_fahrenheit(temp);
            break;
        case 'C':
            new_temp = convert_celsius(temp);
            break;
        default:
            printf("Invalid choice\n");
    }
    
    printf("%.2f", new_temp);
    printf("\nPress Enter to exit...");
    getchar();
    getchar();
    return 0;
}