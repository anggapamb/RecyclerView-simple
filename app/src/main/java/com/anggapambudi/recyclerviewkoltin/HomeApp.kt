package com.anggapambudi.recyclerviewkoltin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.sdk27.coroutines.onClick

class HomeApp : AppCompatActivity() {

    //onclick belum

    lateinit var rv_item: RecyclerView
    lateinit var adapter: ListRumahAdatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_app)
        init()
        rv_item.layoutManager = LinearLayoutManager(this)
        rv_item.adapter = adapter

    }
    private fun init() {
        rv_item = findViewById(R.id.rv_item)

        val data = ArrayList<RumahAdat>()
        data.add(RumahAdat("Rumah Joglo, Jawa","Rumah adat ini merupakan ciri khas rumah adat di daerah Jawa. Rumah ini terbagi dalam beberapa area seperti pendapa, pringgitan, dalem, sentong, gandok tengen, dan gandok kiwo. Pada bagian pendapa pada rumah joglo digunakan sebagai ruangan pertemuan untuk acara besar karena tidak memiliki sekat. Bisa juga dijadikan tempat pagelaran kesenian. Di area pendapa inilah ciri khas rumah joglo terlihat dengan adanya struktur konstruksi soko guru pada kolom utamanya. Lalu pada bagian pringgitan digunakan sebagai area penghubung antara pendopo dengan rumah dalem biasa digunakan juga sebagai ruang tamu. Sedangkan bagian dalem adalah ruangan bersantai keluarga yang merupakan area privasi pemilik rumah.", R.drawable.joglo))
        data.add(RumahAdat("Rumah Krong Bade, Aceh", "Rumah adat Krong Bade biasa disebut juga rumoh aceh. Ciri khas rumah ini adalah memiliki tangga didepan rumah yang digunakan sebagai jalan masuk ke dalam rumah. Uniknya lagi anak tangga di rumah ini berjumlah ganjil. Rumah krong bade mengaplikasikan bangunan menjulur dari timur ke barat mengambil garis imajiner ke arah Ka'bah. Model rumah panggung satu ini ditinggikan sekitar 2,5 meter hingga 3 meter. Dinding rumah terbuat dari kayu dan dihiasi dengan lukisan. Pada bagian atap rumahnya, diberikan material daun rumbia. Sedangkan untuk lantai terbuat dari bambu atau enau. Salah satu keunikan lainnya adalah pintu rumah dibuat lebih pendek yaitu 1,2 meter hingga 1,5 meter. Hal ini bertujuan agar orang yang memasuki rumah ini memberikan salam hormat pada pemilik rumah tanpa mengenal sosial ataupun kasta.", R.drawable.krongbade))
        data.add(RumahAdat("Rumah Gadang, Sumatera Barat", "Rumah bagonjong atau rumah godang merupakan sebutan lain bagi rumah adat asal Sumatera Barat ini. Keunikannya paling terlihat jelas dan menonjol pada bagian atap yang memiliki bentukan seperti tanduk pada ujung atapnya. Ruangan di dalam rumah ini tidak memiliki sekat kecuali pada kamar tidurnya. Sebagai rumah bersama, rumah gadang dilambangkan sebagai kehadiran suatu kaum. Pada bagian depan rumah biasanya dilengkapi dengan ukiran ornamen dan umumnya bermotif akar, bunga, daun dan bidang persegi empat serta genjang. Setiap elemen di rumah ini mempunyai makna tersendiri. Dapur di rumah ini dibangun terpisah pada bagian belakang rumah yang didempet pada dinding.", R.drawable.gadang))
        data.add(RumahAdat("Rumah Rakit, Bangka Belitung", "Keunikan rumah ini terletak pada posisi dan bentuknya. Seperti namanya, rumah ini mirip dengan rakit dan dibangun di atas sungai. Karena hal tersebutlah rumah adat satu ini juga populer di kota Palembang. Pembangunan rumah ini di atas sungai karena sungai dianggap sebagai sumber mata pencaharian dan sumber makanan bagi masyarakat. Material yang digunakan berupa bambu jenis mayan yang dapat mengambang di air dan juga digunakan untuk dindingnya. Lalu adapun balok kayu, papan sebagai dinding. Sedangkan atapnya menggunakan ulit yang dianyam. Salah satu bahan utamanya adalah rotan sebagai pengikat bambu-bambu dan bagian atas rumah rakit.", R.drawable.rakit))
        data.add(RumahAdat("Rumah Gapura Candi Bentar, Bali", "Nah untuk rumah yang satu ini pasti dengan mudah dikenali karena gapuranya yang khas! Rumah adat asal Bali ini menyerupai bentukan pura dan gapura di bagian depannya. Tentunya memang desainnya kental dengan budaya dan agamanya. Rumah adat ini pun sangat mudah ditemukan di Bali. Masyarakat Bali memang sangat menjaga harta kebudayaannya. Dari materialnya, bahan bangunan akan bergantung pada tingkat kemapanan tiap pemilik. Pada masyarakat biasa, spesi dari lumpur tanah liat pun bisa dijadikan dinding bangunan namun untuk golongan atas menggunakan batu bata. Tempat suci", R.drawable.gapura))
        data.add(RumahAdat("Rumah Tongkonan, Sulawesi Selatan", "Tongkonan merupakan rumah adat masyarakat Toraja. Ciri khas atap melengkung yang menyerupai seperti perahu tersusun oleh bambu. Di bagian depan rumah ini terdapat deretan tanduk kerbau. Pada bagian dalam rumah dijadikan tempat tidur dan dapur. Sedangkan pada depan rumahnya terdapat lumbung padi. Tongkonan dibagi berdasarkan tingkatan atau strata sosial di toraja ini. Struktur panggung juga menjadi andalan rumah adat ini. Tiang bulat yang menjadi penyangga lantai dinding dan atap tersebut tidak ditanam dalam tanah namun langsung diletakkan pada batu berukuran besar yang dipahat berbentuk persegi. Sedangkan pada papan dinding dan lantai direkatkan tanpa paku namun dengan diikat atau ditumpuk dengan sistem kunci. Dengan sistem tersebut pun rumah dapat bertahan puluhan tahun. Keren bukan.", R.drawable.tonkonan))
        data.add(RumahAdat("Rumah Lamin, Kalimantan Timur", "Rumah adat ini dibangun oleh masyarakat suku asli Kalimantan yaitu suku Dayak Timur. Ciri khas bangunan yang satu ini adalah berbagai corak ornamen yang terlihat di setiap sisi rumah. Rumah lamin ini juga menjadi rumah adat terbesar di Indonesia dengan panjang 300 meter, lebar 15 meter, dan tinggi kurang lebih 3 meter. Penghuni rumah ini pun bisa mencapai 12 hingga 30 kepala keluarga. Terdapat dua macam tiang di rumah ini yaitu tiang penopang lantai dan penyangga atap. Pada halaman depan rumah ini dilengkapi dengan patung totem yang dipercaya sebagai dewa oleh suku Dayak. Warna yang diterapkan pada rumah ini pun memiliki arti tersendiri. Warna kuning melambangkan kewibawaan, merah keberanian, biru kesetiaan, dan putih kebersihan jiwa.", R.drawable.lamin))
        data.add(RumahAdat("Rumah Banjar Bubungan Tinggi, Kalimantan Selatan", "Rumah bubungan tinggi merupakan salah satu rumah suku Banjar yanng menjadi ikon provinsi Kalimantan Selatan. Bentuknya yang memanjang memang menjadi ciri khas rumah yang menyesuaikan dengan fungsi ruangnya. Atapnya yang tiba-tiba meninggi pun menjadi hal yang ikonik dari rumah ini. Bahan konstruksi yang digunakan untuk rumah ini adalah kayu.", R.drawable.banjar))
        data.add(RumahAdat("Rumah Sasak, Lombok", "Lombok yang tidak kalah indahnya dengan pulau Bali ini tidak  hanya menunjukkan alam yang menarik saja namun juga kebudayaannya. Salah satunya adalah rumah adat sasak yang memiliki bentuk dan material yang unik. Dindingnya yang terbuat dari anyaman dan atap rumah yang terbuat dari jerami atau akar alang-alang. Sedangkan pada lantainya menggunakan campuran batu bata, abu jerami dan juga getah pohon. Rumah adat ini memiliki posisi penting di kehidupan manusia karena menjadi tempat privasi keluarga dan juga untuk memenuhi kebutuhan spiritualnya. Setiap ruang terbagi berdasarkan kegunaannya.", R.drawable.sasak))
        data.add(RumahAdat("Rumah Mbaru Niang, Wae Rebo NTT", "Rumah adat yang langka satu ini hanya terdapat di salah satu desa terpencil daerah Pegunungan di Pulau Flores. Bentuknya yang unik mengerucut dengan tinggi 15 meter dan terdapat 5 lantai di dalamnya. Usaha pengkonservasian Mbaru Niang juga mendapat penghargaan tertinggi dengan kategori warisan budaya dari UNESCO Asia Pasifik tahun 2012. Yori Antar pun sebagai salah satu arsitek terkemuka di Indonesia turut ambil andil dalam konservasi rumah adat ini. Dalam pembangunannya, tiang ditanam ke dalam tanah sebesar 1,5 meter hingga 2 meter. Dengan lantai dasar berbentuk panggung, 1,2 dari tanah. Tiang setiap lantai tidak menerus namun dipasang terputus dan diikat. Rotan digunakan sebagai pengikat antar baloknya. Kelima lantai dalam rumah tersebut memiliki fungsi masing-masing. Lantai dasar sebagai tempat tinggal dan berkumpul, kedua untuk menyimpan bahan makanan dan barang-barang. Kemudian di lantai ketiga tempat menyimpan benih-benih tanaman pangan seperti padi jagung. Lantai keempat untuk stok pangan jika terjadi kekeringan dan lantai paling atas digunakan untuk tempat sesajian persembahan kepada leluhur.", R.drawable.mbaruniang))

        adapter = ListRumahAdatAdapter(data)

    }


}