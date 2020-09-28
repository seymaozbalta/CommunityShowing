package com.example.developermulticamp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.developermulticamp.news.CommunityFragment
import kotlinx.android.synthetic.main.fragment_information.*

class InformationFragment : Fragment(R.layout.fragment_information) {
    private val args by navArgs<CommunityFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewDescription.text= args.community.description
        textViewCommunityLeader.text= args.community.leader.name
        imageViewLeader.imageTintMode=args.community.leader.photo
        imageViewBanner.imageTintMode=args.community.banner


    }


}