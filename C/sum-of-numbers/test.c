#include <criterion/criterion.h>
#include "main.h"

Test(Basic_tests, sum_all) {
    cr_assert_eq(get_sum(5 , -1), 14, "Expected %d, instead got %d", 14 , get_sum(5 , -1));
    cr_assert_eq(get_sum(505 , 4), 127759, "Expected %d, instead got %d", 127759 , get_sum(505 , 4));
    cr_assert_eq(get_sum(-50 , 0), -1275, "Expected %d, instead got %d", -1275 , get_sum(-50 , 0));
    cr_assert_eq(get_sum(321 , 123), 44178, "Expected %d, instead got %d", 44178 , get_sum(321 , 123));
    cr_assert_eq(get_sum(-1 , -5), -15, "Expected %d, instead got %d", -15 , get_sum(-1 , -5));
    cr_assert_eq(get_sum(-5 , -5), -5, "Expected %d, instead got %d", -5 , get_sum(-5 , -5));
    cr_assert_eq(get_sum(-504 , 4), -127250, "Expected %d, instead got %d", -127250 , get_sum(-504 , 4));
}