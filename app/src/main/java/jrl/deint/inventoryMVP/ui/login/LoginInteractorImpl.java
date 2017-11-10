package jrl.deint.inventoryMVP.ui.login;

/**
 * Created by usuario on 10/11/17.
 */

public class LoginInteractorImpl {

    @Override
    public void validateCredentials(String user, String password, LoginInteractor.OnLoginFinishedListener listener) {
        // Realiza todas las comprobaciones
        // Si el password es vacío
        if listener.onPasswordEmptyError();
        if else
            listener.onUserEmptyError();
        if else
            listener.onPasseordError();
        else
            listener.onSuccess();
        // Y es correcto
    }
}
