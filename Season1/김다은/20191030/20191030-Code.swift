//
//  20191030-Code.swift
//  
//
//  Created by baby1234 on 30/10/2019.
//

import Foundation

func solution(_ bridge_length:Int, _ weight:Int, _ truck_weights:[Int]) -> Int {
    var wating = truck_weights
    var bridge = [(Int, start: Int)]()
    var crossed = [Int]()
    var result = 0

    while true {
        result += 1
        if crossed.count == truck_weights.count { break }

        if let watingTruck = wating.first, bridge.reduce(0, { $0 + $1.0 }) + watingTruck <= weight {
            bridge.append((wating.removeFirst(), start: result))
        }

        for (_, start) in bridge {
            if result - start == bridge_length - 1 { crossed.append(bridge.removeFirst().0) }
        }
    }

    return result
}
