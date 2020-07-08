func solution(_ x:Int) -> Bool {
    var num = x
    var res = 0
    while(num != 0){
        res += num % 10
        num /= 10
    }
    if(x % res == 0) {
        return true
    } else {
        return false
    }
}
