function solution(x) {
    let harshard = false;
    let X=x;let sum = 0;
    
    while(x){
        sum += Math.floor((x % 10));
        x /= 10;
    } 
    if(X%sum === 0) harshard = true;
    
    return harshard;    
}