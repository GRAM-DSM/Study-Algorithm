//
//  20190828-Codeswift.swift
//  
//
//  Created by baby1234 on 22/08/2019.
//

import Foundation

func solution(_ n:Int) -> String {
    var result = ""
    
    for i in 1...n {
        if i % 2 == 1 {
            result += "수"
        } else {
            result += "박"
        }
    }
    
    return result
}

