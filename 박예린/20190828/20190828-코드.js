
function solution(n) {
    let answer = '';
    
    let a = Math.floor(n/2);
    for(let i=0;i<a;i++){
        answer += '수박';
    }
    if(n%2 != 0){ answer += '수'; }
    
    return answer;
}