#include <criterion/criterion.h>
#include <stddef.h>
#include "main.h"

Test(BasicTests, ShouldPassAllTheTestsProvided) {
  cr_assert_eq(summation(1), 1);
  cr_assert_eq(summation(8), 36);
  cr_assert_eq(summation(100), 5050);
}