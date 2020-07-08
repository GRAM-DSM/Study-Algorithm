//
//  20190828-Codeswift.swift
//  
//
//  Created by baby1234 on 22/08/2019.
//

import Foundation

func solution(_ x:Int) -> Bool {
    var result = 0
    for i in String(x).indices { result += Int("\(String(x)[i])")! }
    return x % result == 0
}
