def solution(x):
    a=0
    num=x
    while 1:
        if num>=1:
            a=a+num%10
            if num==10:
                a+=1
            num=int(num/10)
        else:
            break
    if x%a==0:
        answer = True
    else:
        answer = False
    return answer

print(solution(11))
