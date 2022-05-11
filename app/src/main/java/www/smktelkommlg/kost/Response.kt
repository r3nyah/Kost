package www.smktelkommlg.kost

import android.location.Address
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

//@Generated("com.robohorse.robopojogenerator")


data class Response(
	@field:SerializedName("totalBedrooms")
	val totalBedrooms: Int? = null,

	@field:SerializedName("genderRestriction")
	val genderRestriction: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("availableBedrooms")
	val availableBedrooms: Int? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("imageUrl")
	val imageUrl: String? = null,

	@field:SerializedName("contact")
	val contact: String? = null,

	@field:SerializedName("V")
	val V: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

