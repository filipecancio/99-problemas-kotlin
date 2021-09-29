package problems.kotlin.miscellaneous

class MiscellaneousProblem01 {

    companion object{
        fun nQueenPuzzle(boardSize:Int): String {
            return Board(boardSize).toBoardString()
        }

        data class Queen(
            val row:Int,
            val column: Int
        )

        data class Board(
            val size: Int,
            var queenList: List<Queen>
        ){

            constructor(size: Int): this(size, emptyList()){
                this.addQueen()
            }

            private fun addQueen(){
                val nextColumn = (queenList.map { it.column }.maxOrNull() ?: -1) + 1
                queenList = 0.until(size).map{Queen(it,nextColumn)}
            }

            fun toBoardString():String{
                return 0.until(size).joinToString("\n") {row ->
                    0.until(size).joinToString(" | ") { col ->
                        if( queenList.contains(Queen(row,col))) "o" else " "
                    }
                }
            }
        }
    }
}

fun main(){
    val board = MiscellaneousProblem01.nQueenPuzzle(8)
    println(board)
}