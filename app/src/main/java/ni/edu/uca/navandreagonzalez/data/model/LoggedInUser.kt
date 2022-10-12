package ni.edu.uca.navandreagonzalez.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String  = "UCA",
    val displayName: String
)