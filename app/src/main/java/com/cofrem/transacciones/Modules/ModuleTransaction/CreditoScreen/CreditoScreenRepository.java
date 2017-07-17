package com.cofrem.transacciones.Modules.ModuleTransaction.CreditoScreen;

import android.content.Context;

import com.cofrem.transacciones.models.Transaccion;

public interface CreditoScreenRepository {

    /**
     * Metodo para obtener el numero de tarjeta desde el dispositivo
     *
     * @param context
     * @param transaccion
     */
    void registrarTransaccion(Context context, Transaccion transaccion);
}
