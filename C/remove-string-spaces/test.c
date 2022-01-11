#include <criterion/criterion.h>
#include <stdlib.h>
#include "main.h"

void tester(const char *input, char *expected) {
    char* result = no_space(input);
    cr_assert_str_eq(result, expected, "Expected was %s, but was %s", expected, result);
}

Test(Sample_Test, should_return_sample_sans_spaces) {
    tester("HELLO WORLD", "HELLOWORLD");
}