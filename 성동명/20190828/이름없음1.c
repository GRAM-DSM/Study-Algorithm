#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int n) {
    // 리턴할 값은 메모리를 동적 할당해주세요.
    char* answer = (char*)malloc(sizeof(char)*n);
    int i;
    for(i = 0; i<n; i++)
    {
        if(i%2==false)
            answer[i]='a';
        if(i%2==true)
            answer[i]='b';
    }
    return answer;
}
int main()
{
	int n;
	scanf("%d", &n);
	printf("%s", solution(n));
}
