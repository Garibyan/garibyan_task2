fun main(args: Array<String>) {
    val point: Point = Point(2, 6)
    val point1: Point = Point(5, 6 )
    println(point.toString())
    println(point == point1)
    //println(point.symmetricalTransfer())
    println(point.distance(point1))


}