/*
 * Copyright 2016 lizhaotailang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.marktony.zhihudaily.data

import android.annotation.SuppressLint
import android.arch.persistence.room.ColumnInfo
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by lizhaotailang on 2017/6/17.
 *
 * Immutable model class for guokr handpick content channel. See the json string for more details.
 * Entity class for [com.google.gson.Gson] and [android.arch.persistence.room.Room].
 */
@Parcelize
@SuppressLint("ParcelCreator")
data class GuokrHandpickContentChannel(

        @ColumnInfo(name = "channel_url")
        @Expose
        @SerializedName("url")
        val url: String,

        @ColumnInfo(name = "channel_date_created")
        @Expose
        @SerializedName("date_created")
        val dateCreated: String,

        @ColumnInfo(name = "channel_name")
        @Expose
        @SerializedName("name")
        val name: String,

        @ColumnInfo(name = "channel_key")
        @Expose
        @SerializedName("key")
        val key: String,

        @ColumnInfo(name = "channel_articles_count")
        @Expose
        @SerializedName("articles_count")
        val articlesCount: Int

) : Parcelable
