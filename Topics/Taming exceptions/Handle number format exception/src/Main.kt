fun parseCardNumber(cardNumber: String): Long {
    cardNumber.trim().run {
        if (this.length != 19 || this[4] != ' ' || this[9] != ' ' || this[14] != ' ') {
            throw Exception("Wrong card number!")
        } else {
            return this.replace(" ", "").toLong()
        }
    }
}