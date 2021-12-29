#include "main.h"

int summation(int num) {
    if (num == 1) {
        return 1;
    }

    return num + summation(num - 1);
}