class PointFactory : FigureFactory() {
    val firstPoint = Point(1, 1)
    val secondPoint = Point(4, 5)
    val listOfPoints = listOf<Point>(firstPoint, secondPoint)

    override fun createFigures(): List<Point> = listOfPoints
}