package jrl.deint.inventory;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import jrl.deint.inventory.repository.UserRepository;

import static org.mockito.Mockito.mock;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 * 1. El usuario introduce usuario/email (Instrumentales)
 * 2. El usuario introduce contraseña (Instrumentales)
 * 3. La contraseña tiene al menos 6 caracteres (Instrumental)
 * 4. Doble comprobación de la contraseña (Instrumental)
 */
@RunWith(AndroidJUnit4.class)
public class LoginInstrumentedTest {

    @Mock
    // Notación Mock para que esté compartido por los tests (si no, da NullPointerException)
    private UserRepository userRepository = mock(UserRepository.class);

    /**
     * Comprueba que el User no es vacío
     */
    @Test
    public void isUserEmpty() {

    }

    /**
     * Comprueba que el Email no es vacío
     */
    @Test
    public void isEmailEmpty() {

    }


    /**
     * Comprueba que el Password no es vacío
     */
    @Test
    public void isPasswordEmpty() {

    }

    /**
     * Comprueba que la longitud de la contraseña es correcta
     */
    @Test
    public void passwordLength() {

    }

    @Test
    public void passwordDoubleCheck() {

    }
}
