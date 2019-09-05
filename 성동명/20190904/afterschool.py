def gcd(a, b):
    if a < b:
        (a, b) = (b, a)
    while b != 0:
        (a, b) = (b, a % b)
    return a

def lcm(a,b):
    return a*b//gcd(a,b)

def solution(arr):
    while len(arr)!=1:
        answer = []
        for i in range(int(len(arr) + 1) // 2):
            answer.append(lcm(arr[i], arr[-1 - i]))
        arr = answer

    return int(arr[0])

a=[2,6,9,35]
print(solution(a))
