//
//  20190828-Codeswift.swift
//  
//
//  Created by baby1234 on 22/08/2019.
//

import Foundation

func solution(_ number:String, _ k:Int) -> String {
    var result = ""
    var startIndex = 0
    var digit = number.count - k

    while digit > 0 {
        var max = number[String.Index(encodedOffset: startIndex)]
        for i in startIndex...number.count-digit {
            if max < number[String.Index(encodedOffset: i)] {
                max = number[String.Index(encodedOffset: i)]
                startIndex = i
            }
        }
        result.append(max)
        startIndex += 1
        digit -= 1
    }

    return result
}

func solution(_ number:String, _ k:Int) -> String {
    var num = number
    var result = ""
    var digit = number.count - k

    while true {
        var max = differance(num, digit)
        if max.count == digit {
            result.append(contentsOf: max)
            break
        } else {
            result.append(max.removeFirst())
            num = max
            digit -= 1
        }
    }

    return result
}

func differance(_ number:String, _ digit:Int) -> String {
    var result = number
    var remainNum = ""
    for _ in 1..<digit { remainNum.append(result.removeLast()) }
    if let i = result.firstIndex(of: result.max()!) { result.removeSubrange(result.startIndex..<i) }
    return result + remainNum.reversed()
}
