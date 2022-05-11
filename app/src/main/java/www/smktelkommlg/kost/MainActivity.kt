package www.smktelkommlg.kost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NetworkConfig().getService()
            .getKosts()
            .enqueue(object : Callback<List<www.smktelkommlg.kost.Response>> {
               override fun onFailure(call: Call<List<www.smktelkommlg.kost.Response>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(
                    call: Call<List<www.smktelkommlg.kost.Response>>,
                    response: Response<List<www.smktelkommlg.kost.Response>>
                ) {
                    rvUser.adapter = Adapter(response.body())
                }
                //override fun onFailure(call: Call<List<www.smktelkommlg.kost.Response>>, error: Throwable) {
                    //Log.e("tag", "errornya ${error.message}")
                //}

            })
    }

}