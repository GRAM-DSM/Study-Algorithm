//
//  20190828-Codeswift.swift
//  
//
//  Created by baby1234 on 22/08/2019.
//

import Foundation

func solution(_ number:String, _ k:Int) -> String {
    var k = k
    var result = [String]()

    for (idx, num) in number.enumerated() {
        while !result.isEmpty && String(num) > result.last! && k > 0 {
            result.removeLast()
            k -= 1
        }

        if k == 0 { result += number.map { String($0) }[idx...]; break }

        result.append(String(num))
    }

    if k > 0 { return result[..<(result.count - k)].joined() }
    return result.joined()
}
