package com.dreamer.jetpack_instagram_ui.util

import android.net.Uri

object DummyData {
    val reels = listOf<Reel>(
        Reel(
            id = 1,
            video = "lake.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/4.png",
            userName = "Papa Toy",
            isLiked = true,
            likesCount = 7178,
            commentsCount = 1156,
            comment = "OPoppop..."
        ),
        Reel(
            id = 2,
            video = "food.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/7.png",
            userName = "Tata Api",
            isLiked = true,
            likesCount = 2923,
            commentsCount = 121,
            comment = "PPpppd..."
        ),
        Reel(
            id = 3,
            video = "icecream.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/3.png",
            userName = "Phristian Duned",
            isLiked = true,
            likesCount = 3314,
            comment = "Errrrsaa....",
            commentsCount = 300
        ),
        Reel(
            id = 4,
            video = "soap-bubbles.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/6.png",
            userName = "Chak Phon",
            isLiked = true,
            likesCount = 386,
            comment = "Tfddss.....",
            commentsCount = 900
        ),
        Reel(
            id = 5,
            video = "castle.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/2.png",
            userName = "Pavid Pulkader",
            isLiked = true,
            likesCount = 4890,
            comment = "Kerjaan di tengah hutan",
            commentsCount = 432
        )

    )
}

data class Reel(
    val id: Int,
    private val video: String,
    val userImage: String,
    val userName: String,
    val isLiked: Boolean = false,
    val likesCount: Int,
    val comment: String,
    val commentsCount: Int
) {

    fun getVideoUrl(): Uri {
        return Uri.parse("asset:///${video}")
    }

}