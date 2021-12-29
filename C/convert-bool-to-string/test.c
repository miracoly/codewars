#include <criterion/criterion.h>
#include <stdbool.h>

char *boolean_to_string(bool b);

// TODO: Replace examples and use TDD by writing your own tests. The code provided here is just a how-to example.

Test(sample_test, example_tests)
{
    cr_assert_str_eq(boolean_to_string(true), "true", "Error");
    cr_assert_str_eq(boolean_to_string(true), "true", "Error");
}
