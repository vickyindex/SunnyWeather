package com.sunnyweather.android.ui.place

import androidx.lifecycle.*

import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.dao.PlaceDao
import com.sunnyweather.android.logic.model.Place

class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()
    //定义placeList集合
    val placeList = ArrayList<Place>()
    //将传入的搜索参数赋值
    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
    //直接调用仓库层中相应的接口并返回
    fun savePlace(place: Place)=Repository.savePlace(place)
    fun getSavedPlace()= PlaceDao.getSavedPlace()
    fun isPlaceSaved()= PlaceDao.isPlaceSaved()
}