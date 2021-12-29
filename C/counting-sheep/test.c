#include <criterion/criterion.h>
#include <stdbool.h>
#include <stddef.h>

Test(ExampleTests, ShouldPassAllTheTestsProvided) {
  {
    const bool sheep[] = {
      true,  true,  true,  false,
      true,  true,  true,  true,
      true,  false, true,  false,
      true,  false, false, true,
      true,  true,  true,  true,
      false, false, true,  true
    };
    const size_t received = count_sheep(sheep, sizeof(sheep)/sizeof(sheep[0]));
    const size_t expected = 17;
    cr_assert_eq(expected, received, "Expected: %zd Received: %zd", expected, received);
  }
}
