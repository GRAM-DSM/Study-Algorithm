//
//  File.swift
//  
//
//  Created by 이현욱 on 27/08/2019.
//

import Foundation

func solution(_ n:Int) -> String {
    var res : String = ""
    for n in 1 ... n {
        if(n % 2 == 1) {
            res += "수"
        } else {
            res += "박"
        }
    return res
    }
}
