#include <criterion/criterion.h>
#include "main.h"

Test(Sample_Test, should_return_the_DNA_complementary)
{
    cr_assert_str_eq(dna_strand("ATTGC"), "TAACG");
    cr_assert_str_eq(dna_strand("GTAT"), "CATA");
}