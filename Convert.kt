// Name : Jenil Parmar
// student id : A00271994
// course name : mobile application development


fun main(){

	// Get value from user
	print("\nEnter a number that you want to convert it in a different unit: ")
	val enteredNumber: Double = readLine()!!.toDouble()
	
	// Selection Units	
    val unitsList = listOf("km", "mi", "m", "ft", "yd", "cm", "mm")
	
	// Select Source Unit
    val sourceUnit = getUnitName(unitsList)
	
	// Select Destination Unit
    val destUnit = getUnitName(unitsList)
}

// Method to get unit name that is selected from user
fun getUnitName(units: List<String>): String {
	println()
	for (index in units.indices){
		println("${index+1} -> ${units[index]}")
	}

	
	// Get destination unit from user
	print("Please select any measurent unit: ")
	val destUnit = readLine()!!
	
	return destUnit			// return selected destination unit 
}