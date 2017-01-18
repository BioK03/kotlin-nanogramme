import java.util.*

/**
 * Created by Bertrand on 18/01/2017.
 */
class Grid (width: Int, height: Int) {
    val grid: HashMap<String, Case> = HashMap()
    val width: Int = width
    val height: Int = height

    init {
        val random = Random()
        for (i in 0..width-1) {
            for (j in 0..height - 1) {
                if (random.nextBoolean()) {
                    grid.put("$i-$j", Case(CaseType.FULL))
                } else {
                    grid.put("$i-$j", Case(CaseType.EMPTY))
                }

            }
        }
        generate()
    }

    fun generate() {
        for (i in 0..width-1) {
            for (j in 0..height - 1) {
                val key = "$i-$j"
                if(grid.get(key)!!.type.equals(CaseType.EMPTY)){
                    System.out.print("□")
                }
                if(grid.get(key)!!.type.equals(CaseType.FULL)){
                    System.out.print("■")
                }
                if(grid.get(key)!!.type.equals(CaseType.CROSSED)){
                    System.out.print("☒")
                }
            }
            System.out.print("\n")
        }
    }
}