//
//  20190828-Codeswift.swift
//  
//
//  Created by baby1234 on 22/08/2019.
//

import Foundation

func solution(_ arr: [Int]) -> Int {
    var result = [[Int]]()
    
    for i in 0...arr.count {
        result.append(PrimeFactorDecomposition(arr[i]))
    }
    
    return RemoveCommonPrimeFactor(result).reduce(1, { $0 * $1 })
    
}

func PrimeFactorDecomposition(_ number: Int) -> [Int] {
    var primeFactors = [Int]()
    var num = number
    
    for i in stride(from: 2, through: Int(sqrt(Double(num))), by: 1) {
        while num % i == 0 {
            num = num / i
            primeFactors.append(i)
        }
    }
    primeFactors.append(num)
    
    return primeFactors
}

func RemoveCommonPrimeFactor(_ arr: [[Int]]) -> [Int] {
    var result = [Int]()
    
    for i in 0...arr.count {
        
    }
    
    return result
}

