from fractions import gcd


def nlcm(arr):
    answer = 1
    for i in arr:
        answer = i * answer / gcd(i, answer)
    return answer

print(nlcm([2,6,9,35]));
