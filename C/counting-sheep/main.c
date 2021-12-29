#include <stdbool.h>
#include <stddef.h>

size_t count_sheep(const bool *sheep, size_t count) {
    size_t present = 0;

    for (size_t i = 0; i < count; i++) {
        present += sheep[i];
    }

    return present;
}
