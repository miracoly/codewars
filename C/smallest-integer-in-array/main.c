#include <stddef.h>
#include "main.h"

int find_smallest_int(const int *vec, size_t len)
{
    int smallest = vec[0];

    for (int i = 1; i < len; i++) {
        if (vec[i] < smallest) {
            smallest = vec[i];
        }
    }

    return smallest;
}