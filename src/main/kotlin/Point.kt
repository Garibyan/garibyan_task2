import kotlin.math.abs
import kotlin.math.sqrt

class Point(override var x: Int, override var y: Int): Figure{



    override fun toString(): String {
        return "x equals $x \ny equals $y"
    }


    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            return other.x == x && other.y == y
        }
        return false
    }

    override fun symmetricalTransfer(): Point {
        x *= -1
        y *= -1
        return this
    }

    override fun distance(point: Point): Double {
        if (x == point.x) return abs(y - point.y).toDouble()
        else if (y == point.y) return abs(x - point.x).toDouble()
        else return sqrt(
            Math.pow((x - point.x).toDouble(), 2.0) +
                    Math.pow((y - point.y).toDouble(), 2.0)
        )
    }
}