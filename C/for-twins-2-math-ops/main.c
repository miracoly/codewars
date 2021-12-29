#include <math.h>

int square_area(int plane);

int ice_brick_volume(int radius, int bottle_length, int rim_length) {
    const int height = bottle_length - rim_length;
    const int diagonal = 2 * radius;
    return (height * pow(diagonal, 2)) / 2;
}
