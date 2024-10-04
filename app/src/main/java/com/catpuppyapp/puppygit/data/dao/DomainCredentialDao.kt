/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.catpuppyapp.puppygit.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.catpuppyapp.puppygit.data.entity.DomainCredentialEntity

/**
 * Database access object to access the Inventory database
 */
@Dao
interface DomainCredentialDao {
    @Query("SELECT * from domain_credential order by baseCreateTime DESC")
    suspend fun getAll(): List<DomainCredentialEntity>

    @Insert
    suspend fun insert(item: DomainCredentialEntity)

    @Update
    suspend fun update(item: DomainCredentialEntity)

    @Delete
    suspend fun delete(item: DomainCredentialEntity)


    @Query("SELECT * from domain_credential WHERE id = :id")
    fun getById(id: String): DomainCredentialEntity?
}