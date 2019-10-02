package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AriPurnamaAJi : Contributor{
    override val idGithub: String
        get() = "@ariaji25"
    override val name: String
        get() = "Ari Purnama Aji"
    override val photoUrl: String?
        get() = "https://scontent.fdps5-1.fna.fbcdn.net/v/t1.0-9/34482003_2002175153336562_3544921141166473216_n.jpg?_nc_cat=111&_nc_oc=AQn1oM97m-1avZgytPHJNbqdpy1WUkPVwv9x3dz7jCjg3lMBK1EYCJfEB17b67y4xrs&_nc_ht=scontent.fdps5-1.fna&oh=3beaa55704b12fa52bca261d2ab2889e&oe=5E3CF1F2"
    override val currentJob: String?
        get() = "Android Developer"
    override val email: String?
        get() = "ari.purnama838@gmail.com"
    override val descriptions: String?
        get() = "I am Junior Developer, I am satart Join into Android Development on 2019 start with Java Android, and Flutter for Mobile.\n " +
                "After that I am join into Lumbung Inovasi to get more experience, and I join every project that I can to work with Android Development "
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/ari-aji-29208b180/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/9967898/ari-purnama"
    override val idTelegram: String?
        get() = "@ariaji25"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("C"),
            Skills("C++"),
            Skills("Python"),
            Skills("Kotlin"),
            Skills("PHP"),
            Skills("Flutter for Mobile"),
            Skills("Android Java"),
            Skills("Android Kotlin")
        )
    override val location: String?
        get() = "Mataram, Nusa Tenggara Barat, Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Android Developer",
                "Lumbung Inovasi",
                "join every project that I can work for Android Development",
                "2019",
                "-")
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academy",
                "Beginner",
                "2019",
                "Belajar Membuat Aplikasi Android untuk Pemula"
                ),
            Educations(
                "Universitas Mataram",
                "Undergraduate",
                "2016",
                "Informatics Engenering"
            )
        )
    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object{
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ariaji25"] = AriPurnamaAJi()
        }
    }
}