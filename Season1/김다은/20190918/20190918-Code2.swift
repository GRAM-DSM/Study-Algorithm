//
//  20190918-Code2swift.swift
//  
//
//  Created by baby1234 on 22/08/2019.
//

import Foundation

func solution(_ n:Int) -> Int64 {
    var result = [1,2]
    for i in 0...n-1 where result.count < n { result.append(result[i] + result [i+1] % 1234567) }
    return Int64(result[n-1])
}
