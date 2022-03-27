import java.text.SimpleDateFormat
import java.util.*

/* A data class to collate all the contact details typical in a phone number */
data class Contact(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val dateCreated: String = SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss", Locale.getDefault()).format(Date())
)
