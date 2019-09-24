function solution(n) {
    if(n===1 || n===2) return n;
    let answer = new Array(0,1,2,)
    for(let i=1;i<n-1;i++){
        answer.push((answer[i]+answer[i+1])%1234567);
    }
    return answer[n];
}