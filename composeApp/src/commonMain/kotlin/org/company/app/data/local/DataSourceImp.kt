package org.company.app.data.local

import `sql-delight`.db.YoutubeDatabase
import sqldelight.db.YoutubeEntity

class DataSourceImp(
    db: YoutubeDatabase
) : DataSource {
    private val queries = db
    override suspend fun getVideoById(id: Long): YoutubeEntity? {
        return queries.run {
            getVideoById(id)
        }
    }

    override fun getAllVideos(): List<YoutubeEntity> {
        return queries.run {
            getAllVideos()
        }
    }

    override suspend fun deleteVideoById(id: Long) {
        return queries.run {
            deleteVideoById(id)
        }
    }

    override suspend fun insertVideo(
        title: String,
        channelName: String,
        channelImage: String,
        views: String,
        pubDate: Int,
        duration: Int
    ) {
        return queries.run {
            insertVideo(
                title = title,
                channelName = channelName,
                channelImage = channelImage,
                views = views,
                pubDate = pubDate,
                duration = duration
            )
        }
    }
}