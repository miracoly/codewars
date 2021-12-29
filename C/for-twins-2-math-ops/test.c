#include <criterion/criterion.h>

int ice_brick_volume(int radius, int bottle_length, int rim_length);
void tester(int radius, int bottle_length, int rim_length, int expected);

Test(Sample_Tests, should_pass_2_tests)
{
    tester(1, 10, 2,   16);
    tester(5, 30, 7, 1150);
}

void tester(int radius, int bottle_length, int rim_length, int expected) {
    int submitted = ice_brick_volume(radius, bottle_length, rim_length);
    cr_assert_eq(submitted, expected,
        "ERROR\n \nradius = %d\nbottle_length = %d\nrim_length = %d\n \nSubmitted: %d\nExpected: %d\n \n",
        radius, bottle_length, rim_length, submitted, expected);
}
