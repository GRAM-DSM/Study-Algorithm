# 올바른 괄호의 갯수
- ### 알고리즘 구상

  - 테스트 케이스가 너무 적어서 n=4일 경우의 괄호 조합 경우의 수를 찾음
  - 생각보다 너무 어려워서 4만 구함
  - 234로는 도저히 모르겠어서 숫자 검색
  - 카탈란 수라는 수열이 나옴

- ### 카탈란 수

  - ![C_{n}={\frac  1{n+1}}{\binom  {2n}n}={\frac  {(2n)!}{n!(n+1)!}}](https://wikimedia.org/api/rest_v1/media/math/render/svg/4c97a546b69cad98ea90582791a22d5443dc46fd)

  - ```python
    import math
    
    def catalan(n):
        return math.factorial(n*2)/(math.factorial(n)*math.factorial(n+1))
    
    n=int(input())
    print(int(catalan(n)))
    ```

  - python에 내장되어 있는 math 모듈에 들어있는 factorial 함수 사용

- ### 나중에 알게 된 사실

  - ```python
    from math import factorial as f
    def catalan(n):
        return f(2*n)/(f(n)*f(n+1))
    ```

    