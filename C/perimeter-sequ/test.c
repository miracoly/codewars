#include <criterion/criterion.h>

int perimeter_sequence(int a, int n);
void tester(int a, int n, int expected);

Test(Sample_Test, should_pass_this_test) {
    tester(1, 3, 12);
}

void tester(int a, int n, int expected) {
    int submitted = perimeter_sequence(a, n);
    cr_assert_eq(           submitted,     expected,
        "a = %d\nn = %d\n \nSubmitted: %d\nExpected:  %d\n \n",
         a,      n,         submitted,     expected
    );
}
