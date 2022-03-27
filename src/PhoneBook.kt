class PhoneBook {

    private val _contactList = mutableListOf<Contact>()
    val contactList: List<Contact>
        get() = _contactList

    /* The function below is used to get a phoneNumber from the list of Contact */
    fun getContact(phoneNumber: String):Contact?{
        return contactList.find { it.phoneNumber == phoneNumber }
    }

    /* The function below stores one contact at a time in our phone book.
    The function also checks for duplicate contact or phoneNumber and throws an exception
    if the phoneNumber already exist */
    fun storeContact(contact: Contact){
        val duplicateCheck = contactList.map {
            it.phoneNumber
        }.contains(contact.phoneNumber)
        if (duplicateCheck) {
            throw Exception("Phone number ${contact.phoneNumber} already exists")
        }
        _contactList.add(contact)
    }
}