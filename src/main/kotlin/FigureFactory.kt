abstract class FigureFactory {
    abstract fun createFigures(): List<Point>

    companion object {
        inline fun <reified T : Figure> createFactory(): FigureFactory =
            when (T::class) {
                Point::class -> PointFactory()
                else -> throw IllegalArgumentException()
            }
    }
}