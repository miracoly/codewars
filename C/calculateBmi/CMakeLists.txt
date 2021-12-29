cmake_minimum_required(VERSION 3.22.1)

project(BMI)

link_directories(${CMAKE_BINARY_DIR}/res)

enable_testing()

add_executable(${PROJECT_NAME} main.c)
target_link_libraries(${PROJECT_NAME}
m
criterion
)

enable_testing()
add_executable(utest test.c)
target_link_libraries(utest criterion)
add_test(Unittest utest)