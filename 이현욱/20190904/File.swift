//
//  File.swift
//  
//
//  Created by 이현욱 on 04/09/2019.
//

import Foundation

func solution( _ arr : [Int]) -> Int {
    var answer = lcm(arr[0], arr[1])
    
    for i in 2...arr.count {
        answer = lcm(answer, arr[i])
    }
    return answer
}

func gcd( _ a : Int, _ b : Int) -> Int {
    while(b != 0) {
        var a : Int = 0
        var b : Int = 0
        var temp = a % b
        a = b
        b = temp
    }
    return a
}

func lcm( _ a : Int, _ b : Int) -> Int {
    return Int(a * b / gcd(a,b))
}
