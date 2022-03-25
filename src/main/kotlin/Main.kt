fun main(args: Array<String>) {
    val pointFactory = FigureFactory.createFactory<Point>()
    val firstPoint = pointFactory.createFigures().get(0)
    val secondPoint = pointFactory.createFigures().get(1)


    println("$firstPoint \n")
    println("equals ${firstPoint == secondPoint}\n")
    println("distance ${firstPoint.distance(secondPoint)}\n")
    println("summetrical transfer\n${firstPoint.symmetricalTransfer()}")


}