class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var totalTime = 1
        var currentWeight = 0
        val passedTruckList = mutableListOf<Int>()
        val passingTruckList = mutableListOf<PassingTruckOnBridge>()
        val waitingTruckList = truck_weights.toMutableList()

        // 다리를 지난 트럭 목록의 사이즈가 최초의 대기 트럭 사이즈와 같아질때 까지 반복
        while (passedTruckList.size < truck_weights.size) {

            // 한 사이클을 반복 할때 마다 시간을 1씩 증가
            totalTime++

            // 다리 위에 트럭이 있는지 판단함
            if (passingTruckList.isEmpty()) {
                // 다리 위에 트럭이 없으면 대기 중인 트럭 중 가장 앞의 트럭이 다리 진입
                // 대기 중인 트럭 중 가장 앞의 트럭을 빼고 대기중인 트럭 목록에서 제거
                val frontInWaitingTruckList = waitingTruckList.removeAt(0)
                // 다리 통과중인 트럭 목록에 추가
                passingTruckList += PassingTruckOnBridge(frontInWaitingTruckList, 0)
                // 현재 다리 위의 무게를 추가
                currentWeight += frontInWaitingTruckList
            } else {
                // 대기 중인 트럭 중 가장 앞의 트럭 제거, 이때에는 아직 대기중인 트럭 목록에서 제거하지 않음
                if (waitingTruckList.isNotEmpty()) {
                    val frontInWaitingTruckList = waitingTruckList.first()
                    // 가장 앞의 트럭이 다리에 진입 가능한지 판단
                    if (currentWeight + frontInWaitingTruckList <= weight) {
                        // 진입이 가능하면 대기 중인 트럭 중 가장 앞의 트럭을 뽑고 대기중인 트럭 목록에서 제거
                        waitingTruckList.removeAt(0)
                        // 다리를 통과중인 트럭 목록에 추가
                        passingTruckList += PassingTruckOnBridge(frontInWaitingTruckList, 0)
                        // 현재 다리 위의 무게를 추가
                        currentWeight += frontInWaitingTruckList
                    }
                }
            }

            // 다리 위의 트럭을 한칸 전진
            passingTruckList.map {
                it.position++
            }

            // 만약 다리를 통과한 트럭이 있으면, 다리를 통과 중인 트럭 목록에서 제거, 다리를 통과한 트럭 목록에 추가
            val passedTruck = passingTruckList.find {
                it.position >= bridge_length
            }
            if (passedTruck != null) {
                passingTruckList.remove(passedTruck)
                passedTruckList += passedTruck.weight
                currentWeight -= passedTruck.weight
            }
        }
        return totalTime
    }

}

data class PassingTruckOnBridge(
    var weight: Int,
    var position: Int
)