def gcd(a, b):
    if a < b:
        (a, b) = (b, a)
    while b != 0:
        (a, b) = (b, a % b)
    return a

def lcm(a,b):
    return a*b//gcd(a,b)

def solution(arr):
        answer = 1
        for i in arr:
            answer=lcm(answer, i)
        return answer

a=[2,6,9,35]
print(solution(a))
