package com.example.violeta.domain

import android.widget.Toast
import com.example.violeta.data.ServiceVioleta
import com.example.violeta.data.model.retrofit.DataAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApiUseCase (val serviceVioleta:ServiceVioleta) {

    suspend fun enviarText(text: DataAPI){
        if(text != null){
            serviceVioleta.sendMole(text)
        }else{
            Exception("No hay Nada")
        }
    }

/*    suspend fun findByText(id: Int): Game{
        return withContext(Dispatchers.IO){
            val response = serviceVioleta.sendMole()
            if (response.isSuccessful){
                val game = response.body() ?: GameHelper.emptyGameEntity()
                gameDao.insertAll(GameMapper.toEntity(game))
                game
            }else{
                gameDao.findById(id)
            }
        }
    }
*/

}