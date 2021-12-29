#include <criterion/criterion.h>
#include <stdint.h>

uint32_t sort_bytes(uint32_t number);

Test(Sample_tests, should_pass_all_sample_tests)
{
  uint32_t uin = sort_bytes(0);
  cr_expect_eq(uin, 0, "Wrong answer for input = %d\nExpected: %d\n  Actual: %u\n", 0, 0, uin);
  
  uin = sort_bytes(1);
  cr_assert_eq(uin, 16777216U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 1, 16777216U, uin);
  
  uin = sort_bytes(2);
  cr_assert_eq(uin, 33554432U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 2, 33554432U, uin);
  
  uin = sort_bytes(4294967295);
  cr_assert_eq(uin, 4294967295U, "Wrong answer for input = %u\nExpected: %u\n  Actual: %u\n", 4294967295U, 4294967295U, uin);
  
  uin = sort_bytes(3735928559);
  cr_assert_eq(uin, 4024352429U, "Wrong answer for input = %u\nExpected: %u\n  Actual: %u\n", 3735928559U, 4024352429U, uin);
  
  uin = sort_bytes(255);
  cr_assert_eq(uin, 4278190080U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 255, 4278190080U, uin);
  
  uin = sort_bytes(305419896);
  cr_assert_eq(uin, 2018915346U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 305419896, 2018915346U, uin);
  
  uin = sort_bytes(19088743);
  cr_assert_eq(uin, 1732584193U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 19088743, 1732584193U, uin);
  
  uin = sort_bytes(555885348);
  cr_assert_eq(uin, 606282273U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 555885348, 606282273U, uin);
  
  uin = sort_bytes(43839);
  cr_assert_eq(uin, 2873032704U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 43839, 2873032704U, uin);
  
  uin = sort_bytes(723893);
  cr_assert_eq(uin, 3037399808U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 723893, 3037399808U, uin);
  
  uin = sort_bytes(3567);
  cr_assert_eq(uin, 4010606592U, "Wrong answer for input = %d\nExpected: %u\n  Actual: %u\n", 3567, 4010606592U, uin);
}
