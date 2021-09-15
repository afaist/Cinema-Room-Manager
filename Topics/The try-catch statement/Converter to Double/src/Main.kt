fun convertStringToDouble(input: String): Double =
    try {
        input.toDouble()
    } catch (e: NumberFormatException) {
        0.0
    }
