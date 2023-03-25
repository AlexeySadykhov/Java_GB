from itertools import product
import sys


def replace(string, sym, vals):
    arr = []
    i = 0
    for item in string:
        if item == sym:
            arr.append(str(vals[i]))
            i += 1
        else:
            arr.append(item)
    return "".join(arr)


expression = input("Enter expression:").split(" = ")
target = int(expression[1])
x_str, y_str = expression[0].split(" + ")
nums = [i for i in range(10)]
for x_pr in product(nums, repeat=x_str.count("?")):
    x = int(replace(x_str, "?", x_pr))
    for y_pr in product(nums, repeat=y_str.count("?")):
        y = int(replace(y_str, "?", y_pr))
        if x + y == target:
            print(f"{x} + {y} = {target}")
            sys.exit(0)
