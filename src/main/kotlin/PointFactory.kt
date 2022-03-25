class PointFactory : FigureFactory() {
    val firstPoint = Point(1.0, 1.0)
    val secondPoint = Point(4.0, 5.0)
    val listOfPoints = listOf<Point>(firstPoint, secondPoint)

    override fun createFigures(): List<Point> = listOfPoints
}