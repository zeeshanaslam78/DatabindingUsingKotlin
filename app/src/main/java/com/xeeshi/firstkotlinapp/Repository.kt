package com.xeeshi.firstkotlinapp

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by ZEESHAN on 29/10/2017.
 */
class Repository(
        repositoryName : String,
        repositoryOwner: String,
        numberOfStars: String,
        var hasIssues: Boolean = false) : BaseObservable() {

    @get:Bindable
    var repositoryName : String = repositoryName
    set(value) {
        field = value
        notifyPropertyChanged(BR.repositoryName)
    }

    @get:Bindable
    var repositoryOwner: String = repositoryOwner
    set(value) {
        field = value
        notifyPropertyChanged(BR.repositoryOwner)
    }

    @get:Bindable
    var numberOfStars: String = numberOfStars
    set(value2) {
        field = value2
        notifyPropertyChanged(BR.numberOfStars)
    }



}

