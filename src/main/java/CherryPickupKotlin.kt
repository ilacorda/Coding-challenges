class CherryPickupKotlin {

/*
 * Complete the 'collectMax' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY mat as parameter.
 */

    fun collectMax(mat: Array<Array<Int>>): Int {
        val n = mat.size
        return 0.coerceAtLeast(move(mat, n, 0, 0, 0, *Array(n) { Array<Array<Int>>(n) { arrayOf<Int>(n) } }))
    }

    private fun move(grid: Array<Array<Int>>, n: Int, r1: Int, c1: Int, c2: Int, vararg memoization: Array<Array<Int>>): Int {
        val r2 = r1 + c1 - c2
        return if (r1 < n && c1 < n && r2 < n && c2 < n && grid[r1][c1] != -1 && grid[r2][c2] != -1) {
            if (r1 != n - 1 || c1 != n - 1) {
                if (memoization[r1][c1][c2] == null) {
                    if (r1 == r2 && c1 == c2) {
                        memoization[r1][c1][c2] = grid[r1][c1]
                    } else memoization[r1][c1][c2] = grid[r1][c1] + grid[r2][c2]
                    move(grid, n, r1 + 1, c1, c2, *memoization).coerceAtLeast(move(grid, n, r1, c1 + 1, c2, *memoization)).coerceAtLeast(move(grid, n, r1 + 1, c1, c2 + 1, *memoization).coerceAtLeast(move(grid, n, r1, c1 + 1, c2 + 1, *memoization))).let { memoization[r1][c1][c2] += it; memoization[r1][c1][c2] }
                } else {
                    memoization[r1][c1][c2]
                }
            } else {
                grid[r1][c1]
            }
        } else {
            Int.MIN_VALUE
        }
    }

    fun main(args: Array<String>) {
        val matRows = readLine()!!.trim().toInt()
        val matColumns = readLine()!!.trim().toInt()

        val mat = Array<Array<Int>>(matRows, { Array<Int>(matColumns, { 0 }) })

        for (i in 0 until matRows) {
            mat[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        }

        val result = collectMax(mat)

        println(result)
    }
}

