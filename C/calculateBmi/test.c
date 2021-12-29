#include <criterion/criterion.h>
#include "main.h"

void tester(int weight, double height, char *expected);

Test(Example_Tests, should_pass_all_the_tests_provided)
{
    tester(  50, 1.80, "Underweight" );
    tester(  80, 1.80,      "Normal" );
    tester(  90, 1.80,  "Overweight" );
    tester( 110, 1.80,       "Obese" );
    tester(  50, 1.50,      "Normal" );
}

void tester(int weight, double height, char *expected) {
    const char *actual = bmi(weight, height); 
    cr_assert_str_eq(actual, expected, "Expected was %s, but was %s", expected, actual);
}
