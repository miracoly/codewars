#include <stdlib.h>
#include <string.h>
#include "main.h"

char *dna_strand(const char *dna) {
    char *complement = malloc(sizeof(char) * strlen(dna) + 1);
    char *result = complement;
    while (*dna != '\0') {
        switch (*dna) {
        case 'A':
            *complement = 'T';
            break;
        case 'T':
            *complement = 'A';
            break;
        case 'C':
            *complement = 'G';
            break;
        case 'G':
            *complement = 'C';
            break;
        default:
            break;
        }
        complement++;
        dna++;
    }
    *complement = '\0';
    
    return result;
}