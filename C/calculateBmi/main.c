#include <math.h>
#include "main.h"

const char *bmi (int weight, double height)
{
    const double bmi = weight / pow(height, 2);
    if (bmi <= 18.6) return "Underweight";
    if (bmi <= 25) return "Normal";
    if (bmi <= 30) return "Overweight";
    if (bmi > 30) return "Obese";
}
