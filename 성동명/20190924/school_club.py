import math

def catalan(n):
    return math.factorial(n*2)/(math.factorial(n)*math.factorial(n+1))

n=int(input())
print(int(catalan(n)))