#include <stdint.h>
#include <stdlib.h>

int compare_fun(const void* *num1, const void *num2) {
    return (int)(*(unsigned char *)num1) - (int)*(const unsigned char*) num2;
}

uint32_t sort_bytes(uint32_t number) {
    qsort(&number, 4, 1, compare_fun);
    return number;
}
