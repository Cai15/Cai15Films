package com.example.cai15films


import android.content.res.Resources
import android.graphics.Rect
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.cai15films.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var filmsAdapter: FilmListRecyclerAdapter

    val filmsDataBase = listOf(
        Film("1+1", R.drawable.odin_odin, "Аристократ на коляске нанимает в сиделки бывшего заключенного. Искрометная французская комедия с Омаром Си"),
        Film("Бойцовский коуб", R.drawable.boi_klub, "Страховой работник разрушает рутину своей благополучной жизни. Культовая драма по книге Чака Паланика"),
        Film("Иван Васильевич меняет профессию (1973)", R.drawable.ivan_prof, "Иван Грозный отвечает на телефон, пока его тезка-пенсионер сидит на троне. Советский хит о липовом государе"),
        Film("Шерлок Холмс и доктор Ватсон: Знакомство (ТВ, 1979)", R.drawable.sherlock_holms, "Увлекательные приключения самого известного сыщика всех времен"),
        Film("Ходячий замок (2004)", R.drawable.hodit_zamok, "Анимэ"),
        Film("Операция «Ы» и другие приключения Шурика (1965)", R.drawable.oper_i, "Похождения хронически оптимистичного очкарика. Блистательная комедия Леонида Гайдая"),
        Film("Матрица (1999)", R.drawable.matrica, "Жизнь Томаса Андерсона разделена на две части: днём он — самый обычный офисный работник, получающий нагоняи от начальства, а ночью превращается в хакера по имени Нео, и нет места в сети, куда он бы не смог проникнуть. Но однажды всё меняется. Томас узнаёт ужасающую правду о реальности."),

        )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }

        binding.bottomNavigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.watch_later -> {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.selections -> {
                    Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }

    }

    class TopSpacingItemDecoration (private val paddingInDp: Int): RecyclerView.ItemDecoration() {
        private val Int.convertPx: Int
            get() = (this * Resources.getSystem().displayMetrics.density).toInt()

        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.top = paddingInDp.convertPx
            outRect.right = paddingInDp.convertPx
            outRect.left = paddingInDp.convertPx

        }
    }






}