package com.example.developermulticamp.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.developermulticamp.R
import com.example.developermulticamp.data.Community
import com.example.developermulticamp.data.RetrofitProvider
import kotlinx.android.synthetic.main.fragment_community.*
import kotlinx.coroutines.launch

class CommunityFragment : Fragment(R.layout.fragment_community) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val response= RetrofitProvider.newsApi.getmulticampCommunities("multicamp/communities/")
            response.community[3].banner


            recyclerViewArticles.adapter=
                ArticlesAdapter(response.community.orEmpty().toMutableList()){
                    val direction= CommunityFragmentDirections.actionCommunityFragmentToArticleFragment(it)
                    findNavController().navigate(direction)


        }
    }
}