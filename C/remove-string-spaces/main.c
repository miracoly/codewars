#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "main.h"

char *no_space(const char *str_in) {
    char *tmp = malloc(strlen(str_in + 1));
    char *result = tmp;
    
    while (*str_in != '\0') {
        if (*str_in != ' ') {
            *tmp++ = *str_in;
        }
        str_in++;
    }

    *tmp = '\0';
    
    return result;
}