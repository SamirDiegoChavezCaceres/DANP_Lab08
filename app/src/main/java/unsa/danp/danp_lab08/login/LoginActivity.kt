package unsa.danp.danp_lab08.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import unsa.danp.danp_lab08.ui.theme.DANP_Lab08Theme
import unsa.danp.danp_lab08.login.view.LoginForm

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            DANP_Lab08Theme {
                LoginForm()
            }
        }
    }
}