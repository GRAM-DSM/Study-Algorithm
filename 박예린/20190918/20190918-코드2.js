function solution(n) {
    if(n===1 || n===2) return n;
    let answer = new Array();
    
    answer.push(0);
    answer.push(1);
    answer.push(2);
    
    for(let i=1;i<n-1;i++){
        answer.push((answer[i]+answer[i+1]));
    }
    return answer[n];
}