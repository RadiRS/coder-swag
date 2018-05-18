package com.radirusadi.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.radirusadi.coderswag.Model.Category
import com.radirusadi.coderswag.R

class CategoryAdapter(context : Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, converView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder //use for recylce the list and optimitation

        if (converView == null) {
            //initial category content
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        } else {
            //if the converview already add and just use viewholder to recyle the view
            holder = converView.tag as ViewHolder
            categoryView = converView
        }



        val category = categories[position]
        //get resource image from drawable
        val resouceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.categoryImage?.setImageResource(resouceId)
        holder.categoryName?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}