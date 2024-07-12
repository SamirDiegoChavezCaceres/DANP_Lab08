package unsa.danp.danp_lab08.login.view

import android.content.Context
import android.widget.Toast
import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginFormTest {

    @Mock
    lateinit var mockContext: Context

    @Before
    fun setUp() {
        // Mock the static Toast.makeText() method
        mockkStatic(Toast::class)
        every { Toast.makeText(any(), anyString(), anyInt()) } returns mockk()
    }

    @After
    fun tearDown() {
        // Unmock the static Toast.makeText() method
        unmockkStatic(Toast::class)
    }

    @Test
    fun `test correct credentials`() {
        // Given
        val credentials = Credentials("admin", "password")

        // When
        val result = checkCredentials(credentials, mockContext)

        // Then
        assert(result)
    }

    @Test
    fun `test incorrect credentials`() {
        // Given
        val credentials = Credentials("user", "wrongpassword")

        // When
        val result = checkCredentials(credentials, mockContext)

        // Then
        assert(!result)
    }
}
