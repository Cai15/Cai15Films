package com.example.cai15films

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cai15films.databinding.FilmItemBinding

//В конструктор класс передается layout, который мы создали(film_item.xml)
class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var binding: FilmItemBinding
    //Привязываем view из layout к переменным
    private val title = binding.title
    private val poster = binding.poster
    private val description = binding.description



    //В этом методе кладем данные из film в наши view
    fun bind(film: Film) {
        //Устанавливаем заголовок
        title.text = film.title
        //Устанавливаем постер
        poster.setImageResource(film.poster)
        //Устанавливаем описание
        description.text = film.description
    }
}