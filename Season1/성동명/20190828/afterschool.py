n=[]
a=int(input())
for i in range(a):
    if i%2==0:
        n.append('수')
    elif i%2==1:
        n.append('박')
print("".join(map(str, n)))