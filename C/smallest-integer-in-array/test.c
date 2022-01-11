#include <criterion/criterion.h>
#include "main.h"

Test(Sample_Test, should_return_the_smallest_integer)
{
    cr_assert_eq(find_smallest_int((int[]){34, 15, 88, 2}, 4), 2);
    cr_assert_eq(find_smallest_int((int[]){34, -345, -1, 100}, 4), -345);
    cr_assert_eq(find_smallest_int((int[]){78, 56, 232, 12, 11, 43}, 6), 11);
}