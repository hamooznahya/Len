package com.bemotioninc.sss.data.repository

import com.bemotioninc.sss.data.datasource.RemoteDataSource
import com.bemotioninc.sss.domin.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private  val remoteDataSource: RemoteDataSource) :
    UserRepository {

}