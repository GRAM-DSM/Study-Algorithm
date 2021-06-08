```python
def solution(N, number):
    if N == number:
        return 1
    
    s = [ set( [int(str(N) * i)] ) for i in range(1, 10)]
    answer = -1
    
    print(s);
    
    for i in range(1, 9):
        for j in range(i):
            for op1 in s[j]:
                for op2 in s[i-j-1]:
                    s[i].add(op1 + op2)
                    s[i].add(op1 - op2)
                    s[i].add(op1 * op2)
                    s[i].add(op1 // op2 if op2 != 0 else 0)
                        
        if number in s[i]:
            answer = i + 1
            break
    
    return answer
```

> 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 하도록 solution 함수를 작성하세요.

## 풀이 접근

1시간 쯤 고민하다. 포기
풀이 찾아봄

`N = 4`인 경우
`N`이 반복되는 경우 (4, 44, 44 등)
를 먼저 `set` 자료형에 담는다.

설명을 위해 몇가지를 먼저 정의하겠다.
`N(1)`: N이 1번 쓰인 식
`★`: 사칙연산
(N(1) ★ N(1)): N이 1번 쓰인 식과 N이 1번 쓰인 식을 사칙연산 한 것

`N = 1`인 경우 
`N`

`N = 2`인 경우
`NN`, `N(1) ★ N(1)`

`N = 3`인 경우
`NNN`, `N(2) ★ N(1)`, `N(1) ★ N(2)`

순서를 바꾸는 이유는 사칙연산의 나누기는 순서가 바뀌면 값이 바뀌기 때문이다.

이러한 규칙으로
`N = 4`인 경우는
`NNNN`
`N(1) ★ N(3)`
`N(2) ★ N(2)`
`N(3) ★ N(1)`
이 나오게 된다.


### 성공
집합의 인덱스가
0 ★ 2
1 ★ 1
2 ★ 0
이렇게 연산이 되도록 구성해서 해결했다.


