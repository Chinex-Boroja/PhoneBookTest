
fun main() {
    val johnPhoneBook = PhoneBook()
    // Storing list of contacts in johnPhoneBook
    johnPhoneBook.storeContact(
        Contact(
            "Donnarumma",
            "Gianluigi",
            "donnagian@gmail.com",
            "08123445869"
        )
    )

    johnPhoneBook.storeContact(
        Contact(
            "Boroja",
            "Chinex",
            "borojachinex@gmail.com",
            "08034753241"
        )
    )
    //To test duplicates, uncomment
    /** borojaPhoneBook.storeContact(
        Contact(
            "Alex",
            "Telles",
            "donnagian@gmail.com",
            "08034753241"
        )
    ) */
    println("Contact details:  ${johnPhoneBook.getContact("08123445869")}")
    println()
    println("List of contacts: ${johnPhoneBook.contactList}")
}